package logoparsing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mar on 29/04/2016.
 */
public class VariableMap {
    private Map<String,Double> variableMap;


    public VariableMap() {
        this.variableMap = new HashMap<>();
    }


    public Double getElement(String idVariable){
        return variableMap.get(idVariable);
    }

    public void createVariable(String idVariable, Double value){
        variableMap.put(idVariable,value);
    }
}
