package modulo.cuatro.ejercicios;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private float sueldo;
    private boolean argentino;
    private boolean casado;
    private boolean debeAlBanco;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isArgentino() {
        return argentino;
    }

    public void setArgentino(boolean argentino) {
        this.argentino = argentino;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public boolean isDebeAlBanco() {
        return debeAlBanco;
    }

    public void setDebeAlBanco(boolean debeAlBanco) {
        this.debeAlBanco = debeAlBanco;
    }


}
