import java.util.*;

public class ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dia de la semana: ");
        String dia = sc.nextLine();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " es un dia laboral.");
                break;
            case "sabado":
            case "domingo":
                System.out.println(dia + " es un dia no laboral.");
                break;
            default:
                System.out.println(dia + " no se reconoce como dia de la semana.");
                break;
        }
    }
}
