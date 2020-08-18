package modulo.cuatro.ejercicios.herencia;

public class TestHerencia {
    public static void main(String[] args) {
        /*
            Dadas las clases Padre e Hijo resolver.
            - Agregar constructor, getters y setter en ambas clases
            - Realizar la herencia (extends)
            - Instanciar un objeto Hijo

            En la clase Hijo implementar métodos que permitan imprimir los datos que se listan abajo.

            Se pide imprimir:
            - Datos completos del padre
            - Nombre y apellido del hijo
            - Cantidad de años que se llevan (edad del padre - edad del hijo)
        */

        Hijo objetoHijo = new Hijo(
                "Luis",
                "Spinetta",
                "Marron",
                1.76F,
                "Músico",
                false,
                62,
                "Dante",
                40);

        Padre padreNuevo = new Padre();
        System.out.println(padreNuevo.toString());

        System.out.println("### Datos completos del padre ###");
        objetoHijo.imprimirDatosCompletosDelPadre();

        System.out.println("### Nombre y apellido del hijo ###");
        objetoHijo.imprimirNombreYApellidoHijo();

        System.out.println("### Cantidad de años que se llevan ###");
        objetoHijo.imprimirDiferenciaDeEdad();

        Hijo hijo = new Hijo();
        System.out.println(hijo.toString());

        System.out.println(hijo.saludar());
        Padre padre = new Padre();

        System.out.println(padre.saludar());
    }
}