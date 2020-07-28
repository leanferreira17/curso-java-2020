class ClaseTest {
    public static void main(String[] args) {
        byte variableByte = 0x00;
        short variableShort = 1;
        int variableInt = 4234;
        long variableLong = 453456345634563L;  // L
        float variableFloat = 234.56F; // F
        double variableDouble = 234.34563456345634563456D; // D
        char variableChar = 'a';
        boolean variableBoolean = false; // false o true
        String texto = "java 2020";

        //System.out.println(texto + "\t" + texto + "\t" + texto);

        // Declaración
        Persona objetoPersona; // de esta forma lo que hace la JVM es reservar ese espacio en memoria

        // Instanciación
        objetoPersona = new Persona(); // se llama al metodo constructor (implícito) de la clase Persona

        // Para acceder a los miembros de clase (recordar: son los atributos y metodos) utilizamos el
        // operador "." (punto)
        System.out.println(objetoPersona.nombre);
        System.out.println(objetoPersona.dni);
        System.out.println(objetoPersona.estatura);
        System.out.println(objetoPersona.sexo);

        // Acceder a un método perteneciente a la clase Persona
        objetoPersona.imprimirDatos();

        /**
         * Realizar aqui los ejercicios abajo mencionados
         * */

        // Ejemplo
        NombreDeLaEntidadQueElija nombreDeLaEntidadQueElija = new NombreDeLaEntidadQueElija();
        nombreDeLaEntidadQueElija.imprimirDatos();

    }
}

class Persona {
    // miembros de clase: métodos y atributos de clase
    int dni = 37654987;
    float estatura = 1.80F;
    String nombre = "Juan Vates";
    char sexo = 'M';
    boolean estaCasado = false;

    void imprimirDatos() {
        System.out.println("Nombre:" + nombre);
        System.out.println("DNI:" + dni);
        System.out.println("Está casado?: " + estaCasado);
    }
}

/**
 * Tarea: utilizando los conocimientos de tipos primitivos, clases y objetos modelar 5 entidades
 * de la realidad.
 * Por ejemplo: Perro, Barco, Avion, etc...
 * Declararlos, instanciarlos mediante la palabra reservada "new" y llamar a su metodo imprimirDatos()
 * en el metodo main que venimos usando
 */

class NombreDeLaEntidadQueElija {
    // atributos: int, short, boolean, String, etc...

    // metodo void imprimirDatos() { }
}