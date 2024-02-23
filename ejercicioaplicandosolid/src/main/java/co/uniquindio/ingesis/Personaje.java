package co.uniquindio.ingesis;

import java.util.HashSet;
import java.util.Set;

public class Personaje {

    private static Set<String> nombresUnicos = new HashSet<>();
    private String nombreDelPersonaje;
    private ClasePersonaje tipoDePersonaje;
    private AtributoAsignable atributosAsignables;
    private HabilidadAsignable habilidadesAsignables;

    public Personaje (String nombreDelPersonaje, ClasePersonaje tipoDPersonaje){
        if (nombresUnicos.contains(nombreDelPersonaje)) {
            throw new IllegalArgumentException("El nombre " + nombreDelPersonaje + " ya está en uso.");
        }
        this.nombreDelPersonaje= nombreDelPersonaje;
        this.tipoDePersonaje = tipoDPersonaje;
        asignarAtributosYHabilidades();
        nombresUnicos.add(nombreDelPersonaje);

    }

    private void asignarAtributosYHabilidades (){
        switch (tipoDePersonaje) {
            case GUERRERO:
                atributosAsignables = new GuerreroAtributo();
                habilidadesAsignables = new GuerreroHabilidad();
            case MAGO:
                atributosAsignables = new MagoAtributo();
                habilidadesAsignables = new MagoHabilidad();
                break;
            case ARQUERO:
                atributosAsignables = new ArqueroAtributo();
                habilidadesAsignables = new ArqueroHabilidad();
                break;
            default:
                throw new IllegalArgumentException("Clase de personaje no válida");
        }
    }

    public void asignarAtributos(int valor1, int valor2, int valor3) {
        atributosAsignables.asignarAtributos(valor1, valor2, valor3);
    }

    public void asignarHabilidades(int valor1, int valor2, int valor3) {
        habilidadesAsignables.asignarHabilidades(valor1, valor2, valor3);
    }

    @Override
    public String toString() {
        return "Personaje [nombreDelPersonaje=" + nombreDelPersonaje + ", tipoDePersonaje=" + tipoDePersonaje
                + ", atributosAsignables=" + atributosAsignables + ", habilidadesAsignables=" + habilidadesAsignables
                + "]";
    }

    
}
