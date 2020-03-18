import java.util.*;

public class SimulacionLoteria {
    private static ArrayList<Apuesta> apuestas = new ArrayList<Apuesta>();

    public static void realizarSimulacion() throws ApuestaException {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== SIMULACION APUESTAS ====");

        int n_primitivas = 0;
        while (n_primitivas <= 0) {
            try {
                if (n_primitivas <= 0) {
                    System.out.print("Numero de primitivas: ");
                    n_primitivas = Integer.parseInt(sc.nextLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un numero.");
            }
        }

        int n_quinielas = 0;
        while (n_quinielas <= 0) {
            try {
                if (n_quinielas <= 0) {
                    System.out.print("Numero de quinielas: ");
                    n_quinielas = Integer.parseInt(sc.nextLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un numero.");
            }
        }

        // generar primitivas aleatoriamente
        ArrayList<Primitiva> primitivas = new ArrayList<Primitiva>();
        for (int i = 0; i < n_primitivas; i ++) {
            try {
                primitivas.add(Primitiva.crearAleatorio());
            } catch (ApuestaException e) {
                System.out.println(e.getError());
                throw e;
            }
        }

        // generar quinielas aleatoriamente
        ArrayList<Quiniela> quinielas = new ArrayList<Quiniela>();
        for (int i = 0; i < n_quinielas; i ++) {
            try {
                quinielas.add(Quiniela.crearAleatorio());
            } catch (ApuestaException e) {
                System.out.println(e.getError());
                throw e;
            }
        }

        // simulacion primitiva
        int[] resultado_primitiva = Primitiva.generarResultado();
        int pi = 0;
        boolean pacierto = false;
        while (pi < primitivas.size() && !pacierto) {
            if (Primitiva.comprobarResultado(resultado_primitiva, primitivas.get(pi).getListaNum())) {
                pacierto = true;
            }
            pi ++;
        }

        // simulacion primitiva
        ResultadoPartido[] resultado_quiniela = Quiniela.generarResultado();
        int qi = 0;
        boolean qacierto = false;
        while (qi < quinielas.size() && !qacierto) {
            if (Quiniela.comprobarResultado(resultado_quiniela, quinielas.get(qi).getResultados())) {
                qacierto = true;
            }
            qi ++;
        }

        System.out.println(pacierto ? "La primitiva " + (pi + 1) + " ha ganado!" : "No ha ganado ninguna primitiva.");
        System.out.println(qacierto ? "La quiniela " + (qi + 1) + " ha ganado!" : "No ha ganado ninguna quiniela.");
    }

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
                                apuestas.add(p);
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
                                apuestas.add(q);
                            } catch (ApuestaException e) {
                                System.out.println(e.getError());
                            }
    
                            System.out.print("Quieres añadir otra quiniela? (S/N): ");
                            decision = sc.nextLine();
                        } while (decision.equals("S"));
                        break;
                    }
                case 3:
                    {
                        try {
                            realizarSimulacion();
                        } catch (ApuestaException e) {
                            System.out.println(e.getError());
                        }
                    }
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
