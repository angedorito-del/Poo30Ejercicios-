import java.util.Scanner;

/** Bloque A: Calculos Aritmeticos y Jerarquia (Ejercicios 1 al 10). */
public class BloqueA {

    public static final String NOMBRE = "Bloque A: Calculos Aritmeticos y Jerarquia";
    public static final int PRIMER_EJERCICIO = 1;
    public static final String[] TITULOS = {
            "Conversion de Kilometros a Millas y Pies",
            "Volumen de una Esfera",
            "Calculo de Propina e Impuesto en Restaurante",
            "Desglose de Dias en Semanas y Dias Restantes",
            "Velocidad Final en Movimiento Rectilineo",
            "Promedio Armonico de Dos Valores",
            "Reparto de Dulces en Bolsas",
            "Evaluacion de Expresion Racional Compuesta",
            "Costo Total de Pintura por Metro Cuadrado",
            "Extraccion del Ultimo Digito de un Entero"
    };

    /** Ejecuta el ejercicio numero n (1 al 10). */
    public static void ejecutar(int n, Scanner sc) {
        switch (n) {
            case 1 -> ejercicio1(sc);
            case 2 -> ejercicio2(sc);
            case 3 -> ejercicio3(sc);
            case 4 -> ejercicio4(sc);
            case 5 -> ejercicio5(sc);
            case 6 -> ejercicio6(sc);
            case 7 -> ejercicio7(sc);
            case 8 -> ejercicio8(sc);
            case 9 -> ejercicio9(sc);
            case 10 -> ejercicio10(sc);
        }
    }

    // 1. Kilometros a millas y pies
    public static void ejercicio1(Scanner sc) {
        System.out.print("Distancia en kilometros: ");
        double km = sc.nextDouble();
        double millas = km * 0.621371;
        double pies = km * 3280.84;
        System.out.println(km + " km = " + millas + " millas");
        System.out.println(km + " km = " + pies + " pies");
    }

    // 2. Volumen de una esfera: (4.0 / 3.0) evita la division entera
    public static void ejercicio2(Scanner sc) {
        System.out.print("Radio de la esfera: ");
        double r = sc.nextDouble();
        final double PI = 3.14159;
        double volumen = (4.0 / 3.0) * PI * r * r * r;
        System.out.println("Volumen = " + volumen);
    }

    // 3. IVA 16%, propina 15% sobre el subtotal sin IVA, gran total
    public static void ejercicio3(Scanner sc) {
        System.out.print("Subtotal de la cuenta: ");
        double subtotal = sc.nextDouble();
        double iva = subtotal * 0.16;
        double propina = subtotal * 0.15;
        double total = subtotal + iva + propina;
        System.out.println("IVA (16%): " + iva);
        System.out.println("Propina (15%): " + propina);
        System.out.println("Total a pagar: " + total);
    }

    // 4. Semanas completas y dias sobrantes
    public static void ejercicio4(Scanner sc) {
        System.out.print("Total de dias: ");
        int totalDias = sc.nextInt();
        int semanas = totalDias / 7;
        int diasSueltos = totalDias % 7;
        System.out.println("Semanas completas: " + semanas);
        System.out.println("Dias restantes: " + diasSueltos);
    }

    // 5. v = v0 + (a * t)
    public static void ejercicio5(Scanner sc) {
        System.out.print("Velocidad inicial (v0): ");
        double v0 = sc.nextDouble();
        System.out.print("Aceleracion (a): ");
        double a = sc.nextDouble();
        System.out.print("Tiempo (t): ");
        double t = sc.nextDouble();
        double vf = v0 + (a * t);
        System.out.println("Velocidad final = " + vf);
    }

    // 6. Media armonica = 2ab / (a + b)
    public static void ejercicio6(Scanner sc) {
        System.out.print("Numero a: ");
        double a = sc.nextDouble();
        System.out.print("Numero b: ");
        double b = sc.nextDouble();
        double media = (2 * a * b) / (a + b);
        System.out.println("Media armonica = " + media);
    }

    // 7. Bolsas llenas y caramelos sobrantes
    public static void ejercicio7(Scanner sc) {
        System.out.print("Total de caramelos: ");
        int caramelos = sc.nextInt();
        System.out.print("Capacidad de cada bolsa: ");
        int capacidad = sc.nextInt();
        int bolsasLlenas = caramelos / capacidad;
        int sobrantes = caramelos % capacidad;
        System.out.println("Bolsas llenas: " + bolsasLlenas);
        System.out.println("Caramelos sin empaquetar: " + sobrantes);
    }

    // 8. (x + 2y) / (z - x)
    public static void ejercicio8(Scanner sc) {
        System.out.print("Valor x: ");
        double x = sc.nextDouble();
        System.out.print("Valor y: ");
        double y = sc.nextDouble();
        System.out.print("Valor z: ");
        double z = sc.nextDouble();
        double resultado = (x + 2 * y) / (z - x);
        System.out.println("Resultado = " + resultado);
    }

    // 9. Area y costo de pintura
    public static void ejercicio9(Scanner sc) {
        System.out.print("Ancho de la pared (m): ");
        double ancho = sc.nextDouble();
        System.out.print("Alto de la pared (m): ");
        double alto = sc.nextDouble();
        System.out.print("Precio por metro cuadrado: ");
        double precio = sc.nextDouble();
        double area = ancho * alto;
        double costo = area * precio;
        System.out.println("Area = " + area + " m2");
        System.out.println("Costo total = " + costo);
    }

    // 10. Ultimo digito con residuo
    public static void ejercicio10(Scanner sc) {
        System.out.print("Numero entero positivo: ");
        long numero = sc.nextLong();
        long ultimo = numero % 10;
        System.out.println("Ultimo digito: " + ultimo);
    }
}
