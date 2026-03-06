package com.example;

public class VariablesYConstantes {
    public static void demostrarDeclaracionAsignacion() {
        int edad = 20;
        double estatura = 1.75;
        System.out.println("Declaración y Asignación: Edad = " + edad + ", Estatura = " + estatura);
    }

    public static void demostrarConvencionesNombres() {
        int numeroDeEstudiantes = 30; // camelCase
        String nombreDelCurso = "Programación Java";
        System.out.println("Convención camelCase: " + numeroDeEstudiantes + ", " + nombreDelCurso);
    }

    public static void demostrarConstantes() {
        final double PI = 3.14159; // Uso de final
        final int MAX_USUARIOS = 100;
        System.out.println("Constantes (final): PI = " + PI + ", Max Usuarios = " + MAX_USUARIOS);
    }
}