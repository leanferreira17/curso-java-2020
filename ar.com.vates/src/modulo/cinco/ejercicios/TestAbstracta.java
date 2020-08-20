package modulo.cinco.ejercicios;

import modulo.cinco.ejercicios.pcs.Linux;
import modulo.cinco.ejercicios.pcs.MSDos;
import modulo.cinco.ejercicios.pcs.Windows;

public class TestAbstracta {
    public static void main(String[] args) {
        /*
            Dada la clase abstracta Computadora se pide crear 7 subclases llamadas:
            - Windows
            - MacOS
            - Ubuntu
            - Linux
            - Unix
            - MSDos
            - Solaris
            Las 7 deberan implementar todos los metodos de su superclase y los siguientes datos:
            - Windows:
            Cantidad de nucleos: 8
            Cantidad de Ram: 16
            Version del sistema: 10
            Overclocked: false

            -MacOS:
            Cantidad de nucleos: 4
            Cantidad de Ram: 8
            Version del sistema: Mojave
            Overclocked: false

            - Ubuntu:
            Cantidad de nucleos: 16
            Cantidad de Ram: 32
            Version del sistema: 18.04 LTS
            Overclocked: true

            - Linux:
            Cantidad de nucleos: 32
            Cantidad de Ram: 64
            Version del sistema: 10.05
            Overclocked: false

            - Unix:
            Cantidad de nucleos: 1
            Cantidad de Ram: 2
            Version del sistema: 1.0.5
            Overclocked: false

            - MSDos:
            Cantidad de nucleos: 4
            Cantidad de Ram: 4
            Version del sistema: 2.0.4
            Overclocked: false

            - Solaris:
            Cantidad de nucleos: 128
            Cantidad de Ram: 256
            Version del sistema: 14.04
            Overclocked: false

            - Utilizando algun bucle recorrer el arreglo y hacer uso del metodo toString() de cada clase
            para imprimir las caracteristicas de cada computadora.
            - Aquellas cuyo atributo "Overclocked" sea false deberan ser modificadas y agregarles el doble de RAM
            (utilizando setCantidadDeRam()) y el atributo "Overclocked" debera ser actualizado a "true"
            - Volver a listarlas
        */

        // accedemos al método estático, de no ser estático no podriamos usarlo en este contexto
        Computadora[] listado = crearInstanciasDeComputadora();
        recorrerYListarPcs(listado);

        comprobarOverclockeoYModificarSiFueseFalso(listado);
        recorrerYListarPcs(listado);


        // vemos que en ningún lado nos aparece la clase, son todas computadoras
        // busquemos la forma de que cada una tenga el valor de su clase en el toString()

        MSDos msDos = new MSDos();

        if (msDos instanceof Computadora) {
            System.out.println("Si, apunta a ese tipo");
        }
    }

    public static Computadora[] crearInstanciasDeComputadora() {
        Windows pcWindows = new Windows();
        Linux pcLinux = new Linux();

        // qué pasa si no seteo los parámetros y llamo al toString() del padre?
        pcWindows.setCantidadeNucleos(8);
        pcWindows.setCantidadDeRam(16);
        pcWindows.setVersionDelSistema("10");
        // pcWindows.setOverclockear(false); // no hace falta pasarlo, ya que en la superclase por default es false

        Computadora[] listadoDePcs = {
                pcWindows,
                pcLinux
        };

        return listadoDePcs;
    }

    public static void recorrerYListarPcs(Computadora[] listado) {
        for (Computadora pc : listado) {
            System.out.println(pc.toString());
        }
    }

    public static void comprobarOverclockeoYModificarSiFueseFalso(Computadora[] listado) {
        for (Computadora pc : listado) {
            // si devuelve false lo negamos con "!" lo cual hace true la condicion y ejecuta el bloque if
            if (!pc.isOverclocked()) {
                pc.setOverclockear(true);
                pc.setCantidadDeRam(pc.getCantidadDeRam() * 2);
            }
        }
    }

}
