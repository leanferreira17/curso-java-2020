package modulo.seis.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones {
    public static void main(String[] args) {
        final String frase = "A veces creo que hay vida en otros planetas, " +
                "y a veces creo que no. " +
                "En cualquiera de los 2 casos la conclusión es asombrosa."; // Carl Sagan

        //frase.contains("dos");

        /*
            [abc] 	Busca dentro del conjunto de caracteres
            [^abc] 	Busca fuera del conjunto de caracteres
            [0-9] 	Busca un caracter en el rango

            ^ 	Busca si la primer palabra es la definida por ^A
         */
        final String regex = "^Ambos";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(frase);
        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("Hay coincidencia.");
        } else {
            System.out.println("No se encontró coincidencia.");
        }

    }
}
