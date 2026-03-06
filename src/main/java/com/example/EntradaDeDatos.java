package com.example;
import java.util.Scanner;

public class EntradaDeDatos {
    // Usamos un solo Scanner estático para evitar fugas de recursos (resource leaks)
    private static final Scanner sc = new Scanner(System.in);

    public static void leerVariosTipos() {
        System.out.print("Ingresa un entero: ");
        int i = sc.nextInt();
        
        System.out.print("Ingresa un decimal: ");
        double d = sc.nextDouble();
        
        System.out.print("Ingresa una palabra: ");
        String p = sc.next();
        
        sc.nextLine(); // Limpiar el buffer del salto de línea
        
        System.out.print("Ingresa una frase: ");
        String f = sc.nextLine();
        
        System.out.println("Datos registrados: " + i + ", " + d + ", " + p + ", " + f);
    }

    public static void manejarSaltoDeLineaPendiente() {
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        
        sc.nextLine(); // Resolución del problema del salto de línea pendiente
        
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();
        
        System.out.println(nombre + " tiene " + edad + " años.");
    }
}