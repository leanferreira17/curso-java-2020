package modulo.cinco.interfaces.clases;

import modulo.cinco.interfaces.Accionable;
import modulo.cinco.interfaces.Vendible;

public abstract class Persona implements Accionable, Vendible {
    public abstract String saludar();

    @Override
    public String vender(String articulo, float precio) {
        return "Estoy vendiendo este " + articulo + " a este precio " + precio;
    }

    @Override
    public String caminar() {
        return null;
    }

    @Override
    public String nadar() {
        return null;
    }
}
