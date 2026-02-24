class ThrowExample{
    static void fun(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside the fun()");
            throw e;// rethrow the exception
        
        }
    }
    public static void main(String[]args) throws Exception{ //we can tell the complier to handle the exception, it will se and stop the execution where we have exception
        try{

            fun();
        }
        catch(NullPointerException e){
            System.out.println("caught in main");

        }
    }
}