public class Account3Test {
    public static void main(String[] args) {
        var account = new Account3("18373-x", 200.0);

        System.out.println(account.deposit(55.0));
        System.out.println(account.withDraw(23.0));

        System.out.printf("Number: %s Balance: %.2f\n", account.getNumber(), account.getBalance());
    }
}
