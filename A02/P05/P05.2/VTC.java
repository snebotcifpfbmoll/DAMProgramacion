import java.util.*;

public class VTC extends Vehiculo {
    private int horas_trabajadas;
    private int radio_accion;
    private String ciudad;

    public void setHorasTrabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getHorasTrabajadas() {
        return this.horas_trabajadas;
    }

    public void setRadioAccion(int radio_accion) {
        this.radio_accion = radio_accion;
    }

    public int getRadioAccion() {
        return this.radio_accion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public VTC(int horas_trabajadas, int radio_accion, String ciudad) {
        super();
        this.horas_trabajadas = horas_trabajadas;
        this.radio_accion = radio_accion;
        this.ciudad = ciudad;
    }

    public VTC(VTC vtc) {
        super((Vehiculo) vtc);
        this.horas_trabajadas = vtc.horas_trabajadas;
        this.radio_accion = vtc.radio_accion;
        this.ciudad = vtc.ciudad;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Radio accion: " + getRadioAccion());
        System.out.println("Ciudad: " + getCiudad());
    }
}
