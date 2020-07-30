package modulo.dos;

class PasoPorValor {
    public static void main(String[] args) {
        int miValor = 50;

        System.out.println("Valor:" + miValor);

        Auxiliar auxiliar = new Auxiliar();
        auxiliar.modificarValor(miValor);

        System.out.println("miValor procesado: " + miValor);
    }
}

class Auxiliar {
    int modificarValor(int valor) {
        valor = 40;
        return valor;
    }
}
