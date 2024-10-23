public class Dolar_a_PesoColombiano extends ConversionDeMoneda {

    public void convertir(double cantidad) {
        double tasaCambio = 4264.37;
        double resultado = cantidad * tasaCambio;
        System.out.println(cantidad + " Dólares equivalen a " + resultado + " Pesos Colombianos.");
    }
}
