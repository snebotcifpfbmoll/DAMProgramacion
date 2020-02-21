import java.util.*;

public final class Comercial extends Empleado {
    private int n_ventas;
    private double comision;

    public void setVentas(int n_ventas) {
        this.n_ventas = n_ventas;
    }

    public int getVentas() {
        return this.n_ventas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return this.comision;
    }

    public Comercial() {
        super();
    }

    public Comercial(String nombre, String apellido1, String apellido2, String nif, int edad, int salario, int n_ventas, double comision) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.n_ventas = n_ventas;
        this.comision = comision;
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido1: " + super.getApellido1());
        System.out.println("Apellido2: " + super.getApellido2());
        System.out.println("Nif: " + super.getNif());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Numero ventas: " + getVentas());
        System.out.println("Comision: " + getComision());
    }

    @Override
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        super.pedirAlta();
        System.out.print("Numero ventas: ");
        setVentas(Integer.parseInt(sc.nextLine()));
        System.out.print("Comision: ");
        setComision(Double.parseDouble(sc.nextLine()));
    }
}
