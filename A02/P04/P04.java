import java.util.*;

public class P04 {
    public static Pelicula obtenerPelicula(ArrayList<Pelicula> peliculas, int id) {
        for (Pelicula p : peliculas) if (p.getId() == id) return p;
        return null;
    }

    public static Pelicula obtenerPelicula(ArrayList<Pelicula> peliculas, String titulo) {
        for (Pelicula p : peliculas) if (p.getTitulo().contains(titulo)) return p;
        return null;
    }

    public static Pelicula buscarPelicula(ArrayList<Pelicula> peliculas) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Como quieres buscar? (id/titulo): ");
        String metodo = sc.nextLine().toLowerCase();

        switch (metodo) {
            case "id":
                System.out.print("Introduce el ID: ");
                int id = Integer.parseInt(sc.nextLine());
                return obtenerPelicula(peliculas, id);
            case "titulo":
                System.out.print("Introduce el titulo: ");
                String titulo = sc.nextLine();
                return obtenerPelicula(peliculas, titulo);
            default:
                System.out.println("Error: No se reconoce la opcion: " + metodo);
                return null;
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
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();


        Pelicula p1 = new Pelicula("Titanic", "director", 120, "genero", 2001, 1);
        Pelicula p2 = new Pelicula("El lobo de wall street", "director2", 140, "genero", 2012, 10);
        peliculas.add(p1);
        peliculas.add(p2);
        listarPeliculas(peliculas);
        Pelicula p3 = buscarPelicula(peliculas);
        if (p3 != null) System.out.println("Pelicula encontrada; ID: " + p3.getId());
    }
}
