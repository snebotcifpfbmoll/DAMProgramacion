import java.util.*;

public class P06 {
    public static void imprimirCaracteristicas(ArrayList<FiguraGeometrica> arr) {
        System.out.println("Calculadora de Serafi Nebot Ginard");
        for (FiguraGeometrica fig : arr) {
            if (fig instanceof Cubo) {
                ((Cubo)fig).calcularArea();
                ((Cubo)fig).calcularVolumen();
            } else if (fig instanceof Esfera) {
                ((Esfera)fig).calcularArea();
                ((Esfera)fig).calcularVolumen();
            } else if (fig instanceof Cilindro) {
                ((Cilindro)fig).calcularArea();
                ((Cilindro)fig).calcularVolumen();
            } else if (fig instanceof Cono) {
                ((Cono)fig).calcularArea();
                ((Cono)fig).calcularVolumen();
            }
        }
    }

    public static int elegirObjeto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una figura.");
        System.out.println("\t1) Cubo.");
        System.out.println("\t2) Esfera.");
        System.out.println("\t3) Cilindro.");
        System.out.println("\t4) Cono.");

        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Cubo cu = new Cubo();
        Esfera es = new Esfera();
        Cilindro ci = new Cilindro();
        Cono co = new Cono(); 

        try {
            cu.pedirDatos();
            es.pedirDatos();
            ci.pedirDatos();
            co.pedirDatos();
        } catch (ExcepcionFigurasGeometricas e) {
            System.out.println(e.getError());
        }

        ArrayList<FiguraGeometrica> arrFiguras = new ArrayList<FiguraGeometrica>();
        arrFiguras.add(cu);
        arrFiguras.add(es);
        arrFiguras.add(ci);
        arrFiguras.add(co);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("==== MENU ====");
            System.out.println("\t1) Calcular area.");
            System.out.println("\t2) Calcular volumen.");
            System.out.println("\t3) Mostrar caracteristicas.");
            System.out.println("\t4) Salir.");
            System.out.print("\n> ");

            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    {
                        int obj = elegirObjeto();
                        switch (obj) {
                            case 1:
                                cu.calcularArea();
                                break;
                            case 2:
                                es.calcularArea();
                                break;
                            case 3:
                                ci.calcularArea();
                                break;
                            case 4:
                                co.calcularArea();
                                break;
                            default:
                                System.out.println("La opcion " + obj + " no es valida.");
                                break;
                        }
                    }
                    break;
                case 2:
                    {
                        int obj = elegirObjeto();
                        switch (obj) {
                            case 1:
                                cu.calcularVolumen();
                                break;
                            case 2:
                                es.calcularVolumen();
                                break;
                            case 3:
                                ci.calcularVolumen();
                                break;
                            case 4:
                                co.calcularVolumen();
                                break;
                            default:
                                System.out.println("La opcion " + obj + " no es valida.");
                                break;
                        }
                    }
                    break;
                case 3:
                    imprimirCaracteristicas(arrFiguras);
                    break;
                case 4:
                    // va a salir del bucle
                    break;
                default:
                    System.out.println("La opcion " + opcion + " no es valida.");
                    break;
            }
        }
    }
}
