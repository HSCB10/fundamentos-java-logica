package com.example;

public class MetodosEstaticosSimples {
    public static void ejemploDeclaracionLlamada() {
        System.out.println("Este es un método estático sin retorno.");
    }

    public static void ejemploPasoParametros(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    public static int ejemploRetornoValores() {
        return 42;
    }

    public static void ejemploSobrecarga() {
        System.out.println("Sobrecarga sin parámetros");
    }

    public static void ejemploSobrecarga(int n) {
        System.out.println("Sobrecarga con número: " + n);
    }
}