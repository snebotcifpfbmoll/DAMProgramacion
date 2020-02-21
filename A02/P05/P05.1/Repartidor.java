import java.util.*;

public final class Repartidor extends Empleado {
    private int horas_trabajadas;
    private String zona;

    public void setHorasTrabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getHorasTrabajadas() {
        return this.horas_trabajadas;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return this.zona;
    }

    public Repartidor() {
        super();
    }

    public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, int salario, int horas_trabajadas, String zona) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horas_trabajadas = horas_trabajadas;
        this.zona = zona;
    }

    @Override
    public void mostrarAtributos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido1: " + super.getApellido1());
        System.out.println("Apellido2: " + super.getApellido2());
        System.out.println("Nif: " + super.getNif());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Zona: " + getZona());
    }
    
    @Override
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);
        super.pedirAlta();
        System.out.print("Horas trabajadas: ");
        setHorasTrabajadas(Integer.parseInt(sc.nextLine()));
        System.out.print("Zona: ");
        setZona(sc.nextLine());
    }
} 
