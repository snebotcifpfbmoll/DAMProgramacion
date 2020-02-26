import java.util.*;

public class Taxi extends Vehiculo {
    private static int ultimaLicencia = 100;
    private int licencia;
    private boolean libre;
    private int n_taxistas;

    public void setLicencia(int licencia) {
        // Comprobar que es mayor que la ultima licencia (es incremental)
        if (licencia > ultimaLicencia) {
            this.licencia = licencia;
            ultimaLicencia = licencia;
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

    public Taxi() {}

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
        Scanner sc = new Scanner(System.in);
        super.pedirAlta();

        setLicencia(ultimaLicencia++);

        System.out.print("Libre (si/no): ");
        setLibre(sc.nextLine() == "si" ? true : false);

        System.out.print("Numero taxistas: ");
        setNumeroTaxistas(Integer.parseInt(sc.nextLine()));
    }
}
