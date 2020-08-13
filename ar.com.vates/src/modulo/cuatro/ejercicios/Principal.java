package modulo.cuatro.ejercicios;

public class Principal {
    public static void main(String[] args) {
        // desarrollar los ejercicios aqui
        Consola consola = new Consola();
        Cliente cliente1 = new Cliente();
        cliente1.setApellido(consola.capturarValorString("Ingresar apellido: "));
        cliente1.setArgentino(consola.capturarValorBoolean("Ingresar true o false si es argentino: "));
        //cliente1.setApellido();

        Cliente cliente2 = new Cliente();
        System.out.println("Apellido cliente 2: " + cliente2.getApellido());

        Banco banco = new Banco();
        boolean resultado = banco.otorgarPrestamo(cliente1);

        if (resultado) {
            System.out.println("se le otorgo el prestamo");
        }
    }

    /*
        Analizar la clase Consola:
        - Es posible utilizarla fuera del paquete "ejercicios"? Por qué?
        - Desde la clase Principal es posible acceder a su atributo objetoScanner de esta forma:

          Consola objetoConsola = new Consola();
          objetoConsola.objetoScanner;

          Por qué?

        - Es posible acceder a sus métodos capturar...() desde la clase Principal? Por qué?
        - Es posible acceder a su método imprimirMensaje() desde la clase Principal? Por qué?

    */

    /*
        Utilizando la clase Consola y sus métodos instanciar un objeto Cliente.
        Completar el método otorgarPrestamo() de la clase Banco con las siguientes condiciones:
        - Debe tener entre 18 y 65 años.
        - Debe estar casado.
        - Debe ser argentino.
        - Debe tener un sueldo mayor a 10000.
        - No debe tener deudas con el banco.

        Instanciar un objeto de tipo Banco.
        Pasar por parámetro el objeto cliente al metodo otorgarPrestamo() del objeto Banco.
        Imprimir el resultado por consola.
    */
}






