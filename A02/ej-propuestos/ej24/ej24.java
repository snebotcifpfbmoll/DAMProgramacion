import java.util.*;

public class ej24 {
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";
        for (char c : frase.toCharArray()) {
            System.out.print((int)c + " ");
        }
        System.out.println();
    }
}
