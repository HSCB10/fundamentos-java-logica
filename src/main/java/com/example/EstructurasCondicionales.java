package com.example;

public class EstructurasCondicionales {
    public static void ejemploIf() {
        int x = 10;
        if (x > 5) {
            System.out.println("El número es mayor a 5");
        }
    }

    public static void ejemploIfElse() {
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }

    public static void ejemploIfElseIfElse() {
        int puntaje = 85;
        if (puntaje >= 90) {
            System.out.println("Excelente");
        } else if (puntaje >= 80) {
            System.out.println("Muy bueno");
        } else {
            System.out.println("Sigue intentando");
        }
    }

    public static void ejemploSwitch() {
        int dia = 2;
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            default: System.out.println("Otro día");
        }
    }

    public static void ejemploSwitchExpression() {
        int mes = 1;
        String nombreMes = switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            default -> "Desconocido";
        };
        System.out.println("Mes: " + nombreMes);
    }
}