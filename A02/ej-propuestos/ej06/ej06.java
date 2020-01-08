import java.util.*;

public class ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " es divisible entre 2.");
        } else {
            System.out.println(num + " no es divisible entre 2.");
        }
    }
}
