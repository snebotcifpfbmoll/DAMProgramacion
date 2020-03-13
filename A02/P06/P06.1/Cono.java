import java.util.*;
import java.lang.*;

public class Cono implements FiguraGeometrica {
    private double radio = 0;
    private double altura = 0;
    private double generatriz = 0;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public Cono() {}

    public Cono(double radio, double altura, double generatriz) {
        this.radio = radio;
        this.altura = altura;
        this.generatriz = generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    public double getGeneratriz() {
        return this.generatriz;
    }

    public void calcularArea() {
        mostrarAtributos();
        double radio = getRadio();
        double altura = getAltura();
        double generatriz = getGeneratriz();
        double area = Math.PI * radio * (generatriz + radio);
        System.out.println("Area del cono: " + area);
    }

    public void calcularVolumen() {
        mostrarAtributos();
        double radio = getRadio();
        double altura = getAltura();
        double generatriz = getGeneratriz();
        double vol = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        System.out.println("Volumen del cono: " + vol);
    }

    public void mostrarAtributos() {
        System.out.println("Radio: " + getRadio());
        System.out.println("Altura: " + getAltura());
        System.out.println("Generatriz: " + getGeneratriz());
    }

    public void pedirDatos() throws ExcepcionFigurasGeometricas {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los datos del cono");
            System.out.print("Radio: ");
            setRadio(sc.nextDouble());
            System.out.print("Altura: ");
            setAltura(sc.nextDouble());
            System.out.print("Generatriz: ");
            setGeneratriz(sc.nextDouble());
        } catch (InputMismatchException e) {
            throw new ExcepcionFigurasGeometricas("Datos introducidos incorrectos");
        }
    }
}
