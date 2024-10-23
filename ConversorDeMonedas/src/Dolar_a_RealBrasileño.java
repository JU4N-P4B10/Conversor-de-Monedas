public class Dolar_a_RealBrasileño extends ConversionDeMoneda {

    public void convertir(double cantidad) {
        double tasaCambio = 5.65;
        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " Dólares equivalen a " + resultado + " Reales Brasileños.");
    }
}
