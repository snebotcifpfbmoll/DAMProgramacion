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

    public Autobus() {}

    public Autobus(Autobus auto) {
        super((Vehiculo) auto);
        this.n_plazas = auto.n_plazas;
        this.n_paradas = auto.n_paradas;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Numero plazas: " + getNumeroPlazas());
        System.out.println("Numero paradas: " + getNumeroParadas());
    }

    @Override
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);

        super.pedirAlta();

        System.out.print("Numero plazas: ");
        setNumeroPlazas(Integer.parseInt(sc.nextLine()));

        System.out.print("Numero de paradas: ");
        int n_paradas = Integer.parseInt(sc.nextLine());
        while (n_paradas < 3 || n_paradas > 20) {
            System.out.print("Numero de paradas (entre 3 y 20): ");
            n_paradas = Integer.parseInt(sc.nextLine());
        }
        setNumeroParadas(n_paradas);
    }
}
