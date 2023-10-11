package entities;

public class Account {
    private int numberAcc;
    private String holder;
    private double balance;
    public static double taxa = 5.00;

    public Account(int numberAcc, String holder, double initialDeposit) {
        this.numberAcc = numberAcc;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int numberAcc, String holder) {
        this.numberAcc = numberAcc;
        this.holder = holder;
    }

    public int getNumberAcc() {
        return numberAcc;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount == 0) {
            return balance;
        }
        balance -= amount + taxa;
        return amount;
    }

    public String toString() {
        return "Acount "
                + numberAcc
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f%n", balance);
    }

}
