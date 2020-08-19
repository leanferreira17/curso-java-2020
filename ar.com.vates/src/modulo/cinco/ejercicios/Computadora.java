package modulo.cinco.ejercicios;

public abstract class Computadora {
    public abstract String getCantidadDeNucleos();
    public abstract String getCantidadDeRam();
    public abstract String getVersionDelSistema();
    public abstract boolean isOverclocked();
    public abstract void setVersion(String nuevaVersion);
    public abstract void setCantidadDeRam(int cantidadDeRam);
    public abstract void setOverclockear(boolean overclock);
}
