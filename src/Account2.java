/**
 * Account with public modifiers on properties 
 * and methods.
 */
public class Account2 {
    public String number;
    public double balance;

    public Account2(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public Account2(String number) {
        this.number = number;
        this.balance = 0.0;
    }

    public double deposit(double amount) {
        balance = balance + amount;

        return balance;
    }

    public double withDraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficente balance");
        }
        balance = balance - amount;

        return balance;
    }
}
