import java.util.*;

public abstract class Apuesta {
    private static int num_apuestas = 0;
    private int n_apuesta = num_apuestas++;
    private String nombre;
    private String apellidos;
    private static String[] arr_nombres = {"SERAFI", "EDU", "CORTI", "DANI", "JHONNY", "ROBER"};
    private static String[] arr_apellidos = {"NEBOT", "ZAPATA", "FORTEZA", "APESTEGUIA", "MONIZ", "VILA"};

    public int getNumeroApuestas() {
        return this.num_apuestas;
    }

    public int getNumero() {
        return this.n_apuesta;
    }

    public void setApuesta(int n_apuesta) {
        this.n_apuesta = n_apuesta;
    }

    public int getApuesta() {
        return this.n_apuesta;
    }

    public void setNombre(String nombre) throws ApuestaException {
        if (!nombre.equals(nombre.toUpperCase())) {
            throw new ApuestaException("El nombre debe estar en mayusculas.");
        }

        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidos) throws ApuestaException {
        if (!apellidos.equals(apellidos.toUpperCase())) {
            throw new ApuestaException("El apellido debe estar en mayusculas.");
        }

        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public static String getRandomNombre() {
        int random = Utilidades.randomConRango(0, arr_nombres.length - 1);
        return arr_nombres[random];
    }

    public static String getRandomApellido() {
        int random = Utilidades.randomConRango(0, arr_apellidos.length - 1);
        return arr_apellidos[random];
    }

    public Apuesta() {}

    public Apuesta(String nombre, String apellidos) throws ApuestaException {
        if (!nombre.equals(nombre.toUpperCase())) {
            throw new ApuestaException("El apellido debe estar en mayusculas.");
        }

        if (!apellidos.equals(apellidos.toUpperCase())) {
            throw new ApuestaException("El apellido debe estar en mayusculas.");
        }

        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Apuesta(Apuesta a) {
        this.nombre = a.getNombre();
        this.apellidos = a.getApellidos();
    }

    public void mostrarApuesta() {
        System.out.println("Total de apuestas: " + getNumeroApuestas());
        System.out.println("Numero de apuesta: " + getNumero());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
    }
}
