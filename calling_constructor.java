class Demo{
    Demo(){
        this("default constructor");
        // this(10); //this will give error
    } 
    Demo(String message){
        
        System.out.println(message);
        this(20);// we have to maintain the sequence of calling the constructor
    }
    Demo(int number){
         
        
        System.out.println(number);
    }
}
public class calling_constructor {
    public static void main(String[] args) {
        Demo obj=new Demo();
        Demo obj2=new Demo("Shriya");
        Demo obj1= new Demo(10);
        
    }
}