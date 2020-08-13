package modulo.cuatro.estaticas;

public class PrincipalEstatica {
    public static void main(String[] args) {

        System.out.println(ClaseEstatica.pi);

        for (int i = 0; i < 10; i++) {
            System.out.println(ClaseEstatica.getContador());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ClaseEstatica.getContador());
        }

    }
}
