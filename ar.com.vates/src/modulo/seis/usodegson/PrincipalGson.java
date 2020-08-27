package modulo.seis.usodegson;

import com.google.gson.Gson;
import modulo.seis.usodejson.Hijo;
import modulo.seis.usodejson.Persona;

public class PrincipalGson {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // get server
        String respuestaDeLaApi = "{\n" +
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

        Persona persona = gson.fromJson(respuestaDeLaApi, Persona.class);
        System.out.println(persona.getNombre());
        System.out.println(persona.getCursosRealizados());
        System.out.println(persona.getHijo().getNombre());

        Hijo hijo = new Hijo();
        hijo.setEdad(22);
        hijo.setNombre("Pepe");
        hijo.setAltura(1.56F);
        hijo.setCasado(false);

        System.out.println(gson.toJson(hijo));

        String museos = "{\n" +
                "            \"id\": 27,\n" +
                "            \"url\": \"https://www.cultura.gob.ar/api/v2.0/organismos/27/\",\n" +
                "            \"link\": \"https://www.cultura.gob.ar/institucional/organismos/museos/comision-nacional-de-la-manzana-de-las-luces/\",\n" +
                "            \"nombre\": \"Complejo Histórico Cultural Manzana de las Luces\",\n" +
                "            \"direccion\": \"Perú 294, Ciudad de Buenos Aires\",\n" +
                "            \"telefono\": \"+54 (011) 4342-9930 / 6973\",\n" +
                "            \"descripcion\": \"<p>El Complejo Hist&oacute;rico Cultural Manzana de las Luces depende del Ministerio de Cultura de la Naci&oacute;n.</p>\\r\\n<p>Fue creada en 1971 por el Decreto n&ordm; 4657/71 y ampliadas sus funciones por los decretos: 1185/73; 1454/74 y 1479/81. El decreto 108/2013 cambia su nombre de Comisi&oacute;n Nacional a Complejo Hist&oacute;rico Cultural Manzana de las Luces.</p>\\r\\n<p>Son sus objetivos la restauraci&oacute;n y conservaci&oacute;n de los edificios hist&oacute;ricos; la investigaci&oacute;n con relaci&oacute;n a instituciones, acontecimientos y personajes que desfilaron por la Manzana de las Luces; y la refuncionalizaci&oacute;n de los edificios a trav&eacute;s de la actividad cultural.</p>\",\n" +
                "            \"email\": \"cnml@manzanadelasluces.gov.ar\",\n" +
                "            \"provincia\": \"\",\n" +
                "            \"depende_de\": \"Ministerio de Cultura de la Nación\",\n" +
                "            \"autoridad\": null\n" +
                "        }";

        Museo museo = gson.fromJson(museos, Museo.class);
        System.out.println(museo.getId() + "\n" + museo.getUrl());

    }
}
