package com.example;

public class ArreglosBidimensionales {
    public static void declararCrearMatrices() {
        int[][] m = new int[2][2];
        System.out.println("Matriz de " + m.length + "x" + m[0].length + " creada.");
    }

    public static void recorrerMatriz() {
        int[][] matriz = {{1, 2}, {3, 4}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        System.out.println("Uso típico: Representación de tablas o mapas.");
    }
}