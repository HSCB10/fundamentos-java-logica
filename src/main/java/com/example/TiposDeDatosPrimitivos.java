package com.example;

public class TiposDeDatosPrimitivos {
    public static void demostrarEnteros() {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        System.out.println("Enteros: byte=" + b + ", short=" + s + ", int=" + i + ", long=" + l);
    }

    public static void demostrarFlotantes() {
        float f = 3.14f;
        double d = 3.1415926535;
        System.out.println("Flotantes: float=" + f + ", double=" + d);
    }

    public static void demostrarCaracteres() {
        char letra = 'A';
        System.out.println("Caracter: " + letra);
    }

    public static void demostrarBooleanos() {
        boolean esVerdadero = true;
        System.out.println("Booleano: " + esVerdadero);
    }

    public static void demostrarValoresPorDefecto() {
        // Explicación solicitada en la tarea
        System.out.println("Nota: Las variables locales no tienen valores por defecto en Java.");
    }
}