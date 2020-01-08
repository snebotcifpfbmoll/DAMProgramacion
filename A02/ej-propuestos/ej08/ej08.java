import java.util.*;

public class ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un caracter: ");
        char caracter = sc.next().charAt(0);
        int codigo = (int)caracter;
        System.out.println("El caracter '" + caracter + "' corresponde al codigo " + codigo + " en la tabla ASCII.");
    }
}
