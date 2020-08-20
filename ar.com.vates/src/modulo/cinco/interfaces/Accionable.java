package modulo.cinco.interfaces;

import java.util.Date;

public interface Accionable {
    // public static final
    Date FECHA_DE_CREACION = new Date();
    String VERSION = "1.2.3";
    String caminar();
    String nadar();
}
