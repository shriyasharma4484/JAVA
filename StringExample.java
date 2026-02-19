public class StringExample {
    public static void main(String[]args){
        String str="Java programming";
        System.out.println("length: "+str.length());
        
        System.out.println("Trimmed: "+str.trim());
        
        System.out.println("Uppercase: "+str.toUpperCase());
        
        System.out.println("substring: "+str.substring(2,6));

         System.out.println("substring: "+str.substring(4)); //it counts the space also
        
      
        
        System.out.println("Replace: "+str.replace("Java" ,"My"));


    }
    
}
