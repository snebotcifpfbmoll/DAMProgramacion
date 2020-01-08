import java.util.*;

public class ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un codigo de la tabla ASCII: ");
        int codigo = sc.nextInt();
        char caracter = (char)codigo;
        System.out.println("El codigo " + codigo + " corresponde a '" + caracter + "' en la tabla ASCII.");
    }
}
