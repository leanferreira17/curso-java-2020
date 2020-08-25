package modulo.seis.usodejson;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private ArrayList<String> cursosRealizados;
    private Hijo hijo;

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }

    public ArrayList<String> getCursosRealizados() {
        return cursosRealizados;
    }

    public void setCursosRealizados(ArrayList<String> cursosRealizados) {
        this.cursosRealizados = cursosRealizados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
