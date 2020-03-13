import java.util.*;

public class Apuesta {
    private static int num_apuestas = 0;
    private int n_apuesta = num_apuestas++;
    private String nombre;
    private String apellidos;

    public void setApuesta(int n_apuesta) {
        this.n_apuesta = n_apuesta;
    }

    public int getApuesta() {
        return this.n_apuesta;
    }

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
}
