package modulo.cinco.interfaces;

import modulo.cinco.interfaces.clases.*;

public class PrincipalInterfaces {
    public static void main(String[] args) {

        Persona[] hostel = {new Argentino(), new Brasilero(), new Japones(), new Aleman()};

        for (Persona persona : hostel) {
            System.out.println(persona.saludar());
            System.out.println();
        }

        // polimorfismo: las distintas formas de responder al mismo mensaje
    }
}
