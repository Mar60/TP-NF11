package logoparsing;

import javafx.scene.Group;

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

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Integer> atts = new ParseTreeProperty<Integer>();

	public LogoTreeVisitor() {
		super();
	}
	public void initialize(Group g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	public void setAttValue(ParseTree node, int value) { 
		atts.put(node, value);
	}
	public int getAttValue(ParseTree node) { return atts.get(node); }
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.avance(getAttValue(ctx.INT()));
		Log.appendnl("visitAv");
		return 0;
	}
	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.recule(getAttValue(ctx.INT()));
		Log.appendnl("visitRe");
		return 0;
	}
	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.td(getAttValue(ctx.INT()));
		Log.append("visitTd\n" );
		return 0;
	}
	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.tg(getAttValue(ctx.INT()));
		Log.append("visitTg\n" );
		return 0;
	}
	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		String intTextX = ctx.INT().get(0).getText(); 
		String intTextY = ctx.INT().get(1).getText(); 
		setAttValue(ctx.INT().get(0), Integer.valueOf(intTextX));
		setAttValue(ctx.INT().get(1), Integer.valueOf(intTextY));
		traceur.changePos(getAttValue(ctx.INT().get(0)), getAttValue(ctx.INT().get(1)));
		Log.append("visitFpos\n" );
		return 0;
	}
	@Override
	public Integer visitLc(LcContext ctx) {
		traceur.leveCrayon();
		Log.append("visitLc\n" );
		return 0;
	}
	
	public Integer visitBc(BcContext ctx) {
		traceur.baisseCrayon();
		Log.append("visitBc\n" );
		return 0;
	}
	
	public Integer visitVe(VeContext ctx) {
		traceur.videEcran();
		Log.append("visitVe\n" );
		return 0;
	}
	
	public Integer visitFcc(FccContext ctx) {
		traceur.changeCouleur();
		Log.append("visitFcc\n" );
		return 0;
	}
}
