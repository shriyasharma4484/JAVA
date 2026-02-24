class SeatNotAvailableException extends Exception{
    
    public SeatNotAvailableException (String m){
        super(m);//message
    }
}
class Movie{
    String name;
    int seats;
    Movie(String name,int seats){
        this.name=name;
        this.seats=seats;
    }
    void bookTicket(int seat) throws SeatNotAvailableException{
        if(seat>seats){
            throw new SeatNotAvailableException("seats not avalaible");
        }
        System.out.println("u can book , seats availabele!!");
    }
}
public class Scn6{
    public static void main(String[]args){
       Movie m = new Movie("ddlj",90);
       try{
         m.bookTicket(100);

       }
      catch(SeatNotAvailableException e){
        System.out.println("catch exception "+e.getMessage());
      }
    }
}
