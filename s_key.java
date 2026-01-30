class Parent{
    void display(){
        System.out.println("This is parent class method");
    }
}
class Child extends Parent{
    void display(){
        super.display();
        System.out.println("This is student class method");
    }
}
public class s_key{
    public static void main(String[]args){
        Child c=new Child();
        c.display();
             }
        
        
        
}