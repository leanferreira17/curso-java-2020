package modulo.seis.usodejson;

public class PrincipalJson {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "        \"nombre\":\"Juan Vates\",\n" +
                "        \"edad\":27,\n" +
                "        \"nacionalidad\":\"Argentino\",\n" +
                "        \"altura\":\"172 cm\",\n" +
                "        \"peso\":75,\n" +
                "        \"casado\":true,\n" +
                "        \"CursosRealizados\": [\"matematica\", \"Golang\", \"Php\"],\n" +
                "        \"hijo\": {\n" +
                "                    \"nombre\":\"Pedro\",\n" +
                "                    \"edad\": 12\n" +
                "                }\n" +
                "    }";

        System.out.println(jsonString);
        //String palabra = "\"hola\"";
    }
}
