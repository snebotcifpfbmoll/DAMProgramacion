import java.util.*;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce en numero de ventas: ");
        int n_ventas = sc.nextInt();
        double total = 0;
        for (int i = 0; i < n_ventas; i ++) {
            System.out.print("Introduce la venta: ");
            total += sc.nextDouble();
        }
        System.out.println("El total de las ventas es de " + total);
    }
}
