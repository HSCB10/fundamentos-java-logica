package com.example;

public class ManipulacionCadenas {
    public static void demostrarConcatenacion() {
        String s1 = "Hola";
        String s2 = " Mundo";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(" Java"));
    }

    public static void demostrarMetodosUtiles() {
        String texto = "Programación en Java";
        System.out.println("Largo: " + texto.length());
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("¿Contiene 'Java'?: " + texto.contains("Java"));
    }

    public static void demostrarInmutabilidad() {
        String original = "Hola";
        original.toUpperCase(); // Esto no cambia la variable 'original'
        System.out.println("Inmutabilidad (sigue igual): " + original);
        
        String nueva = original.toUpperCase(); // Se debe asignar a otra variable
        System.out.println("Nueva cadena: " + nueva);
    }

    public static void usarStringBuilder() {
        StringBuilder sb = new StringBuilder("Texto");
        sb.append(" dinámico");
        sb.reverse();
        System.out.println("StringBuilder resultado: " + sb.toString());
    }
}