package modulo.cuatro.modificadores.base;

//import modulo.cuatro.modificadores.pordefault.ReciboDeSueldo;
//import modulo.cuatro.modificadores.privado.CuentaBancaria;
import modulo.cuatro.modificadores.protegidos.ClaseHija;
//import modulo.cuatro.modificadores.protegidos.ClaseProtegida;
import modulo.cuatro.modificadores.publico.Anuncio;

public class ClaseBasePrincipal {
    public static void main(String[] args) {
        // default o package
        // importamos la clase ReciboDeSueldo con modificadores default

        //ReciboDeSueldo reciboDeSueldo = new ReciboDeSueldo();
        // comprobamos que por ser default no se puede importar

        // public
        Anuncio anuncio = new Anuncio();
        System.out.println(anuncio.campaña);

        // private (atributo), la clase no puede ser privada
        //CuentaBancaria cuentaBancaria = new CuentaBancaria();

        // protected
        //ClaseHija claseHija = new ClaseHija();

        //System.out.println("Codigo de la clase padre: " + claseHija.getCodigo());
    }
}