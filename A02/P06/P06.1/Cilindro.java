import java.util.*;
import java.lang.*;

public class Cilindro implements FiguraGeometrica {
    private double radio = 0;
    private double altura = 0;

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

    public Cilindro() {}

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public void calcularArea() {
        mostrarAtributos();
        double radio = getRadio();
        double altura = getAltura();
        double area = 2 * Math.PI * radio * (radio + altura);
        System.out.println("Area del cilindro: " + area);
    }

    public void calcularVolumen() {
        mostrarAtributos();
        double radio = getRadio();
        double altura = getAltura();
        double vol = Math.PI * Math.pow(radio, 2) * altura;
        System.out.println("Volumen del cilindro: " + vol);
    }

    public void mostrarAtributos() {
        System.out.println("Radio: " + getRadio());
        System.out.println("Altura: " + getAltura());
    }

    public void pedirDatos() throws ExcepcionFigurasGeometricas {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los datos del cilindro");
            System.out.print("Radio: ");
            setRadio(sc.nextDouble());
            System.out.print("Altura: ");
            setAltura(sc.nextDouble());
        } catch (InputMismatchException e) {
            throw new ExcepcionFigurasGeometricas("Datos introducidos incorrectos");
        }
    }
}
