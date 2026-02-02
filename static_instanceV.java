class  student{
    static String college_name="sit";
    int roll_no;
    String name;
    student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
    public void student(){
        System.out.println("college name is: "+college_name);
        System.out.println("roll no is: "+roll_no);
        System.out.println("name is: "+name);
    }
    public void college(){
        System.out.println("college name is: "+college_name);
    }
}
public class static_instanceV {
    public static void main(String[]args){

    
    student s=new student(258,"Shriya");
    s.student();
    s.college();
}
}
