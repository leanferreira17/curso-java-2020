package modulo.tres;

public class Ejercicios2 {
    public static void main(String[] args) {
        /*
            Dado el siguiente arreglo ordenar sus elementos de mayor a menor e imprimirlo por consola.
        */

        int arreglo[] = {22, 56, 87, 34, 56, 67, 23, 1, 0, 37, 72};

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

        /*
            Completa el siguiente bloque de código para que solo se impriman los valores: 24, 57 y 98
        */

        int valor = 99;

        while (valor > 0) {
            System.out.println("El valor es: " + valor);
        }
    }
}
