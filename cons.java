class Demo{
    Demo(){
        this("default constructor"); //this means call the other constructor in the same class with message=default constrctor
    }
    Demo(String message){
        System.out.println(message);
    }
}
public class cons{
    public static void main(String[]args){
        new Demo();
        
    }
}
