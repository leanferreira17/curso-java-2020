package modulo.dos;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Hombre objetoHombre = new Hombre();
        Gestor gestor = new Gestor();

        System.out.println(objetoHombre.nombre);

        gestor.cambiarNombre(objetoHombre);

        System.out.println(objetoHombre.nombre);
    }
}

class Hombre {
    String nombre = "Juan";
}

class Gestor {
    void cambiarNombre(Hombre variableDeTipoHombre) {
        variableDeTipoHombre.nombre = "Lucas";
    }
}
