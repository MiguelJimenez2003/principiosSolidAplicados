package co.uniquindio.ingesis;

import java.util.HashMap;
import java.util.Map;

public class MagoAtributo implements AtributoAsignable{

    private Map<Atributo, Integer> atributosMago = new HashMap<>();

    @Override
    public void asignarAtributos(int inteligencia, int sabiduria, int energiaMagica) {
    atributosMago.put(Atributo.INTELIGENCIA, inteligencia);
    atributosMago.put(Atributo.SABIDURIA, sabiduria);
    atributosMago.put(Atributo.ENERGIA_MAGICA, energiaMagica);
    }
    
}
