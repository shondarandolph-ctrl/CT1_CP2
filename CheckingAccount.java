/**
 * A checking account inherits the BankAccount fields and methods,
 * and adds an interest rate and overdraft fee handling.
 */
public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.00;

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void processWithdrawal(double amount) {
        double balanceBeforeWithdrawal = getBalance();
        super.withdrawal(amount);

        if (amount > balanceBeforeWithdrawal) {
            super.withdrawal(OVERDRAFT_FEE);
            System.out.printf("Overdraft fee assessed: $%.2f%n", OVERDRAFT_FEE);
        } else {
            System.out.println("Withdrawal completed with no overdraft fee.");
        }
        System.out.printf("Current balance: $%.2f%n", getBalance());
    }

    public void displayAccount() {
        accountSummary();
        System.out.printf("Interest Rate: %.2f%%%n", interestRate * 100);
    }
}
