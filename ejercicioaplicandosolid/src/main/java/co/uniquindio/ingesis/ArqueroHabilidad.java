package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class ArqueroHabilidad implements HabilidadAsignable{

    private Map<Habilidad,Integer> habilidadesArquero = new HashMap<>();

    @Override
    public void asignarHabilidades(int disparoRapido, int flechaVenenosa, int tiroCertero) {
       habilidadesArquero.put(Habilidad.DISPARO_RAPIDO, disparoRapido);
       habilidadesArquero.put(Habilidad.FLECHA_VENENOSA, flechaVenenosa);
       habilidadesArquero.put(Habilidad.TIRO_CERTERO, tiroCertero);
    }
    
}
