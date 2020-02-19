import java.util.*;

public class Autobus extends Vehiculo {
    private int n_plazas;
    private int n_paradas;

    public void setNumeroPlazas(int n_plazas) {
        this.n_plazas = n_plazas;
    }

    public int getNumeroPlazas() {
        return this.n_plazas;
    }

    public void setNumeroParadas(int n_paradas) {
        this.n_paradas = n_paradas;
    }

    public int getNumeroParadas() {
        return this.n_paradas;
    }

    public Autobus(int n_plazas, int n_paradas) {
        super();
        this.n_plazas = n_plazas;
        this.n_paradas = n_paradas;
    }
}
