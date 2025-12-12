//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account UBS = new Account(0,"3231-1229-2418-6861");
        Client client = new Client(UBS, "Fusion");

        client.addFunds(69);
        client.withdrawFunds(2);

    }
}