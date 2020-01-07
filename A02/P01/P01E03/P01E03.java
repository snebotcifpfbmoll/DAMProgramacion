import java.util.*;

public class P01E03 {
    public static void main(String[] args) {
        final int NSTRINGS = 5;
        List<Integer> num_positivo = new ArrayList<>();
        List<Integer> num_negativo = new ArrayList<>();
        int num_zero = 0;
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}
