package modulo.cuatro.modificadores.publico;

public class Anuncio {
    public String campaña = "Se lanzó la campaña contra el COVID19 en Vates!";
    private float indiceDeInflacion = 45.676F;

    public float calcularCostoDeCampana(float dinero) {
        return indiceDeInflacion * dinero;
    }
}
