import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Conversión de Bases Numéricas");
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n---Menu de Convwersiones---");
            System.out.println("--1.- Decimal a Binario ");
            System.out.println("--2.- Conversion 2");
            System.out.println("--3.- Conversion 3 ");
            System.out.println("--4.- Conversion 4 ");
            System.out.println("Por favor digite la apcion: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    DecimnalABinario();
                    break;

                case 2:
                    DecimnalAOctal();
                    break;

            }
        } while (opc <= 4);

    }

    static void DecimnalABinario() {
        System.out.println("Conversion de decimal a binario \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número decimal: ");
        int decimal = scanner.nextInt();

        String binario = decimalABinario(decimal);

        System.out.println("El equivalente binario es: \n " + binario);
    }

    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario.insert(0, residuo);
            decimal /= 2;
        }

        return binario.toString();
    }

    static void DecimnalAOctal() {

    }
}
