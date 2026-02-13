class Staff{
    String name;
    int staffId;
    Staff(){
        name="";
        staffId=0;
    }
    Staff(String name,int staffId){
        this.name=name;
        this.staffId=staffId;
    }
    void displayS(){
        System.out.println("Name is:"+name);
         System.out.println("Staff is is:"+staffId);
    }
}
class TeachingS extends Staff{
    String subject;
    TeachingS(){
        super();
        subject="";
    }
    TeachingS(String name,int staffId,String subject){
        super(name,staffId);
        this.subject=subject;
    }
    void displayT(){
        displayS();
         System.out.println("Subject is:"+subject);
    }   
}
class NonTeachingStaff extends Staff{
    String department;
    NonTeachingStaff(){
        super();
        department="";
    }
    NonTeachingStaff(String name,int staffId,String department){
        super(name,staffId);
        this.department = department;

        }
    
    void displayN(){
        displayS();
         System.out.println("department is:"+department);
    }
}
public class Assignment_3A{
    public static void main(String[]args){
     TeachingS t= new TeachingS ("Kavita",123,"English");
     t.displayT();
     NonTeachingStaff n= new NonTeachingStaff("Maya",234,"Cse");
     n.displayN();


    }
}