package modulo.seis.fechas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ManejoDeFechas {
    public static void main(String[] args) {

        // Date

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        int hora = ahora.getHour();
        System.out.println("Hora: " + hora);

        int minutos = ahora.getMinute();
        System.out.println("Minutos: " + minutos);

        int cantidadDeHorasASumar = 2;
        ahora = ahora.plusHours(cantidadDeHorasASumar);
        System.out.println("Se han agregado " + cantidadDeHorasASumar +
                " hs a la hora actual. Resultado: " + ahora.getHour());

        LocalDate fechaDeNacimiento = LocalDate.of(1986, Month.FEBRUARY, 1);
        System.out.println(fechaDeNacimiento);
        System.out.println("Entonces tenes " +
                ChronoUnit.YEARS.between(fechaDeNacimiento, LocalDate.now())
                + " años."
        );

        System.out.println("Serian unos " +
                ChronoUnit.MONTHS.between(fechaDeNacimiento, LocalDate.now())
                + " meses."
        );

    }
}
