import java.util.*;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de la a: ");
        int a = sc.nextInt();
        System.out.print("Introduce el valor de la b: ");
        int b = sc.nextInt();
        System.out.print("Introduce el valor de la c: ");
        int c = sc.nextInt();

        double disc = Math.pow(b, 2) - (4 * a * c);
        
        if (disc > 0) {
            double x1 = ((b * (-1)) + Math.sqrt(disc) / (2 * a));
            double x2 = ((b * (-1)) - Math.sqrt(disc) / (2 * a));
            System.out.println("El valor de x1 es " + x1 + "; el valor de x2 es de " + x2);
        } else {
            System.out.println("El discriminante es negativo.");
        }
    }
}
