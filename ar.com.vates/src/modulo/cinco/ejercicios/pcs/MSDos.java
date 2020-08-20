package modulo.cinco.ejercicios.pcs;

import modulo.cinco.ejercicios.Computadora;

public class MSDos extends Computadora {

    @Override
    public int getCantidadDeNucleos() {
        return 0;
    }

    @Override
    public int getCantidadDeRam() {
        return 0;
    }

    @Override
    public String getVersionDelSistema() {
        return null;
    }

    @Override
    public boolean isOverclocked() {
        return false;
    }

    @Override
    public void setCantidadDeRam(int cantidadDeRam) {

    }

    @Override
    public void setCantidadeNucleos(int cantidadDeNucleos) {

    }

    @Override
    public void setOverclockear(boolean overclock) {

    }

    @Override
    public void setVersionDelSistema(String versionDelSistema) {

    }
}
