import java.util.*;

public class ej27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num = 0;
        do {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if (num != -1) contador ++;
        } while (num != -1);

        System.out.println("Has introducido " + contador + " numeros.");
    }
}
