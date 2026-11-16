/**
 * Test program demonstrating inheritance and different bank transactions.
 */
public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("=== Test 1: Regular Bank Account ===");
        BankAccount regular = new BankAccount();
        regular.setFirstName("Alex");
        regular.setLastName("Morgan");
        regular.setAccountID(1001);
        System.out.printf("Opening balance: $%.2f%n", regular.getBalance());
        regular.deposit(500.00);
        regular.withdrawal(100.00);
        regular.accountSummary();

        System.out.println("\n=== Test 2: Checking Account (No Overdraft) ===");
        CheckingAccount checking = new CheckingAccount(0.025);
        checking.setFirstName("Taylor");
        checking.setLastName("Reed");
        checking.setAccountID(2002);
        checking.deposit(200.00);
        checking.processWithdrawal(50.00);
        checking.displayAccount();

        System.out.println("\n=== Test 3: Checking Account (Overdraft) ===");
        checking.processWithdrawal(300.00);
        checking.displayAccount();

        System.out.println("\n=== Test 4: Invalid Deposit ===");
        try {
            regular.deposit(-20.00);
        } catch (IllegalArgumentException exception) {
            System.out.println("Expected error: " + exception.getMessage());
        }
    }
}
