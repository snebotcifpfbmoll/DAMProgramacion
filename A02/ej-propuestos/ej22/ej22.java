import java.util.*;

public class ej22 {
    public static void main(String[] args) {
        char vocales[] = { 'a', 'e', 'i', 'o', 'u' };
        String _frase = "La lluvia en Sevilla es una maravilla";
        String frase = _frase.toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i ++) {
            for (char c : vocales) {
                if (c == frase.charAt(i)) contador ++;
            }
        }

        System.out.println("La frase \"" + _frase + "\" contiene " + contador + " vocales.");
    }
}
