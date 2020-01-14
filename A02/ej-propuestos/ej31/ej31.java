import java.util.*;

public class ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase \"" + frase + "\" tiene " + frase.length() + " caracteres.");
    }
}
