public class GestionarPersonas {
    public static void main(String[] args) {
        Persona p = Persona.solicitarDatos();
        System.out.println("\n== Datos de la persona ==");
        p.mostrarAtributos();
    }
}
