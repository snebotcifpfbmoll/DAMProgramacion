import java.util.*;

public class P01E07 {
    public static void e01(Scanner sc) {
        int NSTRINGS = 5;
        String[] strs = new String[NSTRINGS];

        for (int i = 0; i < NSTRINGS; i ++) {
            System.out.print("Introduce un numero: "); // Preguntar un numero
            strs[i] = sc.nextLine(); // Leer linea
        }

        System.out.println("Has introducido:");
        for (int i = 0; i < NSTRINGS; i ++) {
            System.out.println(strs[i]);
        }

        sc.close();
    }

    public static void e02(Scanner sc) {
        int NSTRINGS = 5;
        String[] strs = new String[NSTRINGS];

        for (int i = 0; i < NSTRINGS; i ++) {
            System.out.print("Introduce un numero: ");
            strs[i] = sc.nextLine();
        }

        System.out.println("Has introducido:");
        for (int i = NSTRINGS - 1; i >= 0; i --) {
            System.out.println(strs[i]);
        }
    }

    public static void e03(Scanner sc) {
        final int NSTRINGS = 5;
        List<Integer> num_positivo = new ArrayList<>();
        List<Integer> num_negativo = new ArrayList<>();
        int num_zero = 0;

        for (int i = 0; i < NSTRINGS; i ++) {
            System.out.print("Introduce un numero: ");
            int num = Integer.parseInt(sc.nextLine());

            if (num > 0) {
                num_positivo.add(num);
            } else if (num < 0) {
                num_negativo.add(num);
            } else {
                num_zero ++;
            }
        }

        int s_positivo = num_positivo.size();
        int media_positivos = 0;
        if (s_positivo > 0) {
            int n_positivos = 0;
            for (int i = 0; i < s_positivo; i ++) n_positivos += num_positivo.get(i);
            media_positivos = n_positivos / s_positivo;
        }

        int s_negativo = num_negativo.size();
        int media_negativos = 0;
        if (s_negativo > 0) {
            int n_negativos = 0;
            for (int i = 0; i < s_negativo; i ++) n_negativos += num_negativo.get(i);
            media_negativos = n_negativos / s_negativo;
        }

        System.out.println("Media numeros positivos: " + media_positivos);
        System.out.println("Media numeros negativos: " + media_negativos);
        System.out.println("Numero de zeros: " + num_zero);
    }

    public static void e04(Scanner sc) {
        final int n_veces = 10;
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n_veces; i ++) {
            System.out.print("Introduce un numero: ");
            int num = Integer.parseInt(sc.nextLine());
            nums.add(num);
        }

        for (int i = 0; i < n_veces / 2; i ++) {
            int pos_1 = i;
            int pos_2 = (n_veces - i) - 1;
            System.out.println("Numero " + (pos_1 + 1) + ": " + nums.get(pos_1));
            System.out.println("Numero " + (pos_2 + 1) + ": " + nums.get(pos_2));
        }
    }

    public static void e05(Scanner sc) {
        final int n_veces = 10;
        List<Integer> tabla_1 = new ArrayList<>();
        List<Integer> tabla_2 = new ArrayList<>();
        List<Integer> tabla_final = new ArrayList<>();

        System.out.println("Tabla 1");
        for (int i = 0; i < n_veces; i ++) {
            System.out.print("Introduce un numero: ");
            int num = Integer.parseInt(sc.nextLine());
            tabla_1.add(num);
        }

        System.out.println("\nTabla 2");
        for (int i = 0; i < n_veces; i ++) {
            System.out.print("Introduce un numero: ");
            int num = Integer.parseInt(sc.nextLine());
            tabla_2.add(num);
        }

        for (int i = 0; i < n_veces; i ++) {
            tabla_final.add(tabla_1.get(i));
            tabla_final.add(tabla_2.get(i));
        }

        System.out.print("Tabla final: ");
        for (int i = 0; i < tabla_final.size(); i ++) {
            if (i == tabla_final.size() - 1) {
                System.out.println(tabla_final.get(i) + ".");
            } else {
                System.out.print(tabla_final.get(i) + ", ");
            }
        }
    }

    public static void e06(Scanner sc) {
        final int n_veces = 12;
        final int n_elementos = 3;
        List<Integer> tabla_1 = new ArrayList<>();
        List<Integer> tabla_2 = new ArrayList<>();
        List<Integer> tabla_final = new ArrayList<>();

        System.out.println("Tabla 1");
        for (int i = 0; i < n_veces; i ++) {
            System.out.print("Introduce un numero: ");
            int num = Integer.parseInt(sc.nextLine());
            tabla_1.add(num);
        }

        System.out.println("\nTabla 2");
        for (int i = 0; i < n_veces; i ++) {
            System.out.print("Introduce un numero: ");
            int num = Integer.parseInt(sc.nextLine());
            tabla_2.add(num);
        }

        for (int i = 0; i < n_veces / n_elementos; i ++) {
            for (int j = i * n_elementos; j < i * n_elementos + n_elementos; j ++) tabla_final.add(tabla_1.get(j));
            for (int j = i * n_elementos; j < i * n_elementos + n_elementos; j ++) tabla_final.add(tabla_2.get(j));
        }

        System.out.print("Tabla final: ");
        for (int i = 0; i < tabla_final.size(); i ++) {
            if (i == tabla_final.size() - 1) {
                System.out.println(tabla_final.get(i) + ".");
            } else {
                System.out.print(tabla_final.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("\t1) E01");
        System.out.println("\t2) E02");
        System.out.println("\t3) E03");
        System.out.println("\t4) E04");
        System.out.println("\t5) E05");
        System.out.println("\t6) E06");
        System.out.println("\t7) Salir");
        System.out.print("\n> ");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion) {
            case 1:
                e01(sc);
                break;
            case 2:
                e02(sc);
                break;
            case 3:
                e04(sc);
                break;
            case 4:
                e04(sc);
                break;
            case 5:
                e05(sc);
                break;
            case 6:
                e06(sc);
                break;
            case 7:
                break;
            default:
                System.out.println("La opcion " + opcion + " no existe.");
                break;
        }

        sc.close();
    }
}
