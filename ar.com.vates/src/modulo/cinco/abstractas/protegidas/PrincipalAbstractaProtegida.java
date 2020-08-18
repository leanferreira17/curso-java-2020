package modulo.cinco.abstractas.protegidas;

public class PrincipalAbstractaProtegida {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println(cliente.getEspecieDelPadre());
    }
}
