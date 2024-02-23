package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class GuerreroHabilidad implements HabilidadAsignable {

    private Map <Habilidad, Integer> habilidadesGuerrero = new HashMap<>();

    @Override
    public void asignarHabilidades(int espadaAfilada, int golpeDefinitivo, int escudoProtector) {
    habilidadesGuerrero.put(Habilidad.ESPADA_AFILADA, espadaAfilada);
    habilidadesGuerrero.put(Habilidad.GOLPE_DEFINITIVO, golpeDefinitivo);
    habilidadesGuerrero.put(Habilidad.ESCUDO_PROTECTOR, escudoProtector);
    }
    
}
