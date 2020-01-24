import java.util.*;

public class P03 {
    public static Cuenta obtenerCuenta(ArrayList<Cuenta> cuentas, String num) {
        int i = 0;
        while (i < cuentas.size()) {
            if (cuentas.get(i).getNumero().equals(num)) return cuentas.get(i);
            i ++;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        boolean bucle = true;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("\t1) Crear cuenta.");
            System.out.println("\t2) Ver datos de cuenta.");
            System.out.println("\t3) Ingresar dinero en cuenta.");
            System.out.println("\t4) Retirar dinero en cuenta.");
            System.out.println("\t5) Transferir dinero a otra cuenta.");
            System.out.println("\t6) Salir.");
            System.out.print("\n> ");
            int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    {
                        Cuenta cuenta = Cuenta.crearCuenta();
                        // Comprobar que la cuenta es unica
                        boolean unico = true;
                        int i = 0;
                        while (i < cuentas.size() && unico) {
                            if (cuenta.getNumero().equals(cuentas.get(i).getNumero())) unico = false;
                            i ++;
                        }
    
                        if (!unico) {
                            System.out.println("El numero de cuenta ya existe. La cuenta no se ha creada.");
                            break;
                        }
                        cuentas.add(cuenta);
                    }
                    break;
                case 2:
                    {
                        System.out.print("Numero de cuenta: ");
                        String num = sc.nextLine();
                        // Obtener cuenta
                        Cuenta cuenta = obtenerCuenta(cuentas, num);
                        
                        if (cuenta == null) {
                            System.out.println("El numero de cuenta no existe.");
                            break;
                        }
                        
                        System.out.println("\n==== DATOS DE LA CUENTA ====");
                        System.out.println("Cliente: \t" + cuenta.getCliente());
                        System.out.println("Numero: \t" + cuenta.getNumero());
                        System.out.println("Interes: \t" + cuenta.getInteres());
                        System.out.println("Saldo: \t\t" + cuenta.getSaldo() + "€");
                    }
                    break;
                case 3:
                    {
                        System.out.print("Numero de cuenta: ");
                        String num = sc.nextLine();
                        // Obtener cuenta
                        Cuenta cuenta = obtenerCuenta(cuentas, num);
                        
                        if (cuenta == null) {
                            System.out.println("El numero de cuenta no existe.");
                            break;
                        }

                        System.out.print("Cantidad a ingresar: ");
                        double cantidad = Double.parseDouble(sc.nextLine());
                        if (cuenta.ingresar(cantidad)) {
                            System.out.println("Se ha ingresado " + cantidad + "€ en la cuenta " + cuenta.getNumero() + ".");
                        }
                    }
                    break;
                case 4:
                    {
                        System.out.print("Numero de cuenta: ");
                        String num = sc.nextLine();
                        // Obtener cuenta
                        Cuenta cuenta = obtenerCuenta(cuentas, num);
                        
                        if (cuenta == null) {
                            System.out.println("El numero de cuenta no existe.");
                            break;
                        }

                        System.out.print("Cantidad a retirar: ");
                        double cantidad = Double.parseDouble(sc.nextLine());
                        if (cuenta.reintegro(cantidad)) {
                            System.out.println("Se ha retirado " + cantidad + "€ de la cuenta " + cuenta.getNumero() + ".");
                        }
                    }
                    break;
                case 5:
                    {
                        System.out.print("Numero de cuenta origen: ");
                        String origen = sc.nextLine();
                        Cuenta c_origen = obtenerCuenta(cuentas, origen);
                        
                        if (c_origen == null) {
                            System.out.println("El numero de cuenta no existe.");
                            break;
                        }

                        System.out.print("Numero de cuenta destino: ");
                        String destino = sc.nextLine();
                        Cuenta c_destino = obtenerCuenta(cuentas, destino);
                        
                        if (c_origen == null) {
                            System.out.println("El numero de cuenta no existe.");
                            break;
                        }

                        System.out.print("Importe: ");
                        double cantidad = Double.parseDouble(sc.nextLine());
                        if (c_origen.transferir(c_destino, cantidad)) {
                            System.out.println("Se ha transferido " + cantidad + "€ de la cuenta " + c_origen.getNumero() + " a la cuenta " + c_destino.getNumero() + ".");
                        }
                    }
                    break;
                case 6:
                    bucle = false;
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no existe.");
                    break;
            }
        } while (bucle);
    }
}
