import java.util.*;

public class SaldoInsuficienteException extends Throwable {
    private double cantidad;
    
    public double getCantidad() {
        return this.cantidad;
    }

    public SaldoInsuficienteException() {}

    public SaldoInsuficienteException(double cantidad) {
        this.cantidad = cantidad;
    }
}
