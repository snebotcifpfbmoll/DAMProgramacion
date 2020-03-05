import java.util.*;

public class TarjetaDebito extends Tarjeta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public TarjetaDebito() {
        super();
    }

    public TarjetaDebito(String nif, int pin, String nombre, String apellido, double saldo) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
    }

    public TarjetaDebito(TarjetaDebito t) {
        super(t.getNif(), t.getPin(), t.getNombre(), t.getApellido());
        this.saldo = t.saldo;
    }

    @Override
    public void mostrarTarjeta() {
        super.mostrarTarjeta();
        System.out.println("Saldo: " + getSaldo());
    }

    public void disminuirSaldoDisponible(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > getSaldo()) {
            throw new SaldoInsuficienteException(getSaldo());
        }

        setSaldo(getSaldo() - cantidad);
    }
}
