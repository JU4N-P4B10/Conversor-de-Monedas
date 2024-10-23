public class PesoArgentino_a_Dolar extends ConversionDeMoneda {

    public void convertir(double cantidad) {
        double tasaCambio = 0.00102;
        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " Pesos Argentinos equivalen a " + resultado + " Dólares.");
    }
}
