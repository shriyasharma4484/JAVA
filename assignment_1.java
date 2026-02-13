class Employee{
    String name;
    int id;
    int salary;
    Employee(){
        name="";
        id=0;
        salary=0;
    }
   Employee(String n,int i,int s){
        this.name=n;
        this.id=i;
        this.salary=s;
    }

    void displayEmployeeDetails(){
        System.out.println("Name is:"+ name);
        System.out.println("Id is:"+ id);
        System.out.println("salary is:"+ salary);
    }
}
class Manager extends Employee{
    int bonus;
    int totalSalary;
    Manager(){
        super();
        bonus=0;
    }    Manager (String n, int i,int s,int b){
        super(n,i,s);
        
        this.bonus=b;

    }
    void calculateTotalSalary(){
        totalSalary=bonus+salary;
        
    }
    void displayData(){
         System.out.println("Name is:"+ name);
        System.out.println("Id is:"+ id);
        System.out.println("salary is:"+ salary);
        System.out.println("Bonus is:"+ bonus);


         System.out.println("total salary is:"+ totalSalary);


    }
}
public class assignment_1{
    public static void main(String[]args){
        Manager m =   new Manager("Shriya",258,500000,1000);
        m.calculateTotalSalary();
        m.displayData();
      
    }
}



        
      