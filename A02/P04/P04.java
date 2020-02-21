import java.util.*;

public class P04 {
    public static Pelicula obtenerPelicula(ArrayList<Pelicula> peliculas, int id) {
        for (Pelicula p : peliculas) if (p.getId() == id) return p;
        return null;
    }

    public static ArrayList<Pelicula> obtenerPelicula(ArrayList<Pelicula> peliculas, String titulo) {
        ArrayList<Pelicula> ret = new ArrayList<Pelicula>();
        for (Pelicula p : peliculas) if (p.getTitulo().contains(titulo)) ret.add(p);
        return ret;
    }

    public static void buscarPelicula(ArrayList<Pelicula> peliculas) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Como quieres buscar? (id/titulo): ");
        String metodo = sc.nextLine().toLowerCase();

        switch (metodo) {
            case "id":
                {
                    System.out.print("Introduce el ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Pelicula p = obtenerPelicula(peliculas, id);
                    if (p != null) p.mostrarDatos();
                    break;
                }
            case "titulo":
                {
                    System.out.print("Introduce el titulo: ");
                    String titulo = sc.nextLine();
                    ArrayList<Pelicula> pel = obtenerPelicula(peliculas, titulo);
                    for (Pelicula p : pel) p.mostrarDatos();
                    break;
                }
            default:
                System.out.println("Error: No se reconoce la opcion: " + metodo);
                break;
        }
    }

    public static void listarPeliculas(ArrayList<Pelicula> peliculas) {
        System.out.println("\n==== PELICULAS ====");
        for (Pelicula p : peliculas) {
            System.out.println("ID: " + p.getId());
            System.out.println("Titulo: " + p.getTitulo());
            System.out.println("Director: " + p.getDirector());
            System.out.println("Duracion: " + p.getDuracion());
            System.out.println("Genero: " + p.getGenero());
            System.out.println("Ano: " + p.getAno());
            System.out.println("Disponible: " + p.getDisponibilidad());
            System.out.println("Stock: " + p.getStock());
            System.out.println("Reservadas: " + p.getReservadas());
            System.out.println();
        }
    }

    public static void reservarPelicula(ArrayList<Pelicula> peliculas) {
        Scanner sc = new Scanner(System.in);

        listarPeliculas(peliculas);

        System.out.println("==== RESERVAR PELICULA ====");
        System.out.print("ID de la pelicula: ");

        int id = Integer.parseInt(sc.nextLine());
        Pelicula pelicula = obtenerPelicula(peliculas, id);

        if (pelicula == null) {
            System.out.println("Error: El ID especificado no corresponde a ninguna pelicula.");
            return;
        }

        if (!pelicula.getDisponibilidad()) {
            System.out.println("Error: La pelicula no esta disponible.");
            return;
        } else {
            if (pelicula.setReservadas(pelicula.getReservadas() + 1) >= 0) {
                System.out.println("La pelicula con ID " + pelicula.getId() + " ha sido reservada.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

        int opcion = 0;
        do {
            System.out.println("==== MENU ====");
            System.out.println("\t1) Añadir pelicula.");
            System.out.println("\t2) Reservar pelicula.");
            System.out.println("\t3) Buscar pelicula.");
            System.out.println("\t4) Salir.");
            System.out.print("\n> ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    {
                        Pelicula p = Pelicula.anadirPelicula();
                        if (p != null) peliculas.add(p);
                        break;
                    }
                case 2:
                    {
                        reservarPelicula(peliculas);
                        break;
                    }
                case 3:
                    {
                        buscarPelicula(peliculas);
                        break;
                    }
                case 4:
                    // El bucle va a terminar
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no se reconoce.");
                    break;
            }
        } while (opcion != 4);
    }
}
