/**
 * Account with private modifiers on properties 
 * and public modifier on external methods.
 * Some methods are internal (private), meaning that they 
 * are intended to be used only for internal purposes.
 * An account is immutable, i.e. it cannot be modified once it is created
 * (that is why all setters are private)
 */
public class Account3 {
    private String number;
    private double balance;

    public Account3(String number, double balance) {
        setNumber(number);
        setBalance(balance);
    }

    public Account3(String number) {
        setNumber(number);
        setBalance(0.0);
    }

    public String getNumber() {
        return number;
    }

    /**
     * Sets the number of the account.
     *
     * @param number a number with 3-5 digits followed by a single verifier digit (number or x)
     */
    private void setNumber(String number) {
        if (!number.matches("\\d{3,5}-(\\d|x)")) {
            throw new IllegalArgumentException("Invalid account number");
        }
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the account.
     * 
     * @param balance a non-negative balance value
     */
    private void setBalance(double balance) {
        if (balance < 0.0) {
            throw new IllegalArgumentException("Balance must not be negative");
        }
        this.balance = balance;
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
