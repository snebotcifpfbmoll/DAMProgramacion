import java.util.*;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un numero positivo: ");
            num = sc.nextInt();
        } while (num < 0);

        int contador = 0;
        for (int i = num; i > 0; i /= 10) contador ++;
        System.out.println("El numero " + num + " tiene " + contador + " cifras.");
    }
}
