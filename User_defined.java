class InvlaidAgeException extends Exception{
    public InvlaidAgeException(String m){
        super(m);//message
    }
}
public class User_defined{
    public static void validate(int age) throws InvlaidAgeException{
        if(age<18){
            throw new InvlaidAgeException("age must be greater than 18");
        }
        System.out.println("valid age:"+age);
    }
    public static void main(String[]args){
        try{
            validate(12);

        }
        catch(InvlaidAgeException e){
            System.out.println("catch exception : "+e.getMessage());
        }
    }        
    
}