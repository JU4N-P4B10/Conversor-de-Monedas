import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("------------------------------------------");
            System.out.println("||        CONVERSOR DE MONEDAS          ||");
            System.out.println("||______________________________________||");
            System.out.println("||--------------------------------------||");
            System.out.println("||      1) Dólar a Peso argentino       ||");
            System.out.println("||      2) Dólar a Peso colombiano      ||");
            System.out.println("||      3) Dólar a Real brasileño       ||");
            System.out.println("||      4) Peso argentino a Dólar       ||");
            System.out.println("||      5) Peso colombiano a Dólar      ||");
            System.out.println("||      6) Real brasileño a Dólar       ||");
            System.out.println("||      7) Salir                        ||");
            System.out.println("------------------------------------------");
            System.out.print("Elija una opción válida: ");

            option = scanner.nextInt();

            ConversionDeMoneda conversion = null;
            double cantidad;

            switch (option) {
                case 1:
                    conversion = new Dolar_a_PesoArgentino();
                    break;
                case 2:
                    conversion = new Dolar_a_PesoColombiano();
                    break;
                case 3:
                    conversion = new Dolar_a_RealBrasileño();
                    break;
                case 4:
                    conversion = new PesoArgentino_a_Dolar();
                    break;
                case 5:
                    conversion = new PesoColombiano_a_Dolar();
                    break;
                case 6:
                    conversion = new RealBrasileno_a_Dolar();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("¡Opción inválida!. Por favor, Seleccione una opción válida.");
            }

            if (conversion != null) {
                System.out.print("Ingrese la cantidad que desea convertir: ");
                cantidad = scanner.nextDouble();
                conversion.convertir(cantidad);
            }

        } while (option != 7);

        scanner.close();
    }

}
