class cylinder{
    private int radius;
    private int  height;
    cylinder(int r, int h){
        radius=r;
        height=h;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public void display(){
        System.out.println("the volume of the cylinder is:"+volume());
    }
}
public class constructor{
    public static void main(String[]args){
        cylinder c=new cylinder(7,9);
        c.display();
    }
}
   