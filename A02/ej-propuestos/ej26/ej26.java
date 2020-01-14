import java.util.*;

public class ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Introduce un numero (mayor que 1): ");
            num = sc.nextInt();
        } while (num <= 1);
        int res = 0;
        for (int i = 1; i <= num; i ++) res += i;
        System.out.println("Numero total: " + res);
    }
}
