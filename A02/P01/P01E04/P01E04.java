import java.util.*;

public class P01E04 {
    public static void main(String[] args) {
        final int n_veces = 10;
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }
}
