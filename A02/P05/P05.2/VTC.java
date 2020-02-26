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

    public VTC() {}

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

    @Override
    public void pedirAlta() {
        Scanner sc = new Scanner(System.in);

        super.pedirAlta();

        System.out.print("Horas trabajadas: ");
        int horas_trabajadas = Integer.parseInt(sc.nextLine());
        while (horas_trabajadas > 24) {
            System.out.print("Horas trabajadas (no mayores a 24h): ");
            horas_trabajadas = Integer.parseInt(sc.nextLine());
        }
        setHorasTrabajadas(horas_trabajadas);

        System.out.print("Radio accion: ");
        int radio_accion = Integer.parseInt(sc.nextLine());
        while (radio_accion > 50) {
            System.out.print("Radio accion (no mayor a 50km): ");
            radio_accion = Integer.parseInt(sc.nextLine());
        }
        setRadioAccion(radio_accion);

        System.out.print("Ciudad: ");
        setCiudad(sc.nextLine());
    }
}
