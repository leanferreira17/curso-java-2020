package modulo.cinco.ejercicios;

public abstract class Computadora {
    protected int cantidadDeNucleos; // por default es 0
    protected int cantidadDeRam; // por default es 0
    protected String versionDelSistema; // por default es ""
    protected boolean overclocked; // por default es false

    public abstract int getCantidadDeNucleos();

    public abstract int getCantidadDeRam();

    public abstract String getVersionDelSistema();

    public abstract boolean isOverclocked();

    public abstract void setCantidadDeRam(int cantidadDeRam);

    public abstract void setCantidadeNucleos(int cantidadDeNucleos);

    public abstract void setOverclockear(boolean overclock);

    public abstract void setVersionDelSistema(String versionDelSistema);

    @Override
    public String toString() {
        return "Computadora{" +
                "cantidadDeNucleos=" + cantidadDeNucleos +
                ", cantidadDeRam=" + cantidadDeRam +
                ", versionDelSistema='" + versionDelSistema + '\'' +
                ", overclocked=" + overclocked +
                '}';
    }
}
