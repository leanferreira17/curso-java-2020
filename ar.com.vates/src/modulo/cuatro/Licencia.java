package modulo.cuatro;

public class Licencia {
    static void otorgarLicencia(Persona persona) {
        if ((persona.getEdad() >= 16 && persona.getEdad() <= 65) &&
                persona.isNacioEnArgentina() &&
                persona.isPasoElExamenDeVista() &&
                persona.isPasoElExamenTeorico()) {
            System.out.println("Se le ha otorgado la licencia a: " + persona.getNombre());
        } else {
            System.out.println("La persona: " + persona.getNombre() + " no cumple con los requisitos necesarios.");
        }
    }
}
