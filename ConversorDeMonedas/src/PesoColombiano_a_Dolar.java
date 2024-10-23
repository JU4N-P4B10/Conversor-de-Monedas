public class PesoColombiano_a_Dolar extends ConversionDeMoneda {

    public void convertir(double cantidad) {
        double tasaCambio = 0.00023;
        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " Pesos Colombianos equivalen a " + resultado + " Dólares.");
    }
}
