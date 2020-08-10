package util;

public class TiposPrimitivosFlotantes {
    public static void main(String[] args) {
        // float (32 bits)
        float miVariableFloat = 3.4028230E38F;

        // obtener los valores mínimo y máximo para este tipo
        System.out.println("Valor mínimo: " + Float.MIN_VALUE);
        System.out.println("Valor máximo: " + Float.MAX_VALUE);

        // double (64 bits)
        double miVariableDouble = 1.7976931348623157E300D;

        // obtener los valores mínimo y máximo para este tipo
        System.out.println("Valor mínimo: " + Double.MIN_VALUE);
        System.out.println("Valor máximo: " + Double.MAX_VALUE);
    }
}
