import java.util.*;

public class P05_2 {
    public static Vehiculo obtenerVehiculo(ArrayList<Vehiculo> vehiculos, int id) {
        for (Vehiculo v : vehiculos) if (v.getId() == id) return v;
        return null;
    }

    public static ArrayList<Vehiculo> obtenerVehiculo(ArrayList<Vehiculo> vehiculos, String matricula) {
        ArrayList<Vehiculo> ret = new ArrayList<Vehiculo>();
        for (Vehiculo v : vehiculos) if (v.getMatricula().equals(matricula)) ret.add(v);
        return ret;
    }

    public static void buscarVehiculo(ArrayList<Vehiculo> vehiculos) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Como quieres buscar? (id/matricula): ");
        String metodo = sc.nextLine().toLowerCase();

        switch (metodo) {
            case "id":
                {
                    System.out.print("Introduce el ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Vehiculo v = obtenerVehiculo(vehiculos, id);
                    if (v != null) v.mostrarAtributos();
                    break;
                }
            case "matricula":
                {
                    System.out.print("Introduce la matricula: ");
                    String matricula = sc.nextLine();
                    ArrayList<Vehiculo> vl = obtenerVehiculo(vehiculos, matricula);
                    for (Vehiculo v : vl) v.mostrarAtributos();
                    break;
                }
            default:
                System.out.println("Error: No se reconoce la opcion: " + metodo);
                break;
        }
    }

    public static void buscarTaxiLibre(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Taxi) {
                if (((Taxi)v).getLibre()) {
                    System.out.println("El taxi con ID: " + ((Taxi) v).getId() + " esta libre.");
                    ((Taxi)v).setLibre(false);
                    return;
                }
            }
        }
    }

    public static Taxi cambiarEstadoTaxi(ArrayList<Vehiculo> vehiculos, int id) {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Taxi) {
                Taxi taxi = (Taxi) v;
                if (taxi.getId() == id) {
                    taxi.setLibre(false);
                    return taxi;
                }
            }
        }
        
        return null;
    }

    public static void listarVehiculos(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Vehiculo) {
                v.mostrarAtributos();
            } else if (v instanceof Taxi) {
                ((Taxi)v).mostrarAtributos();
            } else if (v instanceof Autobus) {
                ((Autobus)v).mostrarAtributos();
            } else if (v instanceof VTC) {
                ((VTC)v).mostrarAtributos();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("==== MENU ====");
            System.out.println("\t1) Dar alta vehiculo");
            System.out.println("\t2) Dar alta taxi");
            System.out.println("\t3) Dar alta autobus");
            System.out.println("\t4) Dar alta VTC");
            System.out.println("\t5) Buscar vehiculo");
            System.out.println("\t6) Buscar taxi libre");
            System.out.println("\t7) Buscar taxi por id");
            System.out.println("\t8) Salir");
            System.out.print("\n> ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    {
                        Vehiculo v = new Vehiculo();
                        v.pedirAlta();
                        vehiculos.add(v);
                        break;
                    }
                case 2:
                    {
                        Taxi t = new Taxi();
                        t.pedirAlta();
                        vehiculos.add(t);
                        break;
                    }
                case 3:
                    {
                        Autobus a = new Autobus();
                        a.pedirAlta();
                        vehiculos.add(a);
                        break;
                    }
                case 4:
                    {
                        VTC v = new VTC();
                        v.pedirAlta();
                        vehiculos.add(v);
                        break;
                    }
                case 5:
                    {
                        buscarVehiculo(vehiculos);
                        break;
                    }
                case 6:
                    {
                        buscarTaxiLibre(vehiculos);
                        break;
                    }
                case 7:
                    {
                        System.out.print("Introduce el id del taxi: ");
                        int id = Integer.parseInt(sc.nextLine());
                        if (cambiarEstadoTaxi(vehiculos, id) == null) {
                            System.out.println("No existe ningun taxi con el id: " + id);
                        } else {
                            System.out.println("El taxi con id " + id + " ahora esta libre.");
                        }
                        break;
                    }
                case 8:
                    {
                        for (Vehiculo v : vehiculos) {
                            if (v instanceof Taxi) {
                                ((Taxi)v).mostrarAtributos();
                            } else if (v instanceof Autobus) {
                                ((Autobus)v).mostrarAtributos();
                            } else if (v instanceof VTC) {
                                ((VTC)v).mostrarAtributos();
                            } else {
                                v.mostrarAtributos();
                            }
                        }
                        break;
                    }
                case 9:
                    // va a salir del bucle
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no se reconoce.");
                    break;
            }
        }
    }
}
