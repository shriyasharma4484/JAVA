class A{
    public int a;
    public int harry()
{
    return 4;
}
public void meth2(){
    System.out.println("I am method 2 of class A");
}
}
class B extends A{
    public void meth3(){
        System.out.println("I am method 3");
    }
    
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B(); 
        b.meth2(); //it calls the method of class B because of method overriding
    }
}


