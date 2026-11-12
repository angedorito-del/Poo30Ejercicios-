import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // los decimales se escriben con punto (ej. 3.5)

        boolean salir = false;
        while (!salir) {
            System.out.println();
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. " + BloqueA.NOMBRE);
            System.out.println("2. " + BloqueB.NOMBRE);
            System.out.println("3. " + BloqueC.NOMBRE);
            System.out.println("0. Salir");
            int op = leerEntero(sc, "Elige una opcion: ");

            switch (op) {
                case 1 -> menuBloque(sc, 1, BloqueA.NOMBRE, BloqueA.TITULOS, BloqueA.PRIMER_EJERCICIO);
                case 2 -> menuBloque(sc, 2, BloqueB.NOMBRE, BloqueB.TITULOS, BloqueB.PRIMER_EJERCICIO);
                case 3 -> menuBloque(sc, 3, BloqueC.NOMBRE, BloqueC.TITULOS, BloqueC.PRIMER_EJERCICIO);
                case 0 -> salir = true;
                default -> System.out.println("Opcion no valida.");
            }
        }
        System.out.println("Hasta luego.");
    }

    /** Submenu de un bloque. Devuelve al presionar 0 (regresar). */
    private static void menuBloque(Scanner sc, int bloque, String nombre, String[] titulos, int primero) {
        boolean regresar = false;
        while (!regresar) {
            System.out.println();
            System.out.println("===== " + nombre + " =====");
            for (int i = 0; i < titulos.length; i++) {
                System.out.println((primero + i) + ". " + titulos[i]);
            }
            System.out.println("0. Regresar al menu principal");
            System.out.println("-1. Salir del programa");
            int op = leerEntero(sc, "Elige un ejercicio: ");

            if (op == 0) {
                regresar = true;
            } else if (op == -1) {
                System.out.println("Hasta luego.");
                System.exit(0);
            } else if (op >= primero && op < primero + titulos.length) {
                System.out.println();
                System.out.println("--- Ejercicio " + op + ": " + titulos[op - primero] + " ---");
                try {
                    switch (bloque) {
                        case 1 -> BloqueA.ejecutar(op, sc);
                        case 2 -> BloqueB.ejecutar(op, sc);
                        case 3 -> BloqueC.ejecutar(op, sc);
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println();
                    System.out.println("Dato invalido. Intenta de nuevo.");
                }
                // Descarta lo que quede de la linea actual (salto de linea o dato invalido)
                if (sc.hasNextLine()) sc.nextLine();
                System.out.print("Presiona Enter para continuar...");
                if (sc.hasNextLine()) sc.nextLine();
            } else {
                System.out.println("Opcion no valida.");
            }
        }
    }

    /** Lee un entero del menu, repitiendo hasta recibir uno valido. */
    private static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
            sc.next();
            System.out.println("Escribe un numero entero.");
        }
    }
}
