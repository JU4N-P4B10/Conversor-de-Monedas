public class Dolar_a_PesoArgentino extends ConversionDeMoneda {

    public void convertir(double cantidad) {
        double tasaCambio = 980.25;
        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " Dólares equivalen a " + resultado + " Pesos Argentinos.");
    }
}

