import java.util.*;

public class ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase_final = new String();
        String frase = new String();
        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
            frase_final += frase;
        } while (!frase.isEmpty());

        System.out.println(frase_final);
    }
}
