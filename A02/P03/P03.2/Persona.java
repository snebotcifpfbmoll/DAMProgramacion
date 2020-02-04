import java.util.*;

public class Persona {
    private String nombre;
    private String apellidos;
    private int nivelComida; // valor de 0 - 100
    private int nivelAgua; // valor de 0 - 100

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    // No queremos que se pueda modificar el nivel de comida/agua directamente. Estos atributos van a ser de solo lectura.
    private void setNivelComida(int nivelComida) {
        if (nivelComida < 0) {
            this.nivelComida = 0;
        } else if (nivelComida > 100) {
            this.nivelComida = 100;
        } else {
            this.nivelComida = nivelComida;
        }
    }

    public int getNivelComida() {
        return this.nivelComida;
    }

    private void setNivelAgua(int nivelAgua) {
        if (nivelAgua < 0) {
            this.nivelAgua = 0;
        } else if (nivelAgua > 100) {
            this.nivelAgua = 100;
        } else {
            this.nivelAgua = nivelAgua;
        }
    }

    public int getNivelAgua() {
        return this.nivelAgua;
    }

    public Persona(String nombre, String apellidos, int nivelComida, int nivelAgua) {
        this.nombre = nombre;
        this.apellidos = apellidos;

        if (nivelComida < 0) {
            this.nivelComida = 0;
        } else if (nivelComida > 100) {
            this.nivelComida = 100;
        } else {
            this.nivelComida = nivelComida;
        }

        if (nivelAgua < 0) {
            this.nivelAgua = 0;
        } else if (nivelAgua > 100) {
            this.nivelAgua = 100;
        } else {
            this.nivelAgua = nivelAgua;
        }
    }

    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.apellidos = p.getApellidos();
        this.nivelComida = p.getNivelComida();
        this.nivelAgua = p.getNivelAgua();
    }

    public void comer(Comida c) {
        setNivelComida(getNivelComida() + c.getNivelEnergetico());
        setNivelAgua(getNivelAgua() + c.getNivelAgua());
        String accion = "";
        
        switch (c.getTipo()) {
            case comida:
                accion = " comido ";
                break;
            case bebida:
                accion = " bebido ";
                break;
            default:
                System.out.println("No se reconoce el tipo de comida.");
                break;
        }

        System.out.println(getNombre() + " ha" + accion + c.getNombre() + ".");
    }

    public void mostrarNiveles() {
         System.out.println("== NIVELES ==");
         System.out.println("Energia: " + getNivelComida());
         System.out.println("Agua: " + getNivelAgua());
         System.out.println("");
    }
}
