import java.util.*;

public class CajeroAutomatico {
    private static int id_cajero_ultimo = 0;
    private final int id_cajero = id_cajero_ultimo++;
    private static final int N_BILLETES = 7;
    private int billetes[][] = {{500, 10}, {200, 0}, {100, 0}, {50, 27}, {20, 0}, {10, 18}, {5, 25}};
    private ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();

    public int getIdCajeroUltimo() {
        return this.id_cajero_ultimo;
    }

    public int getIdCajero() {
        return this.id_cajero;
    }

    public int[][] getBilletes() {
        return this.billetes;
    }

    public void setBilletes(int [][]b) {
        this.billetes = b;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return this.tarjetas;
    }

    public void anadirTarjeta(Tarjeta t) {
        this.tarjetas.add(t);
    }

    public CajeroAutomatico() {}

    public CajeroAutomatico(ArrayList<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public CajeroAutomatico(CajeroAutomatico c) {
        this.billetes = c.getBilletes();
        this.tarjetas = c.getTarjetas();
    }

    public void mostrarCajero() {
        for (int i = 0; i < N_BILLETES; i ++) {
            int[][] billetes = getBilletes();
            System.out.println(billetes[i][1] + " billetes de " + billetes[i][0] + "€.");
        }
    }

    public int[][] comprobarDevolucion(double cantidad) {
        int i = 0;
        double cantidad_tmp = cantidad;
        int[][] billetes = getBilletes();
        int[][] billetes_tmp = Arrays.copyOf(billetes, billetes.length);

        while (i < N_BILLETES) {
            if (cantidad_tmp >= billetes_tmp[i][0] && billetes_tmp[i][1] > 0) {
                cantidad_tmp -= billetes_tmp[i][0];
                billetes_tmp[i][1]--;
            } else {
                i++;
            }
        }

        return cantidad_tmp == 0 ? billetes_tmp : null;
    }

    public void sacarDinero() throws ExcepcionCajero {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("==== SACAR DINERO ====");
        System.out.println("======================");
        System.out.print("Introduce tu NIF: ");
        String nif = sc.nextLine();

        int i = 0;
        int indice_tarjeta = 0;
        boolean encontrado = false;
        while (!encontrado && i < getTarjetas().size()) {
            if (getTarjetas().get(i).getNif().equals(nif)) {
                encontrado = true;
                indice_tarjeta = i;
            }
            i ++;
        }

        Tarjeta tarjeta = getTarjetas().get(indice_tarjeta);
        if (encontrado) {
            System.out.print("Introduce el PIN: ");
            int pin = Integer.parseInt(sc.nextLine());

            if (pin == tarjeta.getPin()) {
                try {
                    System.out.print("Cantidad a sacar: ");
                    double cantidad = Double.parseDouble(sc.nextLine());
                    int[][] billetes = comprobarDevolucion(cantidad);

                    if (billetes != null) {
                        if (tarjeta instanceof TarjetaDebito) {
                            ((TarjetaDebito)tarjeta).disminuirSaldoDisponible(cantidad);
                        } else if (tarjeta instanceof TarjetaCredito) {
                            ((TarjetaCredito)tarjeta).disminuirSaldoDisponible(cantidad);
                        }
                        setBilletes(billetes);
                    } else {
                        throw new ExcepcionCajero();
                    }
                } catch (SaldoInsuficienteException e) {
                    System.out.println("No hay saldo suficiente.");
                }
            } else {
                System.out.println("El PIN no es correcto.");
            }
        } else {
            System.out.println("No se ha encontrado el NIF.");
        }
    }
}
