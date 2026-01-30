class Student{
    String name;
    int age;
    Student(){
        name="";
        age=0;
    }
    Student(String s,int a){
        name=s;
        age=a;
    }
    void display(){
        System.out.println("name is:"+name + "age is:"+age) ;   
    }

}
public class tue{
    public static void main(String[]args){
        Student stu1=new Student();
        stu1.Student("Shriya",19);
        stu1.display();
    }
}

