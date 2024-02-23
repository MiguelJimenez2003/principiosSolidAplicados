package co.uniquindio.ingesis;

public class Jugador {
    
    public static void main(String[] args) {
    
        Personaje personaje1 = new Personaje("Miguel", ClasePersonaje.GUERRERO);
        
        personaje1.asignarAtributos(10, 20, 30);
        personaje1.asignarHabilidades(40, 50, 60);
        System.out.println(personaje1.toString());

        Personaje mago = new Personaje("Mago1", ClasePersonaje.MAGO);
        mago.asignarAtributos(70, 80, 90);
        mago.asignarHabilidades(100, 110, 120);
        System.out.println(mago.toString());

        Personaje arquero = new Personaje("Arquero1", ClasePersonaje.ARQUERO);
        arquero.asignarAtributos(130, 140, 150);
        arquero.asignarHabilidades(160, 170, 180);
        System.out.println(arquero.toString());


    }

}
