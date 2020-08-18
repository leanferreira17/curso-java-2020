package modulo.cinco.estaticas;

public class TestEstaticas {
    public static void main(String[] args) {
        // para acceder a un miembro de clase marcado como static
        // utilizamos: nombre de la clase + "." + atributo/metodo static
        System.out.println(EstadisticasCovid19Argentina.estimacionDeCasosPorDia);
         // cantidadDeDiasPromedioMensual;
        EstadisticasCovid19Argentina.getCasos();

        EstadisticasCovid19Argentina objetoEstadistica = new EstadisticasCovid19Argentina();
        objetoEstadistica.getVersion();

        Math.PI

        System.out.println(EstadisticasCovid19Argentina.getCasos());

        EstadisticasCovid19Argentina.incrementarContadorDeEnfermos(12);

        System.out.println(EstadisticasCovid19Argentina.getCasos());

        EstadisticasCovid19Argentina estadisticasCovid19Argentina = new EstadisticasCovid19Argentina();
        System.out.println(estadisticasCovid19Argentina.getVersion());

        estadisticasCovid19Argentina.setVersion("1.0.1 A");
        System.out.println(EstadisticasCovid19Argentina.getCantidadDeReversionados());

        // Veamos un ejemplo de atributos compartidos entre objetos y datos de instancia
        Juguete pelota = new Juguete("Pelota de futbol");
        System.out.println(pelota.toString());
        //System.out.println(Juguete.idJugueteGlobal);

        Juguete bicicleta = new Juguete("Bicicleta unisex");
        System.out.println(bicicleta.toString());
        //System.out.println(Juguete.idJugueteGlobal);

        // Ejemplos de final con lo que vimos en clases pasadas
        //Juguete.anio = 2021;

        // Constantes
    }
}
