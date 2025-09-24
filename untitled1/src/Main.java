public class Main {

    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);

        System.out.println("Sequenza di Collatz per: " + numero);

        while (numero != 1) {
            System.out.print(numero + " --> ");
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = 3 * numero + 1;
            }
        }

        System.out.println("1");
    }
}