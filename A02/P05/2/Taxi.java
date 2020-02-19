import java.util.*;

public class Taxi extends Vehiculo {
    private String licencia;
    private boolean libre;
    private n_taxistas;

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getLicencia() {
        return this.licencia;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public boolean getLibre() {
        return this.libre;
    }

    public void setNumeroTaxistas(int n_taxistas) {
        this.n_taxistas = n_taxistas;
    }

    public int getNumeroTaxistas() {
        return this.n_taxistas;
    }

    public Taxi(String licencia, boolean libre, int n_taxistas) {
        super();
        this.licencia = licencia;
        this.libre = libre;
        this.n_taxistas = n_taxistas;
    }
}
