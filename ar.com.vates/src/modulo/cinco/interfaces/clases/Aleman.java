package modulo.cinco.interfaces.clases;

public class Aleman extends Persona{
    @Override
    public String vender(String articulo, float precio) {
        return super.vender(articulo, precio);
    }

    @Override
    public String caminar() {
        return "Estoy caminando y soy aleman";
    }

    @Override
    public String nadar() {
        return super.nadar();
    }

    @Override
    public String saludar() {
        return "Gutenmorgen";
    }
}
