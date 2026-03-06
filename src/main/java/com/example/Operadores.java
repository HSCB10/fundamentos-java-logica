package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {
        int suma = 10 + 5;
        int resto = 10 % 3;
        System.out.println("Suma: " + suma + ", Resto: " + resto); // Usamos las variables para evitar advertencias
    }

    public static void demostrarIncrementoDecremento() {
        int n = 5;
        System.out.println("Prefijo: " + (++n)); 
        System.out.println("Sufijo: " + (n--));
    }

    public static void demostrarRelacionales() {
        boolean esMayor = 10 > 5;
        System.out.println("10 > 5 es: " + esMayor);
    }

    public static void demostrarLogicos() {
        boolean resultado = (5 > 3) && (8 < 10);
        System.out.println("Resultado lógico AND: " + resultado);
    }

    public static void demostrarAsignacionCompuesta() {
        int x = 10;
        x += 5; // x = 15
        x *= 2; // x = 30
        System.out.println("Valor final con asignación compuesta: " + x);
    }

    public static void demostrarOperadorTernario() {
        int nota = 75;
        String mensaje = (nota >= 60) ? "Aprobado" : "Reprobado";
        System.out.println("Resultado: " + mensaje);
    }
}