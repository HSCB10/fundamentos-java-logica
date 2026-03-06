package com.example;

public class EstructurasDeRepeticion {
    public static void ejemploWhile() {
        int i = 1;
        while (i <= 3) {
            System.out.println("Contador while: " + i);
            i++;
        }
    }

    public static void ejemploDoWhile() {
        int i = 1;
        do {
            System.out.println("Contador do-while: " + i);
            i++;
        } while (i <= 2);
    }

    public static void ejemploForClasico() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteración for: " + i);
        }
    }

    public static void ejemploForAnidado() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print("[" + i + "," + j + "] ");
            }
            System.out.println();
        }
    }

    public static void ejemploBreakContinue() {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) continue; // Salta el 2
            if (i == 4) break;    // Detiene en el 4
            System.out.println("Número: " + i);
        }
    }

    public static void ejemploEtiquetas() {
        bucleExterno:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) break bucleExterno;
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}