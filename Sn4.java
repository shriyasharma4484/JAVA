import java.util.Scanner;
import java.util.ArrayList;
class Employee{
    String employeeId;
    String name;
    String role;
    double baseSalary;

    Employee(String employeeId, String name, String role, double baseSalary){
    this.employeeId = employeeId;
    this.name = name;
    this.role = role;
    this.baseSalary = baseSalary;
}

   public double calculateSalary(){
        switch(role){
            case "Manager":
                return baseSalary + (0.2 * baseSalary);
                //  break : return ends the program , no  need of break
        
            case "Developer":
                return baseSalary + (0.1 * baseSalary);
              
            
            case "Designer":
                 return baseSalary + (0.05 * baseSalary);
                
            
            case "Intern":
                return 1000;
               

            default:
                System.out.println("invalid role!");
                return 0;
    }
}
public double applyDeduction(double amount){
    double salary = calculateSalary();
    double remaining = salary - amount;
    System.out.println("the remaning amount is :"+remaining);
    return remaining;
    
}
public void displayEDetails(){
    System.out.println("name is :"+name);
    System.out.println("id  is :"+employeeId);
    System.out.println("role is :"+role);
    System.out.println("baseSalary is :"+baseSalary);
    System.out.println("total Salary is :"+calculateSalary());
    
}
}
class Payroll{
    ArrayList<Employee> list = new ArrayList<>();
    void addEmployee(Employee e){
        list.add(e);
        System.out.println("Employee added successfully!!");
    }


    public void calculateAllSalaries(){
        for(int i =0; i < list.size() ; i++){
            Employee e = list.get(i); //stores each employee one by one
            double salary = e.calculateSalary(); //can access the mehtod using the object of the class
            System.out.println("Salary is :" +  salary);
        }
    }
    public Employee findEmployee(String employeeId){
        for ( int i= 0; i < list.size();i++){
             Employee e = list.get(i);
             if(e.employeeId.equalsIgnoreCase(employeeId)){
                System.out.println("Employee found!");
                return e; //must return employee object
             }

            }
             System.out.println("Employee not found!!");
             return null;

             }
        public void displayAllEmployee(){
            for(int i = 0 ;i<list.size();i++){
                Employee e =list.get(i);
                e.displayEDetails();
            }
        }
             
            }

      public class Sn4{
    public static void main(String[]args){

       Scanner sc =  new Scanner(System.in);
       System.out.println("how many employees do u want to add ?");
       int n = sc.nextInt();
       sc.nextLine(); //clear buffer

        Payroll p = new Payroll();

      for(int i = 0 ;i<n;i++){
        System.out.println("Enter details of employeee "+ (i+1));

       
       System.out.println("Enter the id: ");
        String id  = sc.nextLine();
         System.out.println("Enter the name: ");
       String name = sc.nextLine();

        System.out.println("Enter the role: ");
        String role = sc.nextLine();

        System.out.println("Enter the base salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();  // clear buffer

        Employee e = new Employee(id, name, role, salary);
        p.addEmployee(e);
      }
      p.calculateAllSalaries();
      p.displayAllEmployee();


      System.out.println("Enter the id to search: ");
      String searchId = sc.nextLine();
    Employee found = p.findEmployee(searchId); //as the method returns a value , we must store it
    if(found != null){
    found.displayEDetails();
 }
}
      }

 


      