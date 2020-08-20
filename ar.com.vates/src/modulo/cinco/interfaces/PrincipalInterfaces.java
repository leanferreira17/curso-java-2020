package modulo.cinco.interfaces;

import modulo.cinco.interfaces.clases.*;

import java.util.ArrayList;

public class PrincipalInterfaces {
    public static void main(String[] args) {

        Persona[] hostel = {new Argentino(), new Brasilero(), new Japones(), new Aleman()};

        for (Persona persona : hostel) {
            System.out.println(persona.saludar());
        }

        // polimorfismo: las distintas formas de responder al mismo mensaje

        Accionable[] accionables = {new Argentino(), new Brasilero(), new Japones(), new Aleman()};

        for (Accionable persona : accionables) {
            System.out.println(persona.caminar());
        }

        // accedemos a las constantes de la interfaz
        // Accionable.VERSION;


    }
}
