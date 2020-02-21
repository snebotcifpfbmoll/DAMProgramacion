import java.util.*;

public class P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("==== MENU ====");
            System.out.println("\t1) Realizar alta Empleado");
            System.out.println("\t2) Realizar alta Comercial");
            System.out.println("\t3) Realizar alta Repartidor");
            System.out.println("\t4) Mostrar atributos");
            System.out.println("\t5) Salir");
            System.out.print("\n> ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    {
                        Empleado emp = new Empleado();
                        emp.pedirAlta();
                        empleados.add(emp);
                        break;
                    }
                case 2:
                    {
                        Comercial com = new Comercial();
                        com.pedirAlta();
                        empleados.add(com);
                        break;
                    }
                case 3:
                    {
                        Repartidor rep = new Repartidor();
                        rep.pedirAlta();
                        empleados.add(rep);
                        break;
                    }
                case 4:
                    {
                        for (Empleado emp : empleados) {
                            if (emp instanceof Empleado) {
                                emp.mostrarAtributos();
                            } else if (emp instanceof Comercial) {
                                ((Comercial)emp).mostrarAtributos();
                            } else if (emp instanceof Repartidor) {
                                ((Repartidor)emp).mostrarAtributos();
                            }
                            System.out.println(); // Añadir un poco de espacio
                        }
                        break;
                    }
                case 5:
                    // El bucle va a terminar
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no se reconoce.");
                    break;
            }
        }
    }
}
