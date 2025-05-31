public class Bankaccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public Bankaccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative.");
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not enough balance or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}