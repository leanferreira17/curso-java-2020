package modulo.tres;

public class Ejercicios {
    public static void main(String[] args) {

        /*
            Dados los siguientes arreglos (arregloA y arregloB) marcar con V (verdadero) ó F (falso) en la
            condicion segun corresponda:

        */

        int arregloA [] = {23, 56, 67, 74, 34, 78, 29, 19};
        int arregloB [] = {65, 23, 13, 56, 68, 54, 98, 11, 24, 67};

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
        */


    }
}
