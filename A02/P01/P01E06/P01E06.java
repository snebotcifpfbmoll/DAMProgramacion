import java.util.*;

public class P01E06 {
    public static void main(String[] args) {
        final int n_veces = 12;
        final int n_elementos = 3;
        List<Integer> tabla_1 = new ArrayList<>();
        List<Integer> tabla_2 = new ArrayList<>();
        List<Integer> tabla_final = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}
