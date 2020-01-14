import java.util.*;

public class ej23 {
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";
        char chars[] = new char[frase.length()];
        int index = 0;
        for (char c : frase.toCharArray()) {
            if (c == 'a') c = 'e';
            if (c == 'A') c = 'E';
            chars[index++] = c;
        }
        System.out.println(String.valueOf(chars));
    }
}
