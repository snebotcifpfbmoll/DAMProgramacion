import java.util.*;

public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private double salario;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return this.nif;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public Empleado() {}

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarAtributos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido1: " + getApellido1());
        System.out.println("Apellido2: " + getApellido2());
        System.out.println("Nif: " + getNif());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
    }

    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        while (!Character.isUpperCase(nombre.charAt(0))) {
            System.out.print("Nombre (primera mayúscula): ");
            nombre = sc.nextLine();
        }
        setNombre(nombre);

        System.out.print("Primer apellido: ");
        String apellido1 = sc.nextLine();
        while (!Character.isUpperCase(apellido1.charAt(0))) {
            System.out.print("Primer apellido (primera mayúscula): ");
            apellido1 = sc.nextLine();
        }
        setApellido1(apellido1);

        System.out.print("Segundo apellido: ");
        String apellido2 = sc.nextLine();
        while (!Character.isUpperCase(apellido2.charAt(0))) {
            System.out.print("Segundo apellido (primera mayúscula): ");
            apellido2 = sc.nextLine();
        }
        setApellido2(apellido1);

        System.out.print("Nif: ");
        setNif(sc.nextLine());

        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        while (edad < 16) {
            System.out.print("Edad (16 años mínimo): ");
            edad = Integer.parseInt(sc.nextLine());
        }
        setEdad(edad);

        System.out.print("Salario: ");
        setSalario(Double.parseDouble(sc.nextLine()));
    }
}
