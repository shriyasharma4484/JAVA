interface Animal{
    
    void sound();
}
interface Pet{
    int age=10;
    // age=20;//cannot assing value to  final variable
    void displayAge();
}
class Dog implements Animal,Pet{
    public void sound(){ //error wihtout using public
        System.out.println("woof");
    }
    public void displayAge(){
        System.out.println("Dog age: " + age);
    }
}
public class Interface_use {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.displayAge();
    }
}
        