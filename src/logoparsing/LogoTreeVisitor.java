package logoparsing;

import javafx.scene.Group;

import org.antlr.v4.runtime.misc.DoubleKeyMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import logogui.Log;
import logogui.Traceur;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.BcContext;
import logoparsing.LogoParser.VeContext;
import logoparsing.LogoParser.FccContext;

import java.util.Random;
import java.util.Stack;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Double> atts = new ParseTreeProperty<Double>();
	Stack<Double> pileRepete = new Stack<>();

	public LogoTreeVisitor() {
		super();
	}
	public void initialize(Group g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	public void setAttValue(ParseTree node, double value) {
		atts.put(node, value);
	}
	public double getAttValue(ParseTree node) { return atts.get(node); }
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		traceur.avance(getAttValue(ctx.exp()));
		Log.appendnl("visitAv");
		return 0;
	}
	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		traceur.recule(getAttValue(ctx.exp()));
		Log.appendnl("visitRe");
		return 0;
	}
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.exp()));
		Log.append("visitTd\n" );
		return 0;
	}
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.exp()));
		Log.append("visitTg\n" );
		return 0;
	}
	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		/*String intTextXSign = ctx.SIGN().get(0).getText();
		String intTextX = ctx.INT().get(0).getText();

		String intTextYSign = ctx.SIGN().get(1).getText();
		String intTextY = ctx.INT().get(1).getText();

		setAttValue(ctx.INT().get(0), Integer.valueOf(intTextXSign + intTextX));
		setAttValue(ctx.INT().get(1), Integer.valueOf(intTextYSign + intTextY));
		traceur.changePos(getAttValue(ctx.INT().get(0)), getAttValue(ctx.INT().get(1)));*/

		traceur.changePos(getAttValue(ctx.atom(0)), getAttValue(ctx.atom(1)));
		Log.append("visitFpos\n" );
		return 0;
	}
	@Override
	public Integer visitLc(LcContext ctx) {
		traceur.leveCrayon();
		Log.append("visitLc\n" );
		return 0;
	}
	@Override
	public Integer visitBc(BcContext ctx) {
		traceur.baisseCrayon();
		Log.append("visitBc\n" );
		return 0;
	}
	@Override
	public Integer visitVe(VeContext ctx) {
		traceur.videEcran();
		Log.append("visitVe\n" );
		return 0;
	}

	@Override
	public Integer visitFcc(FccContext ctx) {
		visitChildren(ctx);
		traceur.changeCouleur(getAttValue(ctx.exp()));
		Log.append("visitFcc\n" );
		return 0;
	}


	@Override
	public Integer visitMult(LogoParser.MultContext ctx) {
		visitChildren(ctx);
		Double left =  getAttValue(ctx.exp(0));
		Double right = getAttValue(ctx.exp(1));
		setAttValue(ctx, ctx.getChild(1)
				.getText().equals("*") ?
				left * right
				: left / right);
		Log.append("visitMult\n" );
		return 0;
	}

	@Override
	public Integer visitSum(LogoParser.SumContext ctx) {
		visitChildren(ctx);
		Double left = getAttValue(ctx.exp(0));
		Double right = getAttValue(ctx.exp(1));
		setAttValue(ctx, ctx.getChild(1)
				.getText().equals("+") ?
				left + right
				: left - right);
		Log.append("visitSum\n" );
		return 0;
	}

	@Override
	public Integer visitArule(LogoParser.AruleContext ctx) {
		visit(ctx.atom());
		setAttValue(ctx, getAttValue(ctx.atom()));
		return 0;
	}

	@Override
	public Integer visitInt(LogoParser.IntContext ctx) {
		String intText = ctx.INT().getText();
		setAttValue(ctx, Double.valueOf(intText));
		return 0;
	}

	@Override
	public Integer visitParent(LogoParser.ParentContext ctx) {
		visit(ctx.exp());
		setAttValue(ctx, getAttValue(ctx.exp()));
		return 0;
	}

	@Override
	public Integer visitHasard(LogoParser.HasardContext ctx) {
		visit(ctx.exp());
		double value = getAttValue(ctx.exp());
		double nombreAleatoire = (Math.random() * (value + 1));
		setAttValue(ctx, nombreAleatoire);
		return 0;
	}

	@Override
	public Integer visitRepete(LogoParser.RepeteContext ctx) {
		visit(ctx.getChild(1));
		double nbIteration = getAttValue(ctx.exp());
		for(int i = 0; i < (int)nbIteration ; i++){
			pileRepete.push((double) i);
			visit(ctx.liste_instructions());
			pileRepete.pop();
		}
		Log.append("visitRepete\n" );
		return 0;
	}

	@Override
	public Integer visitLoop(LogoParser.LoopContext ctx) {
		double value = 0;
		if(!pileRepete.isEmpty())
			value = pileRepete.peek();
		setAttValue(ctx, value);
		return 0;
	}

	@Override
	public Integer visitSigInt(LogoParser.SigIntContext ctx) {
		visitChildren(ctx);
		String signedIntText = ctx.getChild(0).getText() + ctx.INT().getText() ;
		setAttValue(ctx, Double.valueOf(signedIntText));
		Log.append("visitSigInt\n" );
		return 0;
	}
}
