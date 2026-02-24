class DivideZeroException extends RuntimeException{
    public  DivideZeroException(String m){
        super(m);
    }
}
public class EXCEP2{
    public static void divide(int a, int b){ //we did not use the throws keyword
        if(b==0){
            throw new  DivideZeroException("divide by zero is not allowed");
        }
        System.out.println("result:"+a/b);
    }
    public static void main(String[]args){
        try{
            divide(10,0);
        }
        catch( DivideZeroException e){
            System.out.println("caught exception : "+e.getMessage());

        }
       

    }
}

           
      