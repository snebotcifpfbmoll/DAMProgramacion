import java.util.*;

public class Cubo implements FiguraGeometrica {
    private float base;

    public void setBase(float base) {
        this.base = base;
    }

    public float getBase() {
        return this.base;
    }

    public void calcularArea() {
        float base = getBase();
        float area = base * base;
        System.out.println("Area del cuadrado: " + area);
    }

    public void calcularVolumen() {
    }

    public void imprimirCaracteristicas() {
    }
}
