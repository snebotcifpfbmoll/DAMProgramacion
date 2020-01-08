import java.util.*;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        } while (num < 0);
    }
}
