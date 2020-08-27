package modulo.seis.http;

import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;

public class HttpConexion {
    public static void main(String[] args) throws IOException {
        System.out.println(get("https://www.cultura.gob.ar/api/v2.0/museos/"));

        FraseCelebre objetoFraseCelebre = new FraseCelebre();
        objetoFraseCelebre.setAutor("yo");
        objetoFraseCelebre.setFrase("Q tal");

        // creamos nuestro objeto fraseCelebre y lo transformamos a json
        Gson gson = new Gson();
        String jsonParaEnviar = gson.toJson(objetoFraseCelebre);

        // se lo enviamos a nuestra app local
        System.out.println(put("http://localhost:8080/insertar", jsonParaEnviar));

        // recuperamos las frases alocadas en el server
        System.out.println(get("http://localhost:8080/listado"));

        // borramos toda la lista
        System.out.println("Eliminando la lista");
        post("http://localhost:8080/limpiar");

        // recuperamos las frases alocadas en el server,
        // comprobamos que fue eliminada
        System.out.println(get("http://localhost:8080/listado"));
    }

    public static String get(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }


    public static String put(String url, String json) throws IOException {
        final MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .put(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static String post(String url) throws IOException {
        final MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");

        RequestBody body = RequestBody.create(JSON, "");

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

}
