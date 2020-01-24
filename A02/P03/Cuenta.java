import java.util.*;

public class Cuenta {
    private String cliente;
    private String numero;
    private double interes;
    private double saldo;
    
    // Constructores
    public Cuenta() {}

    public Cuenta(String cliente, String numero, double interes, double saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.interes = interes;
        this.saldo = saldo;
    } 

    public Cuenta(Cuenta cuenta) {
        this.cliente = cuenta.cliente;
        this.numero = cuenta.numero;
        this.interes = cuenta.interes;
        this.saldo = cuenta.saldo;
    }

    public static Cuenta crearCuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cliente: ");
        String cliente = sc.nextLine();
        System.out.print("Numero: ");
        String numero = sc.nextLine();
        System.out.print("Interes: ");
        double interes = Double.parseDouble(sc.nextLine());
        System.out.print("Saldo: ");
        double saldo = Double.parseDouble(sc.nextLine());
        return new Cuenta(cliente, numero, interes, saldo);
    }

    // Getter & setters
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return this.interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } 

    public double getSaldo() {
        return this.saldo;
    }

    public boolean ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad debe ser positiva.");
            return false;
        }

        setSaldo(getSaldo() + cantidad);

        return true;
    }

    public boolean reintegro(double cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad debe ser positiva.");
            return false;
        }

        double cantidad_final = getSaldo() - cantidad;
        if (cantidad_final < 0) {
            System.out.println("La cantidad es mayor al saldo de la cuenta.");
            return false;
        }

        setSaldo(cantidad_final);

        return true;
    }

    public boolean transferir(Cuenta destino, double cantidad) {
        if (!reintegro(cantidad)) return false;
        if (!destino.ingresar(cantidad)) {
            // Algo ha ido mal. Devolvemos el dinero
            setSaldo(getSaldo() + cantidad);
            return false;
        }

        return true;
    }
}
