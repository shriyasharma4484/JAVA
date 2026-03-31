class Account{
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    double calculateInterest(double balance){
        return balance*0.02;

    }
    
}
class SavingsAccount extends Account{
    SavingsAccount(double balance){
        super(balance);
    }
    
    double calculateInterest(double balance){
        if(balance>500000){
            return balance*0.04 + 500;
        }
        return balance*0.04;
    }
    }

class FixedDeposit extends SavingsAccount{
    FixedDeposit(double balance){
        super(balance);
    }
    double calculateInterest(double balance){
        double baseInterest = super.calculateInterest(balance);
        return baseInterest*0.02*balance;


    }



}
public class Case_study1{
    public static void main(String[]args){
        Account a = new Account(100000);
        System.out.println("Interest for Account: " + a.calculateInterest(a.balance));
        SavingsAccount sa = new SavingsAccount(600000);
        System.out.println("Interest for Savings Account: " + sa.calculateInterest(sa.balance));
        FixedDeposit fd = new FixedDeposit(700000);
        System.out.println("Interest for Fixed Deposit: " + fd.calculateInterest(fd.balance));
    }
}
    

    