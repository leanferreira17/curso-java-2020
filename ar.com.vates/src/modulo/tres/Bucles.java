package modulo.tres;

public class Bucles {
    public static void main(String[] args) {

        // for
        System.out.println("##### for #####");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (double i = 0.00000000; i < 10; i++) {
            System.out.println(i);
        }

        // while
        System.out.println("##### while #####");
        int valor = 5;

        while (valor < 10) {
            System.out.println("El valor es: " + valor);
            valor = valor + 1;
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
