package modulo.cuatro;

public class EstructuraForEach {
    public static void main(String[] args) {

        int arreglo [] = {0, 1, 2, 3, 4, 5};

        for (int elemento: arreglo) {
            System.out.println(elemento);
        }

        Curso [] cursos = {
                new Curso("Java para físicos cuánticos."),
                new Curso("Java en la cocina."),
                new Curso("Adelgace programando en Java."),
                new Curso("Cómo hacerse millonario programando en Java.")};

        for (Curso elemento: cursos) {
            System.out.println(elemento.getTitulo());
        }
    }
}

class Curso {
    private String titulo;

    public Curso(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }
}
