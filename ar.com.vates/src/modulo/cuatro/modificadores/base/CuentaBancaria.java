package modulo.cuatro.modificadores.base;

public class CuentaBancaria {
    private String titularDeCuenta = "Leandro Perez";
    private float montoDeLaCuenta = 20000000000F;
    private boolean politico = true;
    private long numeroDeSerie = 234523453245324L;

    // mutators -> setters y getters
    public String getTitularDeCuenta() {
        return this.titularDeCuenta;
    }

    public String getTitularSiNoEsPolitico() {
        if (this.politico == true) {
            return "No se puede devolver el titular.";
        } else {
            return this.titularDeCuenta;
        }
    }

    public void setTitularDeCuenta(String titularDeCuenta) {
        this.titularDeCuenta = titularDeCuenta;
    }
}
