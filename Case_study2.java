class Employee{
    String name;
    double baseSalary;
    Employee(String name,double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    double calculateSalary(double baseSalary){
        return baseSalary + 0.05*baseSalary;
    }
}
class Manager extends Employee{
    Manager(String name,double baseSalary){
        super(name,baseSalary);
    }
    double calculateSalary(double baseSalary){
        return super.calculateSalary(baseSalary) + 20000;
    }

}
class Executive extends Manager{
    Executive(String name,double baseSalary){
        super(name,baseSalary);
    }
    double calculateSalary(double baseSalary){
        return super.calculateSalary(baseSalary)+0.01*baseSalary;
    }
}
public class Case_study2{
    public static void main(String[]args){
        Employee e = new Employee("John",50000);
        System.out.println("Salary for Employee: " + e.calculateSalary(e.baseSalary));
        Manager m = new Manager("Jane",80000);
        System.out.println("Salary for Manager: " + m.calculateSalary(m.baseSalary));
        Executive ex = new Executive("Shriya",120000);
        System.out.println("Salary for Executive: " + ex.calculateSalary(ex.baseSalary));
    }
}