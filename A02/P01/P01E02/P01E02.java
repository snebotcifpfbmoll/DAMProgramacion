// Importar libreria para poder leer stdin
import java.util.*;

public class P01E02 {
    public static void main(String[] args) {
        int NSTRINGS = 5; // Numero de veces que queremos leer
        String[] strs = new String[NSTRINGS]; // Array de String donde vamos a guardar todos numeros introudcidos por el usuario
        Scanner sc = new Scanner(System.in); // Inicializamos el escaner

        // Pedir un numero n veces
        for (int i = 0; i < NSTRINGS; i ++) {
            System.out.print("Introduce un numero: "); // Preguntar un numero
            strs[i] = sc.nextLine(); // Leer linea
        }

        // Mostrar resultado
        System.out.println("Has introducido:");
    for (int i = NSTRINGS - 1; i >= 0; i --) {
            System.out.println(strs[i]);
        }

        // Cerrar el escaner
        sc.close();
    }
}
