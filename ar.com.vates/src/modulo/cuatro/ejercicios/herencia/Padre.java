package modulo.cuatro.ejercicios.herencia;

public class Padre extends Object {
    private String nombre;
    private String apellido;
    private String colorDeOjos;
    private float estatura;
    private String ocupacion;
    private boolean casado;
    private int edad;

//    @Override
//    public String toString() {
//        return "Padre{" +
//                "nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", colorDeOjos='" + colorDeOjos + '\'' +
//                ", estatura=" + estatura +
//                ", ocupacion='" + ocupacion + '\'' +
//                ", casado=" + casado +
//                ", edad=" + edad +
//                '}';
//    }

    public Padre(String nombre, String apellido, String colorDeOjos, float estatura, String ocupacion, boolean casado, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colorDeOjos = colorDeOjos;
        this.estatura = estatura;
        this.ocupacion = ocupacion;
        this.casado = casado;
        this.edad = edad;
    }

    public Padre(String nombre) {
        this.nombre = nombre;
    }

    public Padre() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColorDeOjos() {
        return colorDeOjos;
    }

    public void setColorDeOjos(String colorDeOjos) {
        this.colorDeOjos = colorDeOjos;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String saludar() {
        return "Hola";
    }
}
