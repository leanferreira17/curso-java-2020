package modulo.cuatro.herencia.base;

import modulo.cuatro.herencia.clasesprotegidas.Vehiculo;

public class Automovil extends Vehiculo {
    private String modelo; // Ranger, Cruze, etc...
    /*
        Estamos en una clase que se encuentra en otro paquete distinto al paquete "clasesprotegidas"
        donde se encuentra la super clase "Vehiculo"
        Mediante la palabra super accedemos a los atributos de la clase padre
    */

    public Automovil(String tipo, int anioFabricacion, String modelo) {
        super(tipo, anioFabricacion); // llamamos al constructor de la clase padre
        this.modelo = modelo;
    }

    public void imprimirLosDatosDeLaClaseVehiculo() {
        // con super llamamos a la clase padre y accedemos a sus atributos
        String tipo = super.tipo;
        int anioDeFabricacion = super.anioFabricacion;

        System.out.println("Tipo: " + tipo);
        System.out.println("Año de fabricación: " + anioDeFabricacion);
    }

    public void imprimirLosDatosDeLaClaseVehiculoMasLaClaseAutomovil() {
        // con super llamamos a la clase padre y accedemos a sus atributos
        String tipo = super.tipo;
        int anioDeFabricacion = super.anioFabricacion;

        System.out.println("Tipo: " + tipo);
        System.out.println("Año de fabricación: " + anioDeFabricacion);
        System.out.println("Modelo: " + this.modelo);
    }

    // asi obtenemos los datos de la clase padre (super clase)
    public String getTipoClasePadre() {
        return super.tipo;
    }

    public int getAnioDeFabricacionClasePadre() {
        return super.anioFabricacion;
    }
}
