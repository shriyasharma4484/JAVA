import java.util.ArrayList;
class Student{
    String name;
     ArrayList<Double>grades; //because grades need to be updated
   
    
   
    Student(String name){

    
        this.name=name;
        this.grades= new ArrayList<>(); //intilise the list
    }

    public void addGrade(double grade){
        grades.add(grade);
    }
    public  double calculateGrade(){
        if (grades.isEmpty()) {
            return 0;   // If no grades, average is 0
        }
        double sum =0;
        
        for(int i=0;i < grades.size() ; i++){
            sum += grades.get(i);
        }
        return sum/grades.size();
    }

    public void displayStudentDetails(){
        System.out.println("name is : "+name);
        System.out.println("Grades are:");
        for( int i =0 ; i < grades.size(); i++){
            System.out.println(grades.get(i));
        }
        System.out.println("average is :"+calculateGrade());
    }
}
public class Sn2{
    public static void main(String[]args){
        Student s1 = new Student("Shriya");
        s1.addGrade(90);
        s1.addGrade(80);
        s1.addGrade(78);
        s1.calculateGrade();
        s1.displayStudentDetails();

    }
}



    
