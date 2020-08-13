package modulo.cuatro.herencia.clasesprotegidas;

public class Vehiculo {
    protected String tipo; // pickup, sedan, etc...
    protected int anioFabricacion;

    public Vehiculo(String tipo, int anioFabricacion) {
        this.tipo = tipo;
        this.anioFabricacion = anioFabricacion;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected int getAnioFabricacion() {
        return anioFabricacion;
    }

    protected void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

}
