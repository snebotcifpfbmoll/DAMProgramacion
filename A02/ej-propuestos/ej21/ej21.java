import java.util.*;

public class ej21 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i ++) {
            boolean primo = true;
            int j = 2;
            while (primo && j < i) {
                if (i % j == 0) primo = false;
                j ++;
            }

            if (primo) System.out.println(i + " es primo.");
        }
    }
}
