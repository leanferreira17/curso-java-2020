package modulo.cinco.ejercicios.interfaces;

public interface AnalisisDeTexto {
    String reemplazarPalabra(String palabraAReemplazar, String palabraNueva, String frase);

    String obtenerPrimerPalabra(String frase);

    int obtenerCantidadDePalabras(String frase);

    String convertirTodaLaFraseAMayusculas(String frase);

    String obtenerUltimaPalabra(String frase);

    int getCantidadDeVocales(String frase);

    int getCantidadDeConsonantes(String frase);
}
