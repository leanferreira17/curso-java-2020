class ClasePrincipal {
    public static void main(String[] args) {
        int valorInt = 23;
        float valorFloat = 45.6F;
        long valorLong = 423444L;
        double valorDouble = 169.7007D;

        double resultadoDeLaOperacion = (valorInt * valorDouble) / valorFloat - valorLong;

        System.out.println(resultadoDeLaOperacion);

     }
}