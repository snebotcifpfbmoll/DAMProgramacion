import java.util.*;
import java.lang.*;

public class Cubo implements FiguraGeometrica {
    private double base = 0;

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public Cubo() {}

    public Cubo(double base) {
        this.base = base;
    }

    public void calcularArea() {
        mostrarAtributos();
        double base = getBase();
        double area = Math.pow(base, 2);
       System.out.println("Area del cubo: " + area);
    }

    public void calcularVolumen() {
        mostrarAtributos();
        double base = getBase();
        double vol = Math.pow(base, 3);
        System.out.println("Volumen del cubo: " + vol);
    }

    public void mostrarAtributos() {
        System.out.println("Base: " + getBase());
    }

    public void pedirDatos() throws ExcepcionFigurasGeometricas {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los datos del cubo");
            System.out.print("Base: ");
            setBase(sc.nextDouble());
        } catch (InputMismatchException e) {
            throw new ExcepcionFigurasGeometricas("Datos introducidos incorrectos");
        }
    }
}
