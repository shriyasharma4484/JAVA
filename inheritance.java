// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
//     void sleep(){
//         System.out.println("sleeping...");
//     }
//     void run(){
//         System.out.println("running...");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.out.println("barking...");
//     }

// }
// public class inheritance{
//     public static void main(String[]args){
//         Dog d=new Dog();
//         d.eat();
//         d.bark();
//         d.sleep();
//         d.run();
//     }
// }

class Parent{
    void display(){
        System.out.println("this is parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("this is child class");
    }
}
public class inheritance{
    public static void main(String[]args){
        Child c=new Child();
        c.display();
        c.show();

    }
}