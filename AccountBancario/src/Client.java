public class Client {
    private String name;
    private Account account;

    public Client(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }
    public void addFunds(double amount) {
        account.deposit(amount);
    }
    public void  withdrawFunds(double amount) {
        account.withdraw(amount);
    }
}


