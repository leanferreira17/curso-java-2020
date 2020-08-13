package modulo.cuatro.herencia.base;

public class PrincipalBase {
    public static void main(String[] args) {
        /*
            El error con el tema del modificador protected fue intentar acceder por acceso directo.
            Revisar como se llama a los atributos del padre en el
            método: automovil.imprimirLosDatosDeLaClaseVehiculo();
        */
        Automovil automovil = new Automovil("Utilitario", 1990, "Ranger");
        automovil.imprimirLosDatosDeLaClaseVehiculo();
        automovil.imprimirLosDatosDeLaClaseVehiculoMasLaClaseAutomovil();

        /*
            Otra forma de poder acceder a los atributos de la super clase seria la siguiente
         */
        automovil.getTipoClasePadre();
        automovil.getAnioDeFabricacionClasePadre();

        // ATENCION!!!
        // Dentro del paquete cuatro.ejercicios.herencia deje ejercicios
    }
}
