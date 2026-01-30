class P{
    final void display(){
        System.out.println("This is final method in parent class");
    }
}
class C extends P{
    // void display(){
    //     System.out.println("This is child class method"); //final method cannot be overriden
    // }
}
public class f_v{
    public static void main(String[]args){
        C c=new C();
        c.display();
             }
        
        
        
}