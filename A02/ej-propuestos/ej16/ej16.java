import java.util.*;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String contra = "password";
        boolean acierto = false;
        int intentos = 0;
        do {
            System.out.print("Introduce la contraseña: ");
            String passwd = sc.nextLine();
            if (contra.equals(passwd)) acierto = true;
            intentos ++;
        } while (acierto == false && intentos < 3);

        if (acierto) {
            System.out.println("Has acertado la contraseña.");
        } else {
            System.out.println("Has superado el maximo de intentos.");
        }
    }
}
