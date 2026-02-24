class SeatNotAvailableException extends Exception{
    
    public SeatNotAvailableException (String m){
        super(m);//message
    }
}
class Flight{
    String name;
    int seat;
    Flight(String name,int seat){
        this.name=name;
        this.seat=seat;
    }
    void bookSeat(int seat1) throws SeatNotAvailableException{
       if(seat1>seat){
        throw new SeatNotAvailableException("Not enough seats available");
}
else{
    seat = seat - seat1;
    System.out.println("Booking successful!");
    System.out.println("Remaining seats: " + seat);
}
       }
}
public class Sn9{
    public static void main(String[]args){
       Flight m = new Flight("Shriya",90);
       try{
         m.bookSeat(100);

       }
      catch(SeatNotAvailableException e){
        System.out.println("catch exception: "+e.getMessage());
      }
    }
}

