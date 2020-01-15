import java.util.*;

public class p02 {
    public static void ej01() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                matriz[i][j] = i + j;
                System.out.println("matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }

    public static void ej02() {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int matriz_tmp[][] = new int[4][4];
        int counter = 0;
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                System.out.print("Introduce valor matriz[" + i + "][" + j + "]: ");
                int valor = sc.nextInt();
                matriz[i][j] = valor;
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

    public static void ej03() {
        int matriz_1[][] = new int[3][3];
        int matriz_2[][] = new int[3][3];
        for (int i = 0; i < matriz_1.length; i ++) {
            for (int j = 0; j < matriz_1[i].length; j ++) {
                matriz_1[i][j] = (int)(Math.random() * 100) % 100;
                matriz_2[i][j] = (int)(Math.random() * 100) % 100;
            }
        }
        int suma = 0;
        for (int i = 0; i < matriz_1.length; i ++) {
            for (int j = 0; j < matriz_1[i].length; j ++) {
                suma += matriz_1[i][j] + matriz_2[i][j];
            }
        }
        System.out.println("Suma: " + suma);
    }

    public static void ej04() {
        int matriz[][] = new int[7][7];
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) matriz[i][j] = (i == j ? 1 : 0);
        }
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void ej05() {
        int matriz[][] = new int[8][6];
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void ej06() {
        Scanner sc = new Scanner(System.in);
        int marco_1 = 0;
        int marco_2 = 0;
        do {
            System.out.print("Introduce el primer valor del marco: ");
            marco_1 = sc.nextInt();
            System.out.print("Introduce el segundo valor del marco: ");
            marco_2 = sc.nextInt();
            if (marco_1 < 1 || marco_2 < 1) System.out.println("Los valores deben ser 1 o mayor.");
        } while (marco_1 < 1 && marco_2 < 1);
        int matriz[][] = new int[marco_1][marco_2];
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matriz.length; i ++) {
            for (int j = 0; j < matriz[i].length; j ++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
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
                ej03();
                break;
            case 4:
                ej04();
                break;
            case 5:
                ej05();
                break;
            case 6:
                ej06();
                break;
            case 7:
                break;
            default:
                System.out.println("El valor " + opcion + " no se reconoce.");
                break;
        }
    }
}
