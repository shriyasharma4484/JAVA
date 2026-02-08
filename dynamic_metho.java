class Phone{
    public void name(){
        System.out.println("Shriya");
    }
    public void greet(){
        System.out.println("Good Morning");
    }
}
class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("Swagat hai");
    }
    public void name(){
        System.out.println("Sharma");
    }
}
public class dynamic_metho {
    public static void main(String[]args){
        // Phone obj=new Phone();
        // obj.name();
        Phone obj = new SmartPhone();
    //    SmartPhone obj1 = new Phone();
    // //this wil give errror  
    obj.greet();
    obj.name();

    }

}
    