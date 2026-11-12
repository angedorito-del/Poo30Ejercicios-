import java.util.Scanner;

/** Bloque C: Condiciones Compuestas y Operadores Logicos (Ejercicios 21 al 30). */
public class BloqueC {

    public static final String NOMBRE = "Bloque C: Condiciones Compuestas y Operadores Logicos";
    public static final int PRIMER_EJERCICIO = 21;
    public static final String[] TITULOS = {
            "Rango de Temperatura Confortable",
            "Alerta de Nivel Critico en Tanque",
            "Divisibilidad Simultanea entre 2 y 5",
            "Validacion de Calificacion Valida en Escala 0 a 10",
            "Acceso Gratuito al Transporte Publico",
            "Numero Positivo de Dos Digitos",
            "Verificacion de Triangulo Equilatero",
            "Negacion de Multiplo de 3",
            "Elegibilidad para Donacion de Sangre",
            "Evaluacion Final de Desempeno Integral"
    };

    /** Ejecuta el ejercicio numero n (21 al 30). */
    public static void ejecutar(int n, Scanner sc) {
        switch (n) {
            case 21 -> ejercicio21(sc);
            case 22 -> ejercicio22(sc);
            case 23 -> ejercicio23(sc);
            case 24 -> ejercicio24(sc);
            case 25 -> ejercicio25(sc);
            case 26 -> ejercicio26(sc);
            case 27 -> ejercicio27(sc);
            case 28 -> ejercicio28(sc);
            case 29 -> ejercicio29(sc);
            case 30 -> ejercicio30(sc);
        }
    }

    // 21. 18.0 <= temp <= 25.0
    public static void ejercicio21(Scanner sc) {
        System.out.print("Temperatura ambiente (C): ");
        double temp = sc.nextDouble();
        boolean confort = temp >= 18.0 && temp <= 25.0;
        System.out.println("Temperatura confortable: " + confort);
    }

    // 22. nivel < 10 || nivel > 95
    public static void ejercicio22(Scanner sc) {
        System.out.print("Porcentaje de llenado (0 a 100): ");
        double nivel = sc.nextDouble();
        boolean alerta = nivel < 10 || nivel > 95;
        System.out.println("Alerta de nivel critico: " + alerta);
    }

    // 23. Divisible entre 2 y entre 5
    public static void ejercicio23(Scanner sc) {
        System.out.print("Numero entero: ");
        int n = sc.nextInt();
        boolean divisible = n % 2 == 0 && n % 5 == 0;
        System.out.println("Divisible entre 2 y 5: " + divisible);
    }

    // 24. 0.0 <= calificacion <= 10.0
    public static void ejercicio24(Scanner sc) {
        System.out.print("Calificacion: ");
        double cal = sc.nextDouble();
        boolean valida = cal >= 0.0 && cal <= 10.0;
        System.out.println("Calificacion valida: " + valida);
    }

    // 25. edad < 6 || credencial == 1
    public static void ejercicio25(Scanner sc) {
        System.out.print("Edad del pasajero: ");
        int edad = sc.nextInt();
        System.out.print("Credencial de estudiante (1 = si, 0 = no): ");
        int credencial = sc.nextInt();
        boolean gratis = edad < 6 || credencial == 1;
        System.out.println("Viaja gratis: " + gratis);
    }

    // 26. 10 <= num <= 99
    public static void ejercicio26(Scanner sc) {
        System.out.print("Numero entero: ");
        int num = sc.nextInt();
        boolean dosDigitos = num >= 10 && num <= 99;
        System.out.println("Positivo de dos digitos: " + dosDigitos);
    }

    // 27. l1 == l2 && l2 == l3 && l1 > 0
    public static void ejercicio27(Scanner sc) {
        System.out.print("Lado 1: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado 2: ");
        double l2 = sc.nextDouble();
        System.out.print("Lado 3: ");
        double l3 = sc.nextDouble();
        boolean equilatero = l1 == l2 && l2 == l3 && l1 > 0;
        System.out.println("Es triangulo equilatero: " + equilatero);
    }

    // 28. !(n % 3 == 0)
    public static void ejercicio28(Scanner sc) {
        System.out.print("Entero positivo: ");
        int n = sc.nextInt();
        boolean noMultiplo = !(n % 3 == 0);
        System.out.println("NO es multiplo de 3: " + noMultiplo);
    }

    // 29. 18 <= edad <= 65 && peso > 50
    public static void ejercicio29(Scanner sc) {
        System.out.print("Edad (anios): ");
        int edad = sc.nextInt();
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        boolean elegible = edad >= 18 && edad <= 65 && peso > 50.0;
        System.out.println("Puede donar sangre: " + elegible);
    }

    // 30. promedio >= 8.0 y ninguna calificacion < 7.0
    public static void ejercicio30(Scanner sc) {
        System.out.print("Calificacion parcial 1: ");
        double c1 = sc.nextDouble();
        System.out.print("Calificacion parcial 2: ");
        double c2 = sc.nextDouble();
        System.out.print("Calificacion parcial 3: ");
        double c3 = sc.nextDouble();
        double promedio = (c1 + c2 + c3) / 3;
        boolean aprobado = promedio >= 8.0 && c1 >= 7.0 && c2 >= 7.0 && c3 >= 7.0;
        System.out.println("Promedio: " + promedio);
        System.out.println("Desempeno satisfactorio: " + aprobado);
    }
}
