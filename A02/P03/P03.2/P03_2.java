import java.util.*;

/*
 * Este programa simula una persona comiendo o bebiendo alimentos como en un juego.
 */

public class P03_2 {
    public static void main(String[] args) {
        // Definir diferentes tipos de comida/bebida
        // No nos interesa cambiar la comida una vez creada
        final Comida lentejas = new Comida("lentejas", TipoComida.comida, 53, 10);
        final Comida sopa = new Comida("sopa", TipoComida.comida, 40, 20);
        final Comida pan = new Comida("pan", TipoComida.comida, 40, -20);
        final Comida agua = new Comida("agua", TipoComida.bebida, 0, 50);

        Persona p1 = new Persona("Serafi", "Nebot Ginard", 60, 30);
        p1.mostrarNiveles();
        p1.comer(pan);
        pan.mostrarValores();
        
        p1.mostrarNiveles();
        p1.comer(sopa);
        sopa.mostrarValores();

        p1.mostrarNiveles();
        p1.comer(lentejas);
        lentejas.mostrarValores();

        p1.mostrarNiveles();
        p1.comer(agua);
        agua.mostrarValores();
        p1.mostrarNiveles();
    } 
}
