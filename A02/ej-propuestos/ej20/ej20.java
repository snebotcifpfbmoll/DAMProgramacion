import java.util.*;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " no es primo.");
            return;
        }

        boolean primo = true;
        int i = 2;
        while (primo && i < num) {
            if (num % i == 0) primo = false;
            i ++;
        }

        if (primo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}
