package modulo.cinco.abstractas.protegidas;

import modulo.cinco.abstractas.Persona;

public class Cliente extends Persona {
    public String getEspecieDelPadre() {
        return super.especie;
    }
}
