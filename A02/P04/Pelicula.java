import java.util.*;

public class Pelicula {
    private int id;
    private String titulo;
    private String director;
    private double duracion;
    private String genero;
    private int ano;
    private String disponibilidad;
    private int stock;
    private int reservadas;

    public void setId(int id) {
        this.id = id;
    }

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

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public Pelicula(int id, String titulo, String director, double duracion, String genero, int ano, String disponibilidad, int stock, int reservadas) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.ano = ano;
        this.disponibilidad = disponibilidad;
        this.stock = stock;
        this.reservadas = reservadas;
    }

    public Pelicula(Pelicula p) {
        this.id = p.id;
        this.titulo = p.titulo;
        this.director = p.director;
        this.duracion = p.duracion;
        this.genero = p.genero;
        this.ano = p.ano;
        this.disponibilidad = p.disponibilidad;
        this.stock = p.stock;
        this.reservadas = p.reservadas;
    }
}
