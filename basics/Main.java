// Encapsulation Example in Java

class BankAccount {
    // Private data members (restricted access)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (with validation)
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Parag", 5000);

        // Accessing data using getter
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());

        // Updating balance using setter
        acc.setBalance(7000);
        System.out.println("Updated Balance: " + acc.getBalance());

        // Trying negative balance (restricted)
        acc.setBalance(-200); // shows validation message
    }
}
