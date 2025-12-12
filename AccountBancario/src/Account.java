public class Account {
    private double balance;
    private String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        if (balance == 0) {
            System.out.println("you can t prelevate" + amount + "because your total balance is:" +balance);
        } else {
            balance-=amount;
        }
    }
}
