class family{
    family(){
        System.out.println("family class constructor");
    }
    void display(){
        System.out.println("This is family class method");
    }
}
class small extends family{
    small(){
        super();
        super.display();
        System.out.println("small class constructor");
    }
}
public class key3{
    public static void main(String[]args){
        new small();
             }
        
        
        
}