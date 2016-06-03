package prelogoparsing;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import prelogoparsing.PreLogoParser.PrestatContext;

public class LogoGenerator extends PreLogoBaseVisitor<Integer> {
	STGroup group = new STGroupFile("templates/prelogo.stg");
	ST logost = group.getInstanceOf("logo");

	public LogoGenerator() {
		super();
	}
	public String render() {
		return logost.render();
	}
	@Override
	public Integer visitPrestat(PrestatContext ctx) {
		visitChildren(ctx);
		return 0;
	}

	@Override
	public Integer visitImpt(PreLogoParser.ImptContext ctx) {
		visitChildren(ctx);
		ST temp = group.getInstanceOf(ctx.ID().getText());
		logost.add("procedures",temp);
		return 0;
	}

	@Override
	public Integer visitCommande(PreLogoParser.CommandeContext ctx) {
		visitChildren(ctx);
		Command command = new Command();

		command.id = ctx.ID().getText();
		if(ctx.INT(2)!=null)
			command.couleur = new Integer(ctx.INT(2).getText());

		if(ctx.facteur()!=null)
			command.facteur = new Integer(ctx.facteur().INT().getText());

		command.paramA =  new Integer(ctx.INT(0).getText());
		command.paramB =  new Integer(ctx.INT(1).getText());

		logost.add("commandes",command);
		return 0;
	}





}
