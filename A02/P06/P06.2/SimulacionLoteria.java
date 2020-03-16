import java.util.*;

public class SimulacionLoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("==== SIMULACION APUESTA ====");
            System.out.println("\t1) Crear Primitiva");
            System.out.println("\t2) Crear Quiniela");
            System.out.println("\t3) Realizar simulacion");
            System.out.println("\t4) Salir");
            System.out.print("\n> ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("La opcion debe de ser un numero.");
                continue;
            }

            switch (opcion) {
                case 1:
                    {
                        String decision;
                        do {
                            try {
                                Primitiva p = Primitiva.crearApuesta();
                                p.mostrarApuesta();
                            } catch (ApuestaException e) {
                                System.out.println(e.getError());
                            }
    
                            System.out.print("Quieres añadir otra primitiva? (S/N): ");
                            decision = sc.nextLine();
                        } while (decision.equals("S"));
                        break;
                    }
                case 2:
                    {
                        String decision;
                        do {
                            try {
                                Quiniela q = Quiniela.crearApuesta();
                                q.mostrarApuesta();
                            } catch (ApuestaException e) {
                                System.out.println(e.getError());
                            }
    
                            System.out.print("Quieres añadir otra quiniela? (S/N): ");
                            decision = sc.nextLine();
                        } while (decision.equals("S"));
                        break;
                    }
                case 3:
                    break;
                case 4:
                    // el bucle va a terminar
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no se reconoce.");
                    break;
            }
        }
    }
}
