import java.util.*;

public class Utilidades {
    public static int randomConRango(int min, int max) {
        int rango = Math.abs(min - max) + 1;
        return (int)(Math.random() * rango) + min;
    }
}
