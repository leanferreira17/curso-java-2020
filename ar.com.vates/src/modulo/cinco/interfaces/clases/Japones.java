package modulo.cinco.interfaces.clases;

public class Japones extends Persona {
    @Override
    public String vender(String articulo, float precio) {
        return super.vender(articulo, precio);
    }

    @Override
    public String caminar() {
        return "善日善日善日善日善日善日善日";
    }

    @Override
    public String nadar() {
        return super.nadar();
    }

    @Override
    public String saludar() {
        return "善日";
    }
}
