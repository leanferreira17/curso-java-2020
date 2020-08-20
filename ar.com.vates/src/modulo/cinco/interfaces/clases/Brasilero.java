package modulo.cinco.interfaces.clases;

public class Brasilero extends Persona {
    @Override
    public String vender(String articulo, float precio) {
        return super.vender(articulo, precio);
    }

    @Override
    public String caminar() {
        return "Eu camino";
    }

    @Override
    public String nadar() {
        return super.nadar();
    }

    @Override
    public String saludar() {
        return "Bom dia";
    }
}
