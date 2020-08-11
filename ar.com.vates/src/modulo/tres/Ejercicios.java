package modulo.tres;

public class Ejercicios {
    public static void main(String[] args) {

        /*
            Dados los siguientes arreglos (arregloA y arregloB) marcar con V (verdadero) ó F (falso) en la
            condicion segun corresponda:

        */

        int arregloA[] = {23, 56, 67, 74, 34, 78, 29, 19};
        int arregloB[] = {65, 23, 13, 56, 68, 54, 98, 11, 24, 67};

        /*
        Por ejemplo:
        arregloA[7] > arregloB[2]: V

        Resolver:
        1) arregloA[6] >= arregloB[0]:
        2) arregloA[3] > arregloB[2]:
        3) arregloA[4] < arregloB[3]:
        4) arregloA[0] == arregloB[1]:
        5) arregloA[1] != arregloB[6]:
        6) arregloA[2] == arregloB[5]:
        7) arregloA[5] > arregloB[4]:
        8) arregloA[6] <= arregloB[2]:
        9) arregloA[7] == arregloB[3]:
        10) arregloA[6] > arregloB[2]:
        11) arregloA[6] >= arregloB[0]:
        12) arregloA[3] > arregloB[2]:
        13) arregloA[4] <= arregloB[3]:
        14) arregloA[0] == arregloB[1]:
        15) arregloA[1] != arregloB[4]:
        16) arregloA[2] == arregloB[5]:
        17) arregloA[5] >= arregloB[8]:
        18) arregloA[6] == arregloB[9]:
        19) arregloA[7] != arregloB[7]:
        20) arregloA[6] >= arregloB[9]:

        */

        /*
            Planteo de posible solucion:
            Revisar con el debugger agregando un breakpoint en la linea 12, como es la estructura interna de
            los arreglos. Luego por cada item de la lista de 20 realizar la siguiente construccion:

            if (arregloA[7] > arregloB[2]) {
                System.out.println("V");
            } else {
                System.out.println("F");
            }

            El objetivo es listar algo de esta forma:
            V
            V
            F
            V
            F
            ...

            Otra forma de comprobar esto es evaluar la expresión antes de imprimirla:
            System.out.println(arregloA[6] >= arregloB[0]); // imprimirá true o false
        */

        // Tomemos en cuenta que cada expresion de esta forma: a != b arrojará como resultado un valor boolean true o false
        // entonces podemos pensar en que cada comparación es en sí misma un tipo boolean, por ende podemos crear un arreglo
        // de este tipo y luego iterarlo mediante un bucle. Interesante es ver cuantas lineas de código nos ahorramos haciendo
        // totalmente performante y mantenible nuestro algoritmo

        boolean[] comparaciones = {
                arregloA[6] >= arregloB[0],
                arregloA[3] > arregloB[2],
                arregloA[4] < arregloB[3],
                arregloA[0] == arregloB[1],
                arregloA[1] != arregloB[6],
                arregloA[2] == arregloB[5],
                arregloA[5] > arregloB[4],
                arregloA[6] <= arregloB[2],
                arregloA[7] == arregloB[3],
                arregloA[6] > arregloB[2],
                arregloA[6] >= arregloB[0],
                arregloA[3] > arregloB[2],
                arregloA[4] <= arregloB[3],
                arregloA[0] == arregloB[1],
                arregloA[1] != arregloB[4],
                arregloA[2] == arregloB[5],
                arregloA[5] >= arregloB[8],
                arregloA[6] == arregloB[9],
                arregloA[7] != arregloB[7],
                arregloA[6] >= arregloB[9]};

        for (int i = 0; i < comparaciones.length; i++) {
            //imprimirResultadoDeLaComparacion(comparaciones[i]);
            System.out.println(comparaciones[i]);
        }


        /*
            Dado el siguiente bloque de codigo, en el cual estamos convirtiendo un objeto String
            a un arreglo de chars (recordemos que los String son arreglos de chars) reemplazar los
            caracteres marcados con una "x" por el correcto y luego imprimir la frase completa.
         */

        // Ejemplo
        String fraseDeEjemplo = "Mi autx es rojo.";

        // convertimos el objeto String a un arreglo de tipo char utilizando el método toCharArray() de la
        // clase String
        char arregloFraseDeEjemplo[] = fraseDeEjemplo.toCharArray();

        // una vez que tenemos el arreglo de tipo char vamos a reemplazar el valor de la x por el caracter correcto
        arregloFraseDeEjemplo[6] = 'o';

        // imprimimos para validar que la frase es correcta
        System.out.println(arregloFraseDeEjemplo);
        // notamos que cuando mandamos a imprimir un arreglo de tipo char, éste se imprime totalmente
        // hacer la prueba para otros tipos de datos

        // Reemplazar las "x" en las siguientes frases, como se mostró arriba: (el/la que se anime reemplaze
        // tambien los caracteres que deberian llevar tilde)

        String frase1 = "Ayer fxe un dxa soleadx en Cxrdoba.";
        String frase2 = "¡Cxmo me gustxn lxs viernesx";
        String frase3 = "Hay 10 tipxs de personxs: Las qxe conocen el cxdigo binario y las qux no.";
    }

    static void imprimirResultadoDeLaComparacion(boolean expresion) {
        System.out.println(expresion);
    }
}
