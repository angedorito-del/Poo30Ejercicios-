import java.util.Scanner;

/** Bloque B: Comparaciones y Operadores Relacionales (Ejercicios 11 al 20). */
public class BloqueB {

    public static final String NOMBRE = "Bloque B: Comparaciones y Operadores Relacionales";
    public static final int PRIMER_EJERCICIO = 11;
    public static final String[] TITULOS = {
            "Verificacion de Punto de Ebullicion",
            "Comprobacion de Multiplo de 7",
            "Capacidad Maxima de Elevador",
            "Verificacion de Numero Impar",
            "Comparacion de Perimetros: Cuadrado vs Triangulo Equilatero",
            "Comprobacion de Saldo Suficiente en Cajero",
            "Verificacion de Cuadrado Perfecto Igualado",
            "Control de Inventario Minimo",
            "Evaluacion de Pendiente Positiva",
            "Deteccion de Cifra Final Igual a 5"
    };

    /** Ejecuta el ejercicio numero n (11 al 20). */
    public static void ejecutar(int n, Scanner sc) {
        switch (n) {
            case 11 -> ejercicio11(sc);
            case 12 -> ejercicio12(sc);
            case 13 -> ejercicio13(sc);
            case 14 -> ejercicio14(sc);
            case 15 -> ejercicio15(sc);
            case 16 -> ejercicio16(sc);
            case 17 -> ejercicio17(sc);
            case 18 -> ejercicio18(sc);
            case 19 -> ejercicio19(sc);
            case 20 -> ejercicio20(sc);
        }
    }

    // 11. Temperatura >= 100
    public static void ejercicio11(Scanner sc) {
        System.out.print("Temperatura del liquido (C): ");
        double temp = sc.nextDouble();
        boolean hierve = temp >= 100.0;
        System.out.println("Alcanzo el punto de ebullicion: " + hierve);
    }

    // 12. Multiplo de 7
    public static void ejercicio12(Scanner sc) {
        System.out.print("Numero entero: ");
        int n = sc.nextInt();
        boolean multiplo = n % 7 == 0;
        System.out.println("Es divisible entre 7: " + multiplo);
    }

    // 13. Carga total <= 320
    public static void ejercicio13(Scanner sc) {
        System.out.print("Peso del pasajero 1 (kg): ");
        double p1 = sc.nextDouble();
        System.out.print("Peso del pasajero 2 (kg): ");
        double p2 = sc.nextDouble();
        System.out.print("Peso del pasajero 3 (kg): ");
        double p3 = sc.nextDouble();
        System.out.print("Peso del pasajero 4 (kg): ");
        double p4 = sc.nextDouble();
        double total = p1 + p2 + p3 + p4;
        boolean permitido = total <= 320.0;
        System.out.println("Carga total: " + total + " kg");
        System.out.println("No rebasa el limite: " + permitido);
    }

    // 14. Impar: n % 2 != 0
    public static void ejercicio14(Scanner sc) {
        System.out.print("Numero entero: ");
        int n = sc.nextInt();
        boolean impar = n % 2 != 0;
        System.out.println("Es impar: " + impar);
    }

    // 15. Perimetro cuadrado (4L) < perimetro triangulo equilatero (3L)
    public static void ejercicio15(Scanner sc) {
        System.out.print("Lado del cuadrado: ");
        double ladoC = sc.nextDouble();
        System.out.print("Lado del triangulo equilatero: ");
        double ladoT = sc.nextDouble();
        double perimetroC = 4 * ladoC;
        double perimetroT = 3 * ladoT;
        boolean menor = perimetroC < perimetroT;
        System.out.println("Perimetro cuadrado: " + perimetroC);
        System.out.println("Perimetro triangulo: " + perimetroT);
        System.out.println("El cuadrado tiene menor perimetro: " + menor);
    }

    // 16. Saldo >= retiro
    public static void ejercicio16(Scanner sc) {
        System.out.print("Saldo actual: ");
        double saldo = sc.nextDouble();
        System.out.print("Monto a retirar: ");
        double retiro = sc.nextDouble();
        boolean suficiente = saldo >= retiro;
        System.out.println("Saldo suficiente: " + suficiente);
    }

    // 17. a * a == b
    public static void ejercicio17(Scanner sc) {
        System.out.print("Entero a: ");
        long a = sc.nextLong();
        System.out.print("Entero b: ");
        long b = sc.nextLong();
        boolean igual = a * a == b;
        System.out.println("El cuadrado de a es igual a b: " + igual);
    }

    // 18. (existencia - vendidas) < 15
    public static void ejercicio18(Scanner sc) {
        System.out.print("Existencia actual: ");
        int existencia = sc.nextInt();
        System.out.print("Cantidad vendida hoy: ");
        int vendidas = sc.nextInt();
        int restantes = existencia - vendidas;
        boolean bajoMinimo = restantes < 15;
        System.out.println("Unidades restantes: " + restantes);
        System.out.println("Por debajo del stock minimo (15): " + bajoMinimo);
    }

    // 19. m = (y2 - y1) / (x2 - x1) > 0
    public static void ejercicio19(Scanner sc) {
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2 (distinto de x1): ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        double pendiente = (y2 - y1) / (x2 - x1);
        boolean positiva = pendiente > 0;
        System.out.println("Pendiente = " + pendiente);
        System.out.println("Pendiente positiva: " + positiva);
    }

    // 20. Ultimo digito == 5
    public static void ejercicio20(Scanner sc) {
        System.out.print("Entero positivo: ");
        long n = sc.nextLong();
        boolean termina5 = n % 10 == 5;
        System.out.println("Termina en 5: " + termina5);
    }
}
