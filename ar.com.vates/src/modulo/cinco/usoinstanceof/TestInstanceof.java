package modulo.cinco.usoinstanceof;

public class TestInstanceof {
    public static void main(String[] args) {
        Abuelo objetoAbuelo = new Abuelo();
        Padre objetoPadre = new Padre();
        Nieto objetoNieto = new Nieto();

        System.out.println(objetoAbuelo instanceof Object);
        System.out.println(objetoNieto instanceof Abuelo);
        System.out.println(objetoPadre instanceof Nieto);
        System.out.println(objetoPadre instanceof Abuelo);

        // veamos un poco del ternario
        String mensaje = "";

        mensaje = (objetoAbuelo instanceof Object) ? "Es una instancia de Object" : "La pifiaste";
        System.out.println(mensaje);

    }
}
