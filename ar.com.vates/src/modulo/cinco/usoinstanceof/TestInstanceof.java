package modulo.cinco.usoinstanceof;

public class TestInstanceof {
    public static void main(String[] args) {
        Abuelo objetoAbuelo = new Abuelo();
        Padre objetoPadre = new Padre();
        Nieto objetoNieto = new Nieto();

        System.out.println(objetoNieto.getClass().getSimpleName());

        System.out.println(objetoAbuelo instanceof Object);
        System.out.println(objetoNieto instanceof Abuelo);
        System.out.println(objetoPadre instanceof Nieto);
        System.out.println(objetoPadre instanceof Abuelo);
        System.out.println(objetoPadre instanceof Padre);

        // veamos un poco del ternario
        String mensaje = "";
        int valor = 0;

        mensaje = (5 != 5) ? "Verdadero" : "Falso";

        valor = (4 > 6) ? 4 : 0;

        System.out.println(mensaje);

    }
}
