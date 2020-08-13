package modulo.cuatro;

public class OperadorTernario {
    public static void main(String[] args) {
        String mensaje = "";

        if (7 > 6 && 0 < 9) {
            mensaje = "Es verdadero";
        } else {
            mensaje = "Es falso";
        }

        System.out.println(mensaje);

        mensaje = (7 > 6 && 0 < 9) ? "Es verdadero" : "Es falso";
        System.out.println(mensaje);

    }
}
