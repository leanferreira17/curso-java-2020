package modulo.cuatro.ejercicios.herencia;

public class Hijo extends Padre {
    // NO agregar mas atributos
    private String nombre;
    private int edad;

    public Hijo(String nombrePadre, String apellidoPadre, String colorDeOjosPadre, float estaturaPadre, String ocupacionPadre, boolean casadoPadre, int edadPadre, String nombreHijo, int edadHijo) {
        super(nombrePadre, apellidoPadre, colorDeOjosPadre, estaturaPadre, ocupacionPadre, casadoPadre, edadPadre);
        //super(nombrePadre);
        //super();
        this.nombre = nombreHijo;
        this.edad = edadHijo;
    }

    public Hijo() {}

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // imprimir datos completos del padre
    public void imprimirDatosCompletosDelPadre() {
        System.out.println(toString());
    }

    // imprimir nombre y apellido del hijo
    public void imprimirNombreYApellidoHijo() {
        System.out.println(getNombre() + " " + super.getApellido());
    }

    // cantidad de años que se llevan padre e hijo
    public void imprimirDiferenciaDeEdad() {
        System.out.println(super.getEdad() - this.edad);
    }

    @Override
    public String saludar() {
        return "q onda";
    }
}
