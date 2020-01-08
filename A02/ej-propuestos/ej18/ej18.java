import java.util.*;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int num_1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int num_2 = sc.nextInt();

        for (int i = 0; i < 10; i ++) {
            int aleatorio = (int)Math.floor(Math.random() * (num_1 - num_2) + num_2);
            System.out.println(aleatorio);
        }
    }
}
