package modulo.cinco.estaticas;

public class EstadisticasCovid19Argentina {
    public static long estimacionDeCasosPorDia = 2000;
    public static final int cantidadDeDiasPromedioMensual = 30;
    public static long casos = 0;
    private String version = "1.0.0 A";
    private static long cantidadDeReversionados = 0;

    public static void incrementarContadorDeEnfermos(long cantidadDeEnfermos) {
        EstadisticasCovid19Argentina.casos += cantidadDeEnfermos;
    }

    public static long getCasos() {
        // no se recomienda utilizar la variable this para acceder a atributos static
        // Sí se recomienda hacer referencia a la clase
        return EstadisticasCovid19Argentina.casos;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        EstadisticasCovid19Argentina.cantidadDeReversionados++;
        this.version = version;
    }

    public static long getCantidadDeReversionados() {
        return EstadisticasCovid19Argentina.cantidadDeReversionados;
    }
}
