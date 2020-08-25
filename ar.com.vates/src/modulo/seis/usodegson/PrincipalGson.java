package modulo.seis.usodegson;

import com.google.gson.Gson;
import modulo.seis.usodejson.Persona;

public class PrincipalGson {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String jsonString = "{\n" +
                "        \"nombre\":\"Juan Vates\",\n" +
                "        \"edad\":27,\n" +
                "        \"nacionalidad\":\"Argentino\",\n" +
                "        \"altura\":\"172 cm\",\n" +
                "        \"peso\":75,\n" +
                "        \"casado\":true,\n" +
                "        \"cursosRealizados\": [\"matematica\", \"Golang\", \"Php\"],\n" +
                "        \"hijo\": {\n" +
                "                    \"nombre\":\"Pedro\",\n" +
                "                    \"edad\": 12\n" +
                "                }\n" +
                "    }";

        Persona persona = gson.fromJson(jsonString, Persona.class);
        System.out.println(persona.getNombre());
        System.out.println(persona.getCursosRealizados());
        System.out.println(persona.getHijo().getNombre());
    }
}
