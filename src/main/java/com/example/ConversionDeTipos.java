package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        int num = 100;
        double d = num; // Widening
        System.out.println("Casting Implícito: " + d);
    }

    public static void demostrarCastingExplicito() {
        double d = 9.99;
        int i = (int) d; // Narrowing
        System.out.println("Casting Explícito: " + i);
    }

    public static void demostrarProblemasDePrecision() {
        long granNumero = 10000000000L;
        int recortado = (int) granNumero; // Pérdida de precisión
        System.out.println("Problema de precisión: " + recortado);
    }
}