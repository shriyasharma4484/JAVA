import java.util.ArrayList;


class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class Account {
    String accountNumber;
    String name;
    double balance;

    Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public void transfer(Account targetAccount, double amount) 
            throws InsufficientFundsException {

        if (targetAccount == null) {
            throw new IllegalArgumentException("Target account not found!");
        }

        this.withdraw(amount);          // deduct from current account
        targetAccount.deposit(amount);  // add to target account

        System.out.println("Transfer successful!");
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}


class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(String accountNumber, 
                              String accountHolderName, 
                              double initialBalance) {

        Account acc = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(acc);
        System.out.println("Account created successfully!");
    }

    public Account getAccount(String accountNumber) {

        for (int i = 0; i < accounts.size(); i++) {

            Account acc = accounts.get(i);

            if (acc.accountNumber.equalsIgnoreCase(accountNumber)) {
                return acc;
            }
        }

        return null;
    }

    public void displayAllAccounts() {

        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).displayAccountDetails();
        }
    }
}

public class Sn5{

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Create accounts
        bank.createAccount("101", "Shriya", 5000);
        bank.createAccount("102", "Rahul", 3000);

        Account acc1 = bank.getAccount("101");
        Account acc2 = bank.getAccount("102");

        try {

            acc1.deposit(2000);
            acc1.withdraw(1000);
            acc1.transfer(acc2, 1500);

        } catch (InsufficientFundsException e) {

            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nFinal Account Details:");
        bank.displayAllAccounts();
    }
}
