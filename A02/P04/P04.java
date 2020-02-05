import java.util.*;

public class P04 {
    private static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    public static Pelicula obtenerPelicula(int id) {
        for (Pelicula p : peliculas) if (p.getId() == id) return p;
        return null;
    }

    public static void listarPeliculas() {
        System.out.println("\n==== PELICULAS ====");
        for (Pelicula p : peliculas) {
            System.out.println("ID: " + p.getId());
            System.out.println("Titulo: " + p.getTitulo());
            System.out.println("Director: " + p.getDirector());
            System.out.println("Duracion: " + p.getDuracion());
            System.out.println("Genero: " + p.getGenero());
            System.out.println("Ano: " + p.getAno());
            System.out.println("Disponible: " + p.getDisponible());
            System.out.println("Stock: " + p.getStock());
            System.out.println("Reservadas: " + p.getReservadas());
            System.out.println();
        }
    }

    public static void reservarPelicula() {
        Scanner sc = new Scanner(System.in);

        listarPeliculas();

        System.out.println("==== RESERVAR PELICULA ====");
        System.out.print("ID de la pelicula: ");

        int id = Integer.parseInt(sc.nextLine());
        Pelicula pelicula = obtenerPelicula(id);

        if (pelicula == null) {
            System.out.println("Error: El ID especificado no corresponde a ninguna pelicula.");
            return;
        }

        if (!pelicula.getDisponible()) {
            System.out.println("Error: La pelicula no esta disponible.");
            return;
        } else {
            //pelicula.setReservadas(
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i ++) {
            Pelicula p = Pelicula.anadirPelicula();
            if (p != null) peliculas.add(p);
        }

        listarPeliculas();
        System.out.println("Numero de peliculas: " + Pelicula.stock_total);
    }
}
