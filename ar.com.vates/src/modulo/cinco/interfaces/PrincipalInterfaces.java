package modulo.cinco.interfaces;

import modulo.cinco.interfaces.clases.Argentino;
import modulo.cinco.interfaces.clases.Brasilero;
import modulo.cinco.interfaces.clases.Japones;
import modulo.cinco.interfaces.clases.Persona;

public class PrincipalInterfaces {
    public static void main(String[] args) {

        Persona[] hostel = {new Argentino(), new Brasilero(), new Japones()};

        for (Persona persona : hostel) {
            System.out.println(persona.saludar());
        }
    }
}
