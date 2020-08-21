package modulo.cinco.ejercicios.interfaces;

public interface AnalisisDeTexto {
    String reemplazarPalabra(String palabraAReemplazar);

    String obtenerPrimerPalabra(String frase);

    String obtenerCantidadDePalabras(String frase);

    String convertirTodaLaFraseAMayusculas(String frase);

    String obtenerUltimaPalabra(String frase);

    int getCantidadDeVocales(String frase);

    int getCantidadDeConsonantes(String frase);
}
