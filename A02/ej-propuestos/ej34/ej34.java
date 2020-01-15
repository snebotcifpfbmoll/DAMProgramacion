import java.util.*;

public class ej34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        for (String palabra : frase.split(" ")) System.out.println(palabra);
    }
}
