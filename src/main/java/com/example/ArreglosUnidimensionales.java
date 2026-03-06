package com.example;

public class ArreglosUnidimensionales {
    public static void declararCrearInicializar() {
        int[] arr = {1, 2, 3};
        System.out.println("Arreglo inicializado con " + arr.length + " elementos.");
    }

    public static void mostrarLongitud() {
        int[] arr = new int[5];
        System.out.println("Tamaño del arreglo: " + arr.length);
    }

    public static void recorrerConForClasico() {
        int[] arr = {10, 20};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Índice " + i + ": " + arr[i]);
        }
    }

    public static void recorrerConForEach() {
        int[] arr = {30, 40};
        for (int num : arr) {
            System.out.println("Valor: " + num);
        }
    }

    public static int[] arrayComoParametroYRetorno(int[] arr) {
        return arr;
    }
}