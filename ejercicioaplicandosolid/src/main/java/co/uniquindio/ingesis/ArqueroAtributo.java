package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class ArqueroAtributo implements AtributoAsignable {

    private Map<Atributo, Integer> atributosArquero = new HashMap<>();

    @Override
    public void asignarAtributos(int destreza, int agilidad, int precision) {
        atributosArquero.put(Atributo.DESTREZA, destreza);
        atributosArquero.put(Atributo.AGILIDAD, agilidad);
        atributosArquero.put(Atributo.PRECISION, precision);
    }
    
}
