package modulo.cinco.estaticas;

public class Juguete {
    private long idJuguete;
    private String tipo;
    public static long idJugueteGlobal;
    public static final int anio = 2020;


    @Override
    public String toString() {
        return "Juguete{" +
                "idJuguete=" + idJuguete +
                ", tipo='" + tipo + '\'' +
                ", anio=" + anio +
                '}';
    }

    public Juguete(String tipo) {
        this.tipo = tipo;
        this.idJuguete++;
        Juguete.idJugueteGlobal++;
    }

    public long getIdJuguete() {
        return idJuguete;
    }

    public void setIdJuguete(long idJuguete) {
        this.idJuguete = idJuguete;
    }

    public String getTipo() {
        return this.tipo;
    }
}
