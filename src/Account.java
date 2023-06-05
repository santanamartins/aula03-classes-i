public class Account {
    String number;
    double balance;

    Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    Account(String number) {
        this.number = number;
        this.balance = 0.0;
    }

    double deposit(double amount) {
        balance = balance + amount;

        return balance;
    }

    double withDraw(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficente balance");
        }
        balance = balance - amount;

        return balance;
    }
}
