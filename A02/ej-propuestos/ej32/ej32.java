import java.util.*;

public class ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase_1 = sc.nextLine();
        System.out.print("Introduce una frase: ");
        String frase_2 = sc.nextLine();
        System.out.println("Las frases " + (frase_1.equals(frase_2) ? "" : "no ") + "son iguales.");
    }
}
