package util;

public class TiposPrimitivosEnteros {
    public static void main(String[] args) {
        // byte (8 bits)
        byte miVariableByte = -100;

        // obtener los valores mínimo y máximo para este tipo
        System.out.println("Valor mínimo: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo: " + Byte.MAX_VALUE);

        // short (16 bits)
        short miVariableShort = 32765;

        // obtener los valores mínimo y máximo para este tipo
        System.out.println("Valor mínimo: " + Short.MIN_VALUE);
        System.out.println("Valor máximo: " + Short.MAX_VALUE);

        // int (32 bits)
        int miVariableInt = 2147483645;

        // obtener los valores mínimo y máximo para este tipo
        System.out.println("Valor mínimo: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo: " + Integer.MAX_VALUE);

        // long (64 bits)
        long miVariableLong = 92233720368547758L;

        // obtener los valores mínimo y máximo para este tipo
        System.out.println("Valor mínimo: " + Long.MIN_VALUE);
        System.out.println("Valor máximo: " + Long.MAX_VALUE);
    }
}
