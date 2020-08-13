package modulo.cuatro.estaticas;

public class ClaseEstatica {
    static float pi = 3.1415F;
    static int contador = 0;

    static int getContador() {
        //this
        return contador++;
    }
}
