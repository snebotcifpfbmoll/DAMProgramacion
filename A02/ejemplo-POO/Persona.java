import java.util.*;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private Nif nif;

    public Persona(String nombre, String apellidos, int edad, Nif nif) {
        this.nombre = nombre.toUpperCase();
        this.apellidos = apellidos;
        this.edad = edad;
        this.nif = nif;
    }

    public Persona(Persona persona) {
        this.setNombre(persona.nombre);
        this.setApellidos(persona.apellidos);
        this.setEdad(persona.edad);
        this.setNif(persona.nif);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public Nif getNif() {
        return this.nif;
    }

    public static Persona solicitarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        Nif nif = Nif.solicitarDatos();
        return new Persona(nombre, apellidos, edad, nif);
    }

    public void mostrarAtributos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        nif.mostrarAtributos();
    }
}
