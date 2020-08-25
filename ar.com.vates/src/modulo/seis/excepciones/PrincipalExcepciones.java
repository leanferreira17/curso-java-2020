package modulo.seis.excepciones;

import java.io.File;
import java.io.FileInputStream;

public class PrincipalExcepciones {
    public static void main(String[] args) {

        // unchequed exceptions (RuntimeException)
        int a = 79;
        System.out.println(dividirPorCero(a));

        System.out.println(getValorPorIndice(8));

        // chequed exceptions
        // crearArchivoYAccederlo();
    }

    public static int dividirPorCero(int valor) {
        return valor / 0;
    }

    public static int getValorPorIndice(int indice) {
        int[] arreglo = {0, 4, 5};

        return arreglo[indice];
    }

//    public static void crearArchivoYAccederlo() {
//        File file = new File("not_existing_file.txt");
//        FileInputStream stream = new FileInputStream(file);
//    }
}
