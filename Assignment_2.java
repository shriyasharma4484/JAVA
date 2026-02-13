class Person{
    String name;
    int age;
    Person(){
        name="";
        age=0;
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayP(){
        System.out.println("name is:"+name);
        System.out.println("age is:"+age);
    }    
}
class Student extends Person{
    int studentId;
    Student(){
        super();
        studentId=0;
    }
    Student(String name,int age,int studentId){
        super(name,age);
        this.studentId=studentId;
    }
    void displayS(){
          displayP();
        System.out.println("student id is:"+ studentId);

    
    }
}
class graduateStudent extends Student{
    String researchTopic;
    graduateStudent(){
        super();
        researchTopic="";
    }
    graduateStudent(String name, int age,int studentId,String researchTopic){
        super(name,age,studentId);
        this.researchTopic=researchTopic;
    }
    void displayR(){
       displayS();

        System.out.println("research topic  is:"+ researchTopic);

}   
}
public class Assignment_2{
    public static void main(String[]args){
        graduateStudent g=new graduateStudent("Shriya",24,258,"Automatic attendance system");
        g.displayR();
        
} 
}
