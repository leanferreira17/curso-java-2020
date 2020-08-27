package modulo.seis.http;

import okhttp3.*;

import java.io.IOException;

public class HttpConexion {
    public static void main(String[] args) throws IOException {
        System.out.println(get("https://www.cultura.gob.ar/api/v2.0/museos/"));

        String json = "{\" +\n" +
                "                \"{\\\"frase\\\":\\\"hola q tal\\\", \\\"autor\\\":\\\"yo\\\" }";
        System.out.println(post("http://localhost:8080/insertar", json));
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


    public static String post(String url, String json) throws IOException {
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

}
