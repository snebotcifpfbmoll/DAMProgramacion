import java.util.*;

public class Vehiculo {
    private int id;
    private String matricula;
    private String modelo;
    private int potencia;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
}
