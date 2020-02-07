import java.util.*;

public class Pelicula {
    private static final int MAX_PELICULAS = 3000; // Maximo de peliculas
    private static int n_peliculas = 0; // Contador de peliculas creadas
    private final int id; // Una vez creada la pelicula el id no deberia cambiar
    private String titulo;
    private String director;
    private double duracion;
    private String genero;
    private int ano;
    private int stock;
    //private boolean disponibilidad; // No hace falta ya que se puede calcular a partir del numero de reservas y el numero de stock
    private static int stock_total = 0;
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

    public boolean getDisponibilidad() {
        // Calcular disponibilidad
        return this.getStock() != this.getReservadas();
    }

    public void setStock(int stock) {
        // Comprobar que no sobrepasamos la cantidad total
        if (this.stock_total + stock <= MAX_PELICULAS) {
            this.stock = stock;
            this.stock_total += stock;
        } else {
            // En caso de sobrepasar el maximo de almazenaje, redondeamos el stock a MAX_PELICULAS
            this.stock = MAX_PELICULAS - this.stock_total;
            this.stock_total = MAX_PELICULAS;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public int setReservadas(int reservadas) {
        // Comprobar que la cantidad de reservadas no sea mayor al numero de stock
        if (reservadas > this.getStock()) {
            System.out.println("Error: No se pueden reservar tantas peliculas.");
            return -1;
        } else {
            this.reservadas = reservadas;
            return 0;
        }
    }

    public int getReservadas() {
        return this.reservadas;
    }

    // La variable stock_total va a ser de solo lectura
    public static int getStockTotal() {
        return stock_total;
    }

    public Pelicula() {
        this.id = n_peliculas ++;
    }

    public Pelicula(String titulo, String director, double duracion, String genero, int ano, int stock) {
        this.id = n_peliculas ++;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.ano = ano;
        this.reservadas = 0; // Siempre va a ser 0 al crear por primera vez

        // Comprobar la capacidad total
        if (this.stock_total + stock <= MAX_PELICULAS) {
            this.stock = stock;
            this.stock_total += stock;
        } else {
            // En caso de sobrepasar el maximo de almazenaje, redondeamos el stock a MAX_PELICULAS
            this.stock = MAX_PELICULAS - this.stock_total;
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
        System.out.print("Stock: ");
        int stock = Integer.parseInt(sc.nextLine());

        if (stock_total + stock > MAX_PELICULAS) {
            System.out.println("Error: No se pueden almazenar tantas peliculas. Numero acutal: " + stock_total + "/MAX_PELICULAS");
            return null;
        }

        return new Pelicula(titulo, director, duracion, genero, ano, stock);
    }

    public void mostrarDatos() {
        System.out.println("ID: " + this.getId());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Duracion: " + this.getDuracion());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Disponible: " + this.getDisponibilidad());
        System.out.println("Stock: " + this.getStock());
        System.out.println("Reservadas: " + this.getReservadas());
    }
}
