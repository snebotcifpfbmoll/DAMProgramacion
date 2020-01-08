import java.util.*;

public class ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int iva = 21;
        System.out.print("Introduce el precio de un producto: ");
        double precio = sc.nextDouble();
        double precio_final = precio + (precio * (iva / 100.0));
        System.out.println("El precio final (con IVA) es de " + precio_final);
    }
}
