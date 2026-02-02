class BankAccount{
    private String name;
    private double  money;
    private int accountNumber;

    BankAccount(int accountNumber,String name,double money){
        this.accountNumber=accountNumber;
        this.name=name;
        this.money=money;
    }
    public double getMoney(){
        return money;
    }
    public void deposit(double amount){
        if(amount>0){
            money+=amount;
        }else{
    System.out.println("invalid amount");
}
    }
public void withdraw(double amount){
    if(amount>00 &&amount<=money){
        money-=amount;
    }
    else{
        System.out.println("insufficeint money");
    }
}
}
public class practice2 {
    public static void main(String[]args){
        BankAccount acc=new BankAccount(12345,"John",1000.0);
        System.out.println("Initial balance: "+acc.getMoney());
        acc.deposit(500.0);
        System.out.println("Balance after deposit: "+acc.getMoney());
        acc.withdraw(200.0);
        System.out.println("Balance after withdrawal: "+acc.getMoney());
    }
}
