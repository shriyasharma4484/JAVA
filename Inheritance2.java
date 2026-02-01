class Base{
    int x;
    Base(){
        System.out.println("base constructor");
    }
    public int getX(){
        return x;
    }
   public void setX(int x){
    this.x=x;
}
}
class Derived extends Base{
    int y;
    Derived(){
        System.out.println("derived constructor");
    }
    public int getY(){
        return y;
    } 
    public void setY(int y){ 
        this.y=y;
    }
}
public class Inheritance2 {
    
    public static void main(String[]arg){
        // Derived s=new Derived();
        // Base b=new Base(); //even if we create base class object derived class constructor will not be called
        //even wihtout creating the obj of base classa, it's constructor is always called when we create the derived class object
       
        
    }



}



   
