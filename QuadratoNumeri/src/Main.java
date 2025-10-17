//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessun argomento fornito.");
            return;
        }

        for (String arg : args) {
            try {
                int numero = Integer.parseInt(arg);

                if (numero <= 0) {
                    throw new IllegalArgumentException("Errore: il numero deve essere positivo");
                }

                int quadrato = numero * numero;
                System.out.println(numero + " → quadrato: " + quadrato);

            } catch (NumberFormatException e) {
                System.out.println(arg + " → Errore: input non numerico");
            } catch (IllegalArgumentException e) {
                System.out.println(arg + " → " + e.getMessage());
            }
        }
    }
}