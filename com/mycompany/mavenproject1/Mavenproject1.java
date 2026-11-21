package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        String carrera;
        double estatura;

        System.out.println("Ingrese su nombre completo:");
        nombre = entrada.nextLine();

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su carrera:");
        carrera = entrada.nextLine();

        System.out.println("Ingrese su estatura (ejemplo: 1.75):");
        estatura = entrada.nextDouble();

        System.out.println("\n--- DATOS DEL ESTUDIANTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");

        entrada.close();
    }
}
