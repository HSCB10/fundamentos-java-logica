package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoBasicoExcepciones {

    public static void ejemploTryCatchDivision() {
        try {
            int resultado = 10 / 0; // Provoca ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error capturado: División por cero.");
        }
    }

    public static void ejemploTryCatchInput() {
        // Usamos try-with-resources para cerrar el Scanner automáticamente y evitar errores
        try (Scanner sc = new Scanner("texto_en_lugar_de_numero")) { 
            System.out.println("Intentando leer un entero...");
            int numero = sc.nextInt(); 
            System.out.println("Número leído: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se esperaba un número entero pero se recibió texto.");
        }
    }

    public static void ejemploBloqueFinally() {
        try {
            System.out.println("Dentro del bloque try.");
        } finally {
            // El bloque finally siempre se ejecuta
            System.out.println("Ejecutando bloque finally (limpieza de recursos).");
        }
    }

    public static void evitarCierrePrograma() {
        System.out.println("Inicio de prueba de seguridad...");
        try {
            String nulo = null;
            // Provocamos un error para demostrar que el programa no muere
            if (nulo == null) {
                throw new NullPointerException("Simulación de error");
            }
        } catch (Exception e) {
            System.out.println("Excepción controlada. El programa NO se cerró y continúa.");
        }
        System.out.println("Programa sigue vivo gracias al manejo de excepciones.");
    }
}