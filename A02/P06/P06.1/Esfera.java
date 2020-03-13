import java.util.*;
import java.lang.*;

public class Esfera implements FiguraGeometrica {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public Esfera() {}

    public Esfera(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        mostrarAtributos();
        double radio = getRadio();
        double area = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("Area de la esfera: " + area);
    }

    public void calcularVolumen() {
        mostrarAtributos();
        double radio = getRadio();
        double vol = (4 * Math.PI * Math.pow(radio, 3)) / 3;
        System.out.println("Volumen de la esfera: " + vol);
    }

    public void mostrarAtributos() {
        System.out.println("Radio: " + getRadio());
    }

    public void pedirDatos() throws ExcepcionFigurasGeometricas {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los datos de la esfera");
            System.out.print("Radio: ");
            setRadio(sc.nextDouble());
        } catch (InputMismatchException e) {
            throw new ExcepcionFigurasGeometricas("Datos introducidos incorrectos");
        }
    }
}
