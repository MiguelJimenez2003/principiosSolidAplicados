package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class MagoHabilidad implements HabilidadAsignable{

    private Map<Habilidad, Integer> habilidadesMago = new HashMap<>();

    @Override
    public void asignarHabilidades(int bolaFuego, int rayoElectrico, int hechizoCuracion) {
        habilidadesMago.put(Habilidad.BOLA_DE_FUEGO, bolaFuego);
        habilidadesMago.put(Habilidad.RAYO_ELECTRICO, rayoElectrico);
        habilidadesMago.put(Habilidad.HECHIZO_DE_CURACION, hechizoCuracion);
    }
    
}
