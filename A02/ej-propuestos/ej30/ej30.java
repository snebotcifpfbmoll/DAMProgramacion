import java.util.*;

public class ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        System.out.print("Quieres convertir la frase a mayúsculas (1) o minúsculas (2): ");
        int opcio = Integer.parseInt(sc.nextLine());
        
        switch (opcio) {
            case 1:
                System.out.println(frase.toUpperCase());
                break;
            case 2:
                System.out.println(frase.toLowerCase());
                break;
            default:
                System.out.println("La opcion " + opcio + " no se reconoce.");
                break;
        }
    }
}
