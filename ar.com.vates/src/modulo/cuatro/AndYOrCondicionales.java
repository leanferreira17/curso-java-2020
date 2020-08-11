package modulo.cuatro;

import java.util.Random;

public class AndYOrCondicionales {
    public static void main(String[] args) {
        Random random = new Random();
        int minimo = 15;
        int maximo = 100;

        Persona objetoPersona = new Persona(
                "Pedro",
                'M',
                50 ,//random.nextInt(maximo - minimo) + minimo,
                true, //random.nextBoolean(),
                true, //random.nextBoolean(),
                false //random.nextBoolean()
        );

        System.out.println(objetoPersona.toString());

        /*
            Condiciones para que se le otorgue la licencia de conducir:
            - Haber nacido en Argentina
            - Tener entre 16 y 65 años inclusive
            - Haber pasado el examen de vision
            - Haber pasado el examen teórico
         */

        Licencia.otorgarLicencia(objetoPersona);

        if (4 == 8 && 6 > 9 && 3 == 4 && !(6 > 5) || 5 == 5) {

        } else {

        }

    }
}

class Auto {
    String marca;
}

