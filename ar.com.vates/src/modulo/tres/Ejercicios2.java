package modulo.tres;

public class Ejercicios2 {
    public static void main(String[] args) {
        /*
            Dado el siguiente arreglo ordenar sus elementos de mayor a menor e imprimirlo por consola.
        */

        int arreglo[] = {22, 56, 87, 34, 56, 67, 23, 1, 0, 37, 72};
        int valorTemporal;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    valorTemporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = valorTemporal;
                }
            }
        }

        System.out.println("Arreglo ordenado de menor a mayor: ");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }

        System.out.println();

        /*
            Dado el siguiente arreglo de lenguajes:
            - Ordenar el arreglo de menor a mayor por anioDeAparicion e imprimir el listado por consola
            - Recorrerlo con algun bucle e imprimir los datos completos del lenguaje cuyo nombre sea el mas largo
        */

        LenguajeDeProgramacion lenguaje1 = new LenguajeDeProgramacion("Python", 1991);
        LenguajeDeProgramacion lenguaje2 = new LenguajeDeProgramacion("Java", 1996);
        LenguajeDeProgramacion lenguaje3 = new LenguajeDeProgramacion("Cobol", 1960);
        LenguajeDeProgramacion lenguaje4 = new LenguajeDeProgramacion("C++", 1979);
        LenguajeDeProgramacion lenguaje5 = new LenguajeDeProgramacion("Javascript", 1995);
        LenguajeDeProgramacion lenguaje6 = new LenguajeDeProgramacion("Go", 2009);
        LenguajeDeProgramacion lenguaje7 = new LenguajeDeProgramacion("Perl", 1987);
        LenguajeDeProgramacion lenguaje8 = new LenguajeDeProgramacion("Sql", 1974);

        LenguajeDeProgramacion lenguajes[] = {
                lenguaje1, lenguaje2, lenguaje3, lenguaje4, lenguaje5, lenguaje6, lenguaje7, lenguaje8
        };

        ordenarArregloPorAnioDeAparicion(lenguajes);

        int indiceDelLenguajeCuyoNombreEsElMasLargo = 0;

        for (int i = 0; i < lenguajes.length; i++) {
            if (lenguajes[i].nombre.toCharArray().length > lenguajes[indiceDelLenguajeCuyoNombreEsElMasLargo].nombre.toCharArray().length) {
                indiceDelLenguajeCuyoNombreEsElMasLargo = i;
            }
        }

        LenguajeDeProgramacion lenguajeDeProgramacion = lenguajes[indiceDelLenguajeCuyoNombreEsElMasLargo];
        System.out.println("Datos del lenguaje con nombre mas largo");
        System.out.println("Nombre: " + lenguajeDeProgramacion.nombre);
        System.out.println("Fué creado en: " + lenguajeDeProgramacion.anioDeAparicion);

        /*
            Completa el siguiente bloque de código para que solo se impriman los valores: 24, 57 y 98
        */

        int valor = 99;

        while (valor > 0) {
            if (valor == 24) {
                System.out.println("El valor es: " + valor);
            } else if (valor == 57) {
                System.out.println("El valor es: " + valor);
            } else if (valor == 98) {
                System.out.println("El valor es: " + valor);
            }
            valor--;
        }
    }

    public static void ordenarArregloPorAnioDeAparicion(LenguajeDeProgramacion [] lenguajes) {
        LenguajeDeProgramacion objetoTemporal;
        int largo = lenguajes.length;

        for (int i = 0; i < largo; i++) {
            for (int j = i + 1; j < largo; j++) {
                if (lenguajes[i].anioDeAparicion > lenguajes[j].anioDeAparicion) {
                    // comparamos por el año pero a la hora de realizar el intercambio de posiciones
                    // movemos el objeto completo, no solo su anioDeAparicion
                    objetoTemporal = lenguajes[i];
                    lenguajes[i] = lenguajes[j];
                    lenguajes[j] = objetoTemporal;
                }
            }
        }

        System.out.println("Arreglo ordenado de menor a mayor: ");

        for (int i = 0; i < largo; i++) {
            System.out.println(lenguajes[i].nombre + ", " + lenguajes[i].anioDeAparicion);
        }
    }
}
