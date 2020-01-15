import java.util.*;

public class p02 {

    public static void ej01() {
        int matriz[][] = new int[5][5];
        // Rellenar
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                matriz[i][j] = i + j;
                System.out.println("matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }

    public static void ej02() {
        int matriz[][] = new int[4][4];
        int matriz_tmp[][] = new int[4][4];
        int counter = 0;
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                matriz[i][j] = counter; // poner 1 para que sean simetricas
                matriz_tmp[j][i] = matriz[i][j];
                counter ++;
            }
        }
        
        boolean iguales = true;
        int index = 0;
        while (iguales && index < matriz.length) {
            int index_j = 0;
            while (iguales && index_j < matriz[index].length) {
                if (matriz[index][index_j] != matriz_tmp[index][index_j]) {
                    iguales = false;
                }
                index_j ++;
            }
            index ++;
        }

        if (iguales) {
            System.out.println("Las matrizes son simetricas.");
        } else {
            System.out.println("Las matrizes no son simetricas.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("\t1) Ejercicio 1");
        System.out.println("\t2) Ejercicio 2");
        System.out.println("\t3) Ejercicio 3");
        System.out.println("\t4) Ejercicio 4");
        System.out.println("\t5) Ejercicio 5");
        System.out.println("\t6) Ejercicio 6");
        System.out.println("\t7) Salir");
        System.out.print("\n> ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ej01();
                break;
            case 2:
                ej02();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("El valor " + opcion + " no se reconoce.");
                break;
        }
    }
}
