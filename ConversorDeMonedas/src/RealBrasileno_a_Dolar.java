public class RealBrasileno_a_Dolar extends ConversionDeMoneda {

    public void convertir(double cantidad) {
        double tasaCambio = 0.1764;
        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " Reales Brasileños equivalen a " + resultado + " Dólares.");
    }

}
