package modulo.cinco.ejercicios.pcs;

import modulo.cinco.ejercicios.Computadora;

public class Windows extends Computadora {

    @Override
    public int getCantidadDeNucleos() {
        return cantidadDeNucleos;
    }

    @Override
    public int getCantidadDeRam() {
        return cantidadDeRam;
    }

    @Override
    public String getVersionDelSistema() {
        return versionDelSistema;
    }

    @Override
    public boolean isOverclocked() {
        return overclocked;
    }

    @Override
    public void setCantidadDeRam(int cantidadDeRam) {
        super.cantidadDeRam = cantidadDeRam;
    }

    @Override
    public void setCantidadeNucleos(int cantidadDeNucleos) {
        super.cantidadDeNucleos = cantidadDeNucleos;
    }

    @Override
    public void setOverclockear(boolean overclock) {
        super.overclocked = overclock;
    }

    @Override
    public void setVersionDelSistema(String versionDelSistema) {
        super.versionDelSistema = versionDelSistema;
    }
}
