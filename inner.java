class Outer{
    class Inner{
        void display(){
            System.out.println("this is inner class");
    }
}
public static void main(String[] args){
    Outer.Inner obj=new Outer().new Inner();
    obj.display();
}
}