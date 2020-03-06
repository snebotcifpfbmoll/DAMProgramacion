import java.util.*;

public class TarjetaCredito extends Tarjeta {
    private double saldo;
    private double credito;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return this.credito;
    }

    public TarjetaCredito() {
        super();
    }

    public TarjetaCredito(String nif, int pin, String nombre, String apellido, double saldo, double credito) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
        this.credito = credito;
    }

    public TarjetaCredito(TarjetaCredito t) {
        super(t.getNif(), t.getPin(), t.getNombre(), t.getApellido());
        this.saldo = t.saldo;
        this.credito = t.credito;
    }

    @Override
    public void mostrarTarjeta() {
        super.mostrarTarjeta();
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Credito: " + getCredito());
    }

    public void disminuirSaldoDisponible(double cantidad) throws SaldoInsuficienteException {
        double saldo = getSaldo();
        double credito = getCredito();

        if (cantidad < saldo) {
            setSaldo(saldo - cantidad);
        } else if (cantidad < getSaldo() + getCredito()) {
            setSaldo(0);
            setCredito(credito - (cantidad - saldo));
        } else {
            throw new SaldoInsuficienteException();
        }
    }
}
