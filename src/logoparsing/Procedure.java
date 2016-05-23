package logoparsing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mar on 20/05/2016.
 */
public class Procedure {

    public LogoParser.Liste_instructionsContext listeInstructions;
    public List<String> listParametres;
    public LogoParser.RendsContext noeudRends; 
    
    public Procedure() {
        this.listeInstructions = null;
        this.listParametres = new ArrayList<>();
        this.noeudRends = null;
    }

    public void addParameter(String parameter){
        listParametres.add(parameter);
    }

    public void setListeInstructions(LogoParser.Liste_instructionsContext listeInstructions) {
        this.listeInstructions = listeInstructions;
    }

	public LogoParser.RendsContext getNoeudRends() {
		return noeudRends;
	}

	public void setNoeudRends(LogoParser.RendsContext noeudRends) {
		this.noeudRends = noeudRends;
	}
    
    
}
