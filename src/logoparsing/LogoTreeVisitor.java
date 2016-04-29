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
	VariableMap variableMap = new VariableMap();

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

	@Override
	public Integer visitDonne(LogoParser.DonneContext ctx) {
		visitChildren(ctx);
		String variableId = ctx.ID().toString();
		Double value = getAttValue(ctx.exp());
		variableMap.createVariable(variableId,value);
		Log.append("visitDonne "+variableId +" : "+value+"\n" );
		return 0;
	}

	@Override
	public Integer visitVariable(LogoParser.VariableContext ctx) {
		visitChildren(ctx);
		String variableId = ctx.ID().toString();
		setAttValue(ctx,variableMap.getElement(variableId));
		Log.append("visitVariable\n" );
		return 0;
	}

	@Override
	public Integer visitBoolOperation(LogoParser.BoolOperationContext ctx) {
		visitChildren(ctx);
		Double left = getAttValue(ctx.exp(0));
		Double right = getAttValue(ctx.exp(1));
		String booleanOperator = ctx.getChild(1).toString();
		Integer resultOperation;

		int compare = left.compareTo(right);
		switch (booleanOperator){
			case "<":
				resultOperation = (compare < 0)? 1 : 0;
				break;
			case ">":
				resultOperation = (compare > 0)? 1 : 0;
				break;
			case "<=":
				resultOperation = (compare <= 0)? 1 : 0;
				break;
			case ">=":
				resultOperation = (compare >= 0)? 1 : 0;
				break;
			case "!=":
				resultOperation = (compare != 0)? 1 : 0;
				break;
			case "==":
				resultOperation = (compare == 0)? 1 : 0;
				break;
			default:
				resultOperation = 0;
		}
		setAttValue(ctx, resultOperation);
		Log.append("visitBoolOperation : "+resultOperation+"\n" );
		return 0;
	}


	@Override
	public Integer visitSi(LogoParser.SiContext ctx) {
		visit(ctx.getChild(1));
		int isConditionTrue = (int) getAttValue(ctx.expbool());

		if(isConditionTrue == 1){
			visit(ctx.liste_instructions(0));
		}
		else if(isConditionTrue == 0 ){
			if(ctx.liste_instructions().size()==2) {
				visit(ctx.liste_instructions(1));
			}
		}
		Log.append("visitSi\n" );
		return 0;
	}

	@Override
	public Integer visitTantque(LogoParser.TantqueContext ctx) {
		visit(ctx.getChild(1));
		int isConditionTrue = (int) getAttValue(ctx.expbool());
		while(isConditionTrue==1){
			visit(ctx.liste_instructions());
			visit(ctx.getChild(1));
			isConditionTrue = (int) getAttValue(ctx.expbool());
		}
		Log.append("visitTantque\n" );
		return 0;
	}

	@Override
	public Integer visitLogiqueEt(LogoParser.LogiqueEtContext ctx) {
		visitChildren(ctx);
		int rightBool = (int) getAttValue(ctx.expbool(0));
		int leftBool = (int) getAttValue(ctx.expbool(1));
		setAttValue(ctx, (rightBool==1 && leftBool==1)? 1 : 0);
		Log.append("visitLogiqueEt\n" );
		return 0;
	}

	@Override
	public Integer visitLogiqueOu(LogoParser.LogiqueOuContext ctx) {
		visitChildren(ctx);
		int rightBool = (int) getAttValue(ctx.expbool(0));
		int leftBool = (int) getAttValue(ctx.expbool(1));
		setAttValue(ctx, (rightBool==1 || leftBool==1)? 1 : 0);
		Log.append("visitLogiqueOu\n" );
		return 0;
	}

	@Override
	public Integer visitLogiqueParent(LogoParser.LogiqueParentContext ctx) {
		visit(ctx.getChild(1));
		setAttValue(ctx, getAttValue(ctx.expbool()));
		Log.append("visitLogiqueParent\n" );
		return 0;
	}
}
