import java.util.*;

abstract public class Tarjeta {
    private String nif;
    private int pin;
    private String nombre;
    private String apellido;

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return this.nif;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return this.pin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Tarjeta() {}

    public Tarjeta(String nif, int pin, String nombre, String apellido) {
        this.nif = nif;
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Tarjeta(Tarjeta t) {
        this.nif = t.nif;
        this.pin = t.pin;
        this.nombre = t.nombre;
        this.apellido = t.apellido;
    }

    public void mostrarTarjeta() {
        System.out.println("NIF: " + getNif());
        System.out.println("PIN: " + getPin());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
    }

    abstract public void disminuirSaldoDisponible(double cantidad) throws SaldoInsuficienteException;
}
