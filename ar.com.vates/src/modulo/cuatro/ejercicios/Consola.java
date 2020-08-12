package modulo.cuatro.ejercicios;

import java.util.Scanner;

class Consola {
    private Scanner objetoScanner = new Scanner(System.in);

    public String capturarValorString(String mensaje) {
        this.imprimirMensaje(mensaje);
        return objetoScanner.nextLine();
    }

    public int capturarValorInt(String mensaje) {
        this.imprimirMensaje(mensaje);
        return Integer.parseInt(objetoScanner.nextLine());
    }

    public float capturarValorFloat(String mensaje) {
        this.imprimirMensaje(mensaje);
        return Float.parseFloat(objetoScanner.next());
    }

    public char capturarValorChar(String mensaje) {
        this.imprimirMensaje(mensaje);
        return objetoScanner.next().charAt(0);
    }

    public boolean capturarValorBoolean(String mensaje) {
        this.imprimirMensaje(mensaje);
        return objetoScanner.nextBoolean();
    }

    private void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
