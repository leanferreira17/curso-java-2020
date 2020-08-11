package modulo.tres;

import java.util.Random;

public class Condicionales {
    public static void main(String[] args) {

        // if
        if (2 == 2) {
            System.out.println("2 es igual a 2");
        }

        // if else

        if (true == false) {
            System.out.println("true es igual a false");
        } else {
            System.out.println("true no es igual a false");
        }

        // if else if

        int a, b, c;
        a = 2;
        b = 3;
        c = 5;

        if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a > c) {
            System.out.println("a es mayor que c");
        } else {
            System.out.println("a es menor que b y c");
        }


        // Uso del switch con expresión de tipo numérica
        int diaDeLaSemana = 10;
        String nombreDelDia = "";

        switch (diaDeLaSemana) {
            case 1:
                nombreDelDia = "Lunes";
                break;
            case 2:
                nombreDelDia = "Martes";
                break;
            case 3:
                nombreDelDia = "Miércoles";
                break;
            case 4:
                nombreDelDia = "Jueves";
                break;
            case 5:
                nombreDelDia = "Viernes";
                break;
            case 6:
                nombreDelDia = "Sábado";
                break;
            default:
                nombreDelDia = "Domingo";
                break;
        }

        System.out.println("El valor " + diaDeLaSemana + " corresponde al día " + nombreDelDia);

        // uso del switch para dar el mismo comportamiento a un grupo de valores (casos)
        Random ruleta = new Random();
        int minimo = 0; // 20
        int maximo = 11; // 50

        //int nota = ruleta.nextInt(maximo - minimo);
        int nota = 10;
        String devolucion = "";

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
                devolucion = "Debes recuperar el parcial.";
                break;
            case 5:
            case 6:
                devolucion = "Estas aprobado/a pero deberas aprobar también los TPs 1, 2 y 3.";
                break;
            case 7:
            case 8:
            case 9:
                devolucion = "Estas aprobado/a, solo tendrás que presentar la carpeta completa.";
                break;
            case 10:
                devolucion = "Promocionaste. Felices vaganciones!";
        }

        System.out.println("Obtuviste un " + nota + ". La devolución del profesor es: " + devolucion);

        // uso del switch con expresión de tipo String
        String expresion = "Javauu";

        switch (expresion) {
            case "Angular":
                System.out.println("Hablamos de Angular.");
                break;
            case "Java":
                System.out.println("Hablamos de Java.");
                break;
            default:
                System.out.println("No hablamos de nada.");
        }

    }
}
