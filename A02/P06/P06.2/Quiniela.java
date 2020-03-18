import java.util.*;

public class Quiniela extends Apuesta {
    private static final int N_PARTIDOS = 15;
    // he decidido hacerlo con un array de enums en lugar de los simbolos 1, x, 2
    // creo que asi es mas intuitivo
    private ResultadoPartido[] resultados = new ResultadoPartido[N_PARTIDOS];

    public void setResultados(ResultadoPartido[] resultados) {
        this.resultados = resultados;
    }

    public ResultadoPartido[] getResultados() {
        return this.resultados;
    }

    public Quiniela() {
        super();
    }

    public Quiniela(String nombre, String apellidos, ResultadoPartido[] resultados) throws ApuestaException {
        super();

        try {
            super.setNombre(nombre);
            super.setApellidos(apellidos);
        } catch (ApuestaException e) {
            throw e;
        }

        this.resultados = resultados;
    }

    @Override
    public void mostrarApuesta() {
        super.mostrarApuesta();

        System.out.println("Resultado partidos:");

        ResultadoPartido[] res = getResultados();
        for (int i = 0; i < res.length; i ++) {
            switch (res[i]) {
                case GANA_CASA:
                    System.out.println("[" + i + "]: Gana casa");
                    break;
                case EMPATE:
                    System.out.println("[" + i + "]: Empate");
                    break;
                case GANA_FUERA:
                    System.out.println("[" + i + "]: Gana fuera");
                    break;
                default:
                    System.out.println("No se reconoce el valor.");
                    break;
            }
        }
    }
    
    public static Quiniela crearApuesta() throws ApuestaException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.println("Introduce los resultados de los partidos (CASA, EMPATE, FUERA)");

        ResultadoPartido[] apuestas = new ResultadoPartido[N_PARTIDOS];
        for (int i = 0; i < N_PARTIDOS; i ++) {
            System.out.print("Resultado partido " + i + ": ");
            String res = sc.nextLine().toUpperCase();

            if (res.equals("CASA")) {
                apuestas[i] = ResultadoPartido.GANA_CASA;
            } else if (res.equals("EMPATE")) {
                apuestas[i] = ResultadoPartido.EMPATE;
            } else if (res.equals("FUERA")) {
                apuestas[i] = ResultadoPartido.GANA_FUERA;
            } else {
                System.out.println("Solo se permiten los valores: (CASA, EMPATE, FUERA)");
                i--;
            }
        }

        try {
            return new Quiniela(nombre, apellidos, apuestas);
        } catch (ApuestaException e) {
            throw e;
        }
    }

    public static ResultadoPartido[] generarResultado() {
         ResultadoPartido[] resultados = new ResultadoPartido[N_PARTIDOS];
         for (int i = 0; i < resultados.length; i ++) {
             int random = Utilidades.randomConRango(0, 2);
             
             switch (random) {
                 case 0:
                     resultados[i] = ResultadoPartido.GANA_CASA;
                     break;
                 case 1:
                     resultados[i] = ResultadoPartido.EMPATE;
                     break;
                 case 2:
                     resultados[i] = ResultadoPartido.GANA_FUERA;
                     break;
             }
         }

         return resultados;
    }

    public static Quiniela crearAleatorio() throws ApuestaException {
         String nombre = Apuesta.getRandomNombre();
         String apellido = Apuesta.getRandomApellido();

         ResultadoPartido[] resultados = generarResultado();

         try {
             return new Quiniela(nombre, apellido, resultados);
         } catch (ApuestaException e) {
             throw e;
         }
     }
   
    public static boolean comprobarResultado(ResultadoPartido[] res_1, ResultadoPartido[] res_2) {
        if (res_1.length != res_2.length) return false;

        int i = 0;
        boolean iguales = true;
        while (i < res_1.length && iguales) {
            if (res_1[i] != res_2[i]) iguales = false;
            i ++;
        }

        return iguales;
    }
}
