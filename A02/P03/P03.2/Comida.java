import java.util.*;

public class Comida {
    private TipoComida tipo;
    private String nombre;
    private int nivelEnergetico; // valor de 0 - 100
    private int nivelAgua; // puede ser negativo (quita nivel de agua a la persona)

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }

    public TipoComida getTipo() {
        return this.tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNivelEnergetico(int nivelEnergetico) {
        if (nivelEnergetico < 0) {
            this.nivelEnergetico = 0;
        } else if (nivelEnergetico > 100) {
            this.nivelEnergetico = 100;
        } else {
            this.nivelEnergetico = nivelEnergetico;
        }
    }

    public int getNivelEnergetico() {
        return this.nivelEnergetico;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public int getNivelAgua() {
        return this.nivelAgua;
    }

    public Comida(String nombre, TipoComida tipo, int nivelEnergetico, int nivelAgua) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.nivelAgua = nivelAgua;

        if (nivelEnergetico < 0) {
            this.nivelEnergetico = 0;
        } else if (nivelEnergetico > 100) {
            this.nivelEnergetico = 100;
        } else {
            this.nivelEnergetico = nivelEnergetico;
        }
    }

    public Comida(Comida c) {
        this.tipo = c.getTipo();
        this.nombre = c.getNombre();
        this.nivelEnergetico = c.getNivelEnergetico();
        this.nivelAgua = c.getNivelAgua();
    }
}
