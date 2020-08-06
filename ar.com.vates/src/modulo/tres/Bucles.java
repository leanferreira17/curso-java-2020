package modulo.tres;

public class Bucles {
    public static void main(String[] args) {

        // for
        System.out.println("##### for #####");

        int arreglo [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};

        for (int i = 0; i < arreglo.length; i = i + 10) {
            System.out.println(arreglo[i]);
        }

        // i = i + 1
        // i++
        // i = i - 1 // i--
        // j-- //

        for (int j = 10; j > 0; j = j - 1) {
            System.out.println(j);
        }

        for (double i = 0.00000000; i < 10; i++) {
            System.out.println(i);
        }

        // while
        System.out.println("##### while #####");
        int valor = 5;

        while (valor < 10) {
            System.out.println("El valor es: " + valor);
            // valor = valor + 1;
            valor++;
        }

        // do while
        System.out.println("##### do while #####");
        valor = 5;

        do {
            System.out.println("El valor es: " + valor);
            valor = valor + 1;
        }
        while (valor > 10);

        // Uso de la declaración break
        System.out.println("##### break #####");
        for (int i = 0; i < 10000; i++) {
            if (i == 5) {
                System.out.println("Fin del bucle for");
                break;
            }
            System.out.println("El valor de i es: " + i);
        }

        // Uso de la declaración continue
        System.out.println("##### continue #####");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("El valor de i es: " + i);
        }
    }
}
