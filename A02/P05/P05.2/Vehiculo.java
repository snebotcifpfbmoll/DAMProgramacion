import java.util.*;

public class Vehiculo {
    private static int n_vehiculo = 0;
    private final int id;
    private String matricula;
    private String modelo;
    private int potencia;

    public int getId() {
        return this.id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public Vehiculo() {
        this.id = n_vehiculo ++;
    }

    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = n_vehiculo ++;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.id = n_vehiculo ++;
        this.matricula = vehiculo.matricula;
        this.modelo = vehiculo.modelo;
        this.potencia = vehiculo.potencia;
    }

    public void mostrarAtributos() {
        System.out.println("ID: " + getId());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Potencia: " + getPotencia());
    }

    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matricula: ");
        String matricula = sc.nextLine();
        while (!matricula.equals(matricula.toUpperCase())) {
            System.out.print("Matricula (mayúsculas): ");
            matricula = sc.nextLine();
        }
        setMatricula(matricula);

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        char primeraLetra = modelo.charAt(0);
        String resto = modelo.substring(1);
        while (!Character.isUpperCase(primeraLetra) && !resto.equals(resto.toLowerCase())) {
            System.out.print("Modelo (mayúsculas): ");
            modelo = sc.nextLine();
            primeraLetra = modelo.charAt(0);
            resto = modelo.substring(1);
        }
        setMatricula(modelo);

        System.out.print("Potencia: ");
        int potencia = Integer.parseInt(sc.nextLine());
        while (potencia <= 0) {
            System.out.print("Potencia (mayor a 0): ");
            potencia = Integer.parseInt(sc.nextLine());
        }
        setPotencia(potencia);
    }
}
