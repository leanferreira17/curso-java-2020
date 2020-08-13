package modulo.cuatro;

public class UsoDeInstanceOf {
    public static void main(String[] args) {
        String comprobacion = "";
        Integer integer = new Integer(7);

        comprobacion = (integer instanceof Object) ? "Es una instancia de Object" : "No es una instancia de Integer";
        System.out.println(comprobacion);
    }
}
