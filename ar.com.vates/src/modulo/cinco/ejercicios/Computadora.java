package modulo.cinco.ejercicios;

public abstract class Computadora {
    public abstract int getCantidadDeNucleos();
    public abstract int getCantidadDeRam();
    public abstract String getVersionDelSistema();
    public abstract boolean isOverclocked();
    public abstract void setCantidadDeRam(int cantidadDeRam);
    public abstract void setOverclockear(boolean overclock);
}
