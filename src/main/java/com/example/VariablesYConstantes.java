package com.example;

public class VariablesYConstantes {

    public static void demostrarDeclaracionAsignacion(){
        System.out.println("Nombre y edad");
        String nombre = "Steven";
        int edad = 19;
        System.out.println(nombre);
        System.out.println(edad);

    }

    public static void demostrarConvencionesNombres(){
        System.out.println("Nombre Y Medida");
        String nombreCompleto = "Steven Cuesta";
        float medidaActual =1.75f;

        System.out.println(nombreCompleto);
        System.out.println(medidaActual);
    }

    public static void demostrarConstantes(){
        System.out.println("Grupo Etnico");
        final String raza = "Afro Desendiente";
        System.out.println(raza);
    }

}
