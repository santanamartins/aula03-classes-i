public class AccountTest {
    public static void main(String[] args) {
        var account1 = new Account("1234-x", 100.0);
        var account2 = new Account("3456-7", 200.0);

        System.out.printf("Number: %s Balance: %.2f\n", account1.number, account1.balance);
        System.out.printf("Number: %s Balance: %.2f\n", account2.number, account2.balance);

        
        System.out.println(account1.deposit(55.0));
        System.out.println(account2.withDraw(23.0));

        var account3 = new Account("18373-x");

        System.out.printf("Number: %s Balance: %.2f\n", account3.number, account3.balance);
    }
}
