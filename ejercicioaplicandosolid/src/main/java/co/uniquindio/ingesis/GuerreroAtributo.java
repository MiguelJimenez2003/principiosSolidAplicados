package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class GuerreroAtributo implements AtributoAsignable{

    private Map<Atributo, Integer> atributosGuerrero = new HashMap<>();

    @Override
    public void asignarAtributos(int fuerza, int resistencia, int vitalidad) {
        atributosGuerrero.put(Atributo.FUERZA, fuerza);
        atributosGuerrero.put(Atributo.RESISTENCIA, resistencia);
        atributosGuerrero.put(Atributo.VITALIDAD, vitalidad);
    }
    
}
