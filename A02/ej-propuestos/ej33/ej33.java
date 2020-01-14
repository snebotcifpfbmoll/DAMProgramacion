import java.util.*;

public class ej33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println(frase.substring(3, 5));
    }
}
