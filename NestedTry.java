public class NestedTry {
    public static void main(String[]args){
        try{
            System.out.println("Outer try block started!!");

            try{
                System.out.println("Inner try block started:");
                int result = 10 / 1;
            }
            catch(ArithmeticException e){
                System.out.println("caught arithmeticexception in inner try block:"+e.getMessage()); //catch of inner try
 

            
            String str =  null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("caught null pointer exception in outer block:"+e.getMessage());
        }
    }
        finally{
            System.out.println("finally block of outer try executed"); //we use this if we want to run some program irrespective of the exception
        }//using finally is not compulsary

        System.out.println("program continues after the try catch!!");
    }
    }


                