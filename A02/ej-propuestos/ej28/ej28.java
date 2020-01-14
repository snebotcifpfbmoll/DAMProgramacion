import java.util.*;

public class ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println(frase.replace(" ", ""));
    }
}
