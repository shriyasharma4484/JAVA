// Custom Exception for insufficient balance
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Exception for invalid withdrawal amount
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw method
    public void withdraw(double amount)
            throws InsufficientFundsException, InvalidAmountException {

        // First check if amount is multiple of 100
        if (amount % 100 != 0) {
            throw new InvalidAmountException(
                "Withdrawal amount must be in multiples of 100."
            );
        }

        // Then check sufficient balance
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient balance in account."
            );
        }

        // If valid
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining Balance: " + balance);
    }
}

// Main class
public class Sn8 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(123234, 60000);

        try {

            // Try different test values here
            account.withdraw(70000);   // More than balance
            // account.withdraw(550);  // Not multiple of 100
            // account.withdraw(5000); // Valid withdrawal

        }
        catch (InvalidAmountException e) {
            System.out.println("Invalid Amount Error: " + e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds Error: " + e.getMessage());
        }

    }
}