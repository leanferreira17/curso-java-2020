package modulo.dos;

class ClasePrincipal {
    public static void main(String[] args) {
        int valorInt = 1;
        float valorFloat = 45.6F;
        long valorLong = 423444L;
        double valorDouble = 169.7007D;

        /*
        Precedencia: mismo orden de precedencia se evalua de IZQUIERDA A DERECHA.
         */

        double resultadoDeLaOperacion = 2 + 3 * 5 - 8 / 4;
        // 2 + 3 * 5 - 8 / 4
        // 2 + 15 - 2
        // 17 - 2
        // 15

        double resultadoDeLaOperacionChequeada = (2 + (3 * 5)) - (8 / 4);

        System.out.println("Operacion: " + resultadoDeLaOperacion);
        System.out.println("Operacion chequeada: " + resultadoDeLaOperacionChequeada);

        Aritmetica aritmetica = new Aritmetica();

        aritmetica.imprimir("Clase para realizar operaciones aritméticas.");

        int resultadoDeLaSuma = aritmetica.sumar(23, 67);
        System.out.println("El resultado de la suma es: " + resultadoDeLaSuma);

        double cociente = aritmetica.dividir(4F, 40F);
        System.out.println("El cociente es: " + cociente);

        Persona objetoPersona = new Persona();
        objetoPersona.imprimirPorConsolaElNombreCompleto();
    }
}

class Aritmetica {
    void imprimir(String valorParaImprimir) {
        System.out.println(valorParaImprimir);
    }

    int sumar(int valorA, int valorB) {
        int resultado = valorA + valorB;

        return resultado;
    }

    double dividir(float dividendo, float divisor) {
        return dividendo / divisor;
    }
}

class Persona {
    String nombre = "Maria";
    String apellido = "Vates";

    void imprimirPorConsolaElNombreCompleto() {
        System.out.println("Nombre completo: " + apellido + ", " + nombre);
    }

    Persona getPersona() {
        return new Persona();
    }
}