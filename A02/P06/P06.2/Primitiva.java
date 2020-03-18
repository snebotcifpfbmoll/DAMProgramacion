import java.util.*;

public class Primitiva extends Apuesta {
    private static final int N_NUMS = 6;
    private int[] listaNum = new int[N_NUMS];
    private int aciertos = 0;

    public void setListaNum(int[] listaNum) throws ApuestaException {
        if (!comprobarListaNum(listaNum)) {
            throw new ApuestaException("La lista de numeros debe tener valores entre 1 y 49.");
        }

        this.listaNum = listaNum;
    }

    public int[] getListaNum() {
        return this.listaNum;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getAciertos() {
        return this.aciertos;
    }

    public Primitiva() {
        super();
    }

    public Primitiva(String nombre, String apellidos, int[] listaNum, int aciertos) throws ApuestaException {
        super();

        try {
            super.setNombre(nombre);
            super.setApellidos(apellidos);
        } catch (ApuestaException e) {
            throw e;
        }

        this.listaNum = listaNum;
        this.aciertos = aciertos;
    }

    @Override
    public void mostrarApuesta() {
        super.mostrarApuesta();

        System.out.println("Lista num:");

        int[] lnum = getListaNum();
        for (int i = 0; i < lnum.length; i ++) {
            System.out.println("[" + i + "]: " + lnum[i]);
        }

        System.out.println("Aciertos: " + getAciertos());
    }

    public boolean comprobarListaNum(int[] lnum) {
        int i = 0;
        boolean correcto = true;

        while (i < lnum.length && correcto) {
            if (lnum[i] < 1 || lnum[i] > 49) correcto = false;
            i ++;
        }

        return correcto;
    }

    public static Primitiva crearApuesta() throws ApuestaException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();

        int i = 0;
        int[] listaNum = new int[N_NUMS];
        while (i < listaNum.length) {
            System.out.print("[" + i + "] Introduce un numero: ");
            int num = 0;

            try {
                num = Integer.parseInt(sc.nextLine());
                if (num > 0 && num < 50) {
                    listaNum[i] = num;
                    i ++;
                } else {
                    System.out.println("El numero debe de ser entre 1 y 49.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un numero.");
                continue;
            }
        }

        try {
            return new Primitiva(nombre, apellidos, listaNum, 0);
        } catch (ApuestaException e) {
            throw e;
        }
    }

    public static int[] generarResultado() {
        int[] listaNum = new int[N_NUMS];
        for (int i = 0; i < listaNum.length; i ++) {
            listaNum[i] = Utilidades.randomConRango(1, 49);
        }

        return listaNum;
    }

    public static Primitiva crearAleatorio() throws ApuestaException {
        String nombre = Apuesta.getRandomNombre();
        String apellido = Apuesta.getRandomApellido();

        int[] listaNum = generarResultado();

        try {
            return new Primitiva(nombre, apellido, listaNum, 0);
        } catch (ApuestaException e) {
            throw e;
        }
    }

    public static boolean comprobarResultado(int[] res_1, int[] res_2) {
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
