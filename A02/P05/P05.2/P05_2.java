import java.util.*;

public class P05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("==== MENU ====");
            System.out.println("\t1) Dar alta vehiculo");
            System.out.println("\t2) Dar alta taxi");
            System.out.println("\t3) Dar alta autobus");
            System.out.println("\t4) Dar alta VTC");
            System.out.print("\n> ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Vehiculo v = new Vehiculo();
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no se reconoce.");
                    break;
            }
        }
    }
}
