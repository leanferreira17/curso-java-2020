package modulo.tres;

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


        // uso del switch

        int diaDeLaSemana = 4;
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
        }

        System.out.println("El valor " + diaDeLaSemana + " corresponde al día " + nombreDelDia);

    }
}
