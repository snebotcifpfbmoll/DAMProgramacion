import java.util.*;

public class ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num_1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce la operacion (signo aritmético): ");
        String signo = sc.nextLine();
        System.out.print("Introduce un numero: ");
        int num_2 = Integer.parseInt(sc.nextLine());

        switch (signo.charAt(0)) {
            case '+':
                System.out.println(num_1 + " + " + num_2 + " = " + (num_1 + num_2));
                break;
            case '-':
                System.out.println(num_1 + " - " + num_2 + " = " + (num_1 - num_2));
                break;
            case '*':
                System.out.println(num_1 + " * " + num_2 + " = " + (num_1 * num_2));
                break;
            case '/':
                System.out.println(num_1 + " / " + num_2 + " = " + (num_1 / num_2));
                break;
            case '^':
                System.out.println(num_1 + " ^ " + num_2 + " = " + ((int)Math.pow(num_1, num_2)));
                break;
            case '%':
                System.out.println(num_1 + " % " + num_2 + " = " + (num_1 % num_2));
                break;
            default:
                System.out.println("El signo " + signo + " no se reconoce como signo aritmético.");
                break;
        }
    }
}
