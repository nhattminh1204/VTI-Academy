package BankingSystem.entity;

public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber, String ownerName, double balance) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance() = getBalance() + amount;
    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void calculateInterest() {

    }
}
