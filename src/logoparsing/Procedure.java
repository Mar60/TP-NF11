package logoparsing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mar on 20/05/2016.
 */
public class Procedure {

    public LogoParser.Liste_instructionsContext listeInstructions;
    public List<String> listParametres;

    public Procedure() {
        this.listeInstructions = null;
        this.listParametres = new ArrayList<>();
    }

    public void addParameter(String parameter){
        listParametres.add(parameter);
    }

    public void setListeInstructions(LogoParser.Liste_instructionsContext listeInstructions) {
        this.listeInstructions = listeInstructions;
    }
}
