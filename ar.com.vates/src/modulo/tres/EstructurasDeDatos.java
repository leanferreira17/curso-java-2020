package modulo.tres;

import java.util.Scanner;

public class EstructurasDeDatos {
    public static void main(String[] args) {

        // Imprimiendo los valores que fueron cargados en el arreglo args
        //System.out.println(args[1]);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese edad: ");
        //int edad = scanner.nextInt();
        //scanner.nextLine();
        int edadDeLaPersona = Integer.parseInt(scanner.nextLine());

        //int a = 2;
        //Integer entero = new Integer(2);
        // wrapper int -> Integer

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();


        // Arreglos
        int arregloDeEnteros[] = new int[10];
        int[] arregloDeEnteros2 = new int[10];

        arregloDeEnteros[0] = 34; // asigno el valor 34 en el casillero con indice 0
        arregloDeEnteros[8] = 2; // asigno el valor 2 en el casillero con indice 8

        // [34] [0] [0] [0] [0] [0] [0] [0] [2] [0]  casilleros
        //   0   1   2   3   4   5   6   7   8   9   indices

        Auto arregloDeAutos[] = new Auto[5];

        Auto toyota = new Auto("Toyota");

        arregloDeAutos[3] = toyota;
        arregloDeAutos[0] = new Auto("Honda");

        // arregloDeAutos[30] = new Auto("Fiat"); -> lanza Exception porque no tiene indice 30

        System.out.println(arregloDeAutos[3].getMarca());

        // Todos los String son cadenas (arreglos) de chars
        String cadenaDeChars = "java"; // [0] -> j   [1] -> a    [2] -> v    [3] -> a
        char valorChar = cadenaDeChars.charAt(0);
        System.out.println(
                "Valor char para la posicion 1: " + valorChar +
                        ". Largo del arreglo de chars: " + cadenaDeChars.length());

        // Condicionales

        int edad = 15;

        if (edad >= 16) {
            System.out.println("se entrego la licencia");
        } else {
            System.out.println("no se entregara la licencia");
        }

        /*
            Revisar clase Ejercicios en este modulo
        */

    }
}

class Auto {
    String marca;

    public Auto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }
}
