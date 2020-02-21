import java.util.*;

public class Taxi extends Vehiculo {
    private static int ultimaLicencia = 100;
    private int licencia;
    private boolean libre;
    private int n_taxistas;

    public int setLicencia(int licencia) {
        // Comprobar que es mayor que la ultima licencia (es incremental)
        if (licencia > ultimaLicencia) {
            this.licencia = licencia;
            ultimaLicencia = licencia;
            return licencia;
        } else {
            return null;
        }
    }

    public int getLicencia() {
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

    public Taxi(int licencia, boolean libre, int n_taxistas) {
        super();

        // Comprobar que es mayor que la ultima licencia (es incremental)
        if (licencia > ultimaLicencia) {
            this.licencia = licencia;
            ultimaLicencia = licencia;
        } else {
            this.licencia = ultimaLicencia ++;
        }

        this.libre = libre;
        this.n_taxistas = n_taxistas;
    }

    public Taxi(Taxi taxi) {
        super((Vehiculo)taxi);
        this.licencia = taxi.licencia;
        this.libre = taxi.libre;
        this.n_taxistas = taxi.n_taxistas;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Licencia: " + getLicencia());
        System.out.println("Libre: " + getLibre());
        System.out.println("Numero taxistas: " + getNumeroTaxistas());
    }

    @Override
    public void pedirAlta() {
        super.pedirAlta();

        System.out.print("Licencia: ");
        int licencia = Integer.parseInt(sc.nextLine());
        while (licencia <= ultimaLicencia) {
            System.out.println("Licencia: ");
            licencia = Integer.parseInt(sc.nextLine());
        }
        setLicencia(licencia);

        System.out.print("Libre (si/no): ");
        setLibre(sc.nextLine() == "si" ? true : false);

        System.out.println("Numero taxistas: ");
        setNumeroTaxistas(Integer.parseInt(sc.nextLine()));
    }
}
