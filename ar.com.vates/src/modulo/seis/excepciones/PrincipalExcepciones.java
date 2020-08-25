package modulo.seis.excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrincipalExcepciones {
    public static void main(String[] args) {

        // unchequed exceptions (RuntimeException)
        int a = 79;
        //System.out.println(dividirPorCero(a));

        //System.out.println(getValorPorIndice(8));

        // chequed exceptions
        try {
            crearArchivoYAccederlo();
        } catch (NullPointerException nullPointerException) {
            //
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            //
        } catch (FileNotFoundException fileNotFoundException) {
            //
        }

        try {
            lanzarExcepcionSiEsFalso(false);
        } catch (CustomExcepcion customExcepcion) {

        } catch (NullPointerException e) {
            e.getMessage();
        } catch (Exception e) {

        }


    }

    public static int dividirPorCero(int valor) {
        return valor / 0;
    }

    public static int getValorPorIndice(int indice) {
        int[] arreglo = {0, 4, 5};

        return arreglo[indice]; // 89
    }

    public static void crearArchivoYAccederlo() throws FileNotFoundException {
//        try {
//            File file = new File("not_existing_file.txt");
//            FileInputStream stream = new FileInputStream(file);
//            //int a = 3;
//        } catch (Exception e) {
//            System.out.println(e.getCause().getMessage());
//        } finally {
//            System.out.println("pase por el finally");
//        }

        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }

    public static void lanzarExcepcionSiEsFalso(boolean flag) throws Exception {
        if (!flag) {
            throw new CustomExcepcion("Se ha lanzado la excepcion porque flag es falsa");
        } else {
            throw new NullPointerException();
        }
    }
}
