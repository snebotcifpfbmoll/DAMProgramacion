import java.util.*;

public class Nif {
    private String numero;
    private String direccion;
    private String padre;
    private String madre;

    public Nif(String numero, String direccion, String padre, String madre) {
        this.numero = numero;
        this.direccion = direccion;
        this.padre = padre;
        this.madre = madre;
    }

    public void setNif(String nif) {
        this.numero = nif;
    }

    public String getNif() {
        return this.numero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getPadre() {
        return this.padre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public String getMadre() {
        return this.madre;
    }

    public static Nif solicitarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero NIF: ");
        String numero = sc.nextLine();
        System.out.print("Direccion: ");
        String direccion = sc.nextLine();
        System.out.print("Padre: ");
        String padre = sc.nextLine();
        System.out.print("Madre: ");
        String madre = sc.nextLine();
        return new Nif(numero, direccion, padre, madre);
    }

    public void mostrarAtributos() {
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Padre: " + getPadre());
        System.out.println("Madre: " + getMadre());
    }
}
