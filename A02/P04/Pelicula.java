import java.util.*;

public class Pelicula {
    private static int n_peliculas = 0; // Contador de peliculas creadas
    private final int id; // Una vez creada la pelicula el id no deberia cambiar
    private String titulo;
    private String director;
    private double duracion;
    private String genero;
    private int ano;
    private boolean disponible;
    private int stock;
    public static int stock_total = 0;
    private int reservadas;

    public int getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public void setDisponible(boolean disponibilidad) {
        this.disponible = disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setStock(int stock) {
        // Comprobar la capacidad total
        if (this.stock_total + stock <= 3000) {
            this.stock = stock;
            this.stock_total += stock;
        } else {
            // En caso de sobrepasar el maximo de almazenaje, redondeamos el stock a 3000
            this.stock = 3000 - this.stock_total;
            this.stock_total = 3000;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public void setReservadas(int reservadas) {
        this.reservadas = reservadas;
    }

    public int getReservadas() {
        return this.reservadas;
    }

    public Pelicula() {
        this.id = n_peliculas ++;
    }

    public Pelicula(String titulo, String director, double duracion, String genero, int ano, boolean disponible, int stock, int reservadas) {
        this.id = n_peliculas ++;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.ano = ano;
        this.disponible = disponible;
        this.reservadas = reservadas;

        // Comprobar la capacidad total
        if (this.stock_total + stock <= 3000) {
            System.out.println("y stock_total: " + this.stock_total + stock);
            this.stock = stock;
            this.stock_total += stock;
        } else {
            // En caso de sobrepasar el maximo de almazenaje, redondeamos el stock a 3000
            this.stock = 3000 - this.stock_total;
            System.out.println("n stock_total: " + this.stock_total + stock);
        }
    }

    public static Pelicula anadirPelicula() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== ANADIR PELICULA ====");
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Director: ");
        String director = sc.nextLine();
        System.out.print("Duracion: ");
        double duracion = Double.parseDouble(sc.nextLine());
        System.out.print("Genero: ");
        String genero = sc.nextLine();
        System.out.print("Ano: ");
        int ano = Integer.parseInt(sc.nextLine());
        System.out.print("Disponible (true/false): ");
        boolean disponible = sc.nextLine().equals("true") ? true : false;
        System.out.print("Stock: ");
        int stock = Integer.parseInt(sc.nextLine());

        int stock_total = new Pelicula().stock_total;
        if (stock_total + stock > 3000) {
            System.out.println("Error: No se pueden almazenar tantas peliculas. Numero acutal: " + stock_total + "/3000");
            return null;
        }

        return new Pelicula(titulo, director, duracion, genero, ano, disponible, stock, 0);
    }
}
