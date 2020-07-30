package modulo.dos;

import java.util.Scanner;

public class Constructores {
    public static void main(String[] args) {
        Mujer objetoMujer = new Mujer("Ludmila", 22);
        System.out.println(objetoMujer.nombre + " tiene " + objetoMujer.edad + " años de edad.");

        Mujer mujer = new Mujer(22, "Maria");
        System.out.println(mujer.nombre + " tiene " + mujer.edad + " años de edad.");

        System.out.println("\"");

        Scanner objetoScanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = objetoScanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = objetoScanner.nextInt();
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);

        Mujer objetoMujer2 = new Mujer(nombre, edad);
        System.out.println("Objeto Nombre: " + objetoMujer2.nombre);

        /*
            Tarea: crear clases utilizando varios tipos primitivos como atributos (edad, peso, nombre, etc)
            Crear constructores para esas clases y con ayuda de la palabra "this" asignar esos argumentos
            Cargar los valores por consola e imprimir todos los datos del objeto creado
        */
    }
}

class Mujer {
    String nombre;
    int edad;

    public Mujer(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Mujer(int edad, String nombre) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void imprimirUbicacionEnMemoria() {
        System.out.println(this);
    }
}
