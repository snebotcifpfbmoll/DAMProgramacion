import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // tests
        CajeroAutomatico c = new CajeroAutomatico();
        c.mostrarCajero();
        TarjetaDebito t = new TarjetaDebito("123456789c", 1111, "Serafi", "Nebot", 2000);
        c.anadirTarjeta(t);
        //c.sacarDinero();
        c.comprobarDevolucion(100);

        int opcion = 2;
        while (opcion != 2) {
            System.out.println("==== MENU ====");
            System.out.println("\t1) Sacar dinero.");
            System.out.println("\t2) Salir.");
            System.out.print("\n> ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no se reconoce.");
                    break;
            }
        }
    }
}
