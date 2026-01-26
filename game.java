import java.util.Scanner;
import java.util.Random;
public class game{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number=rand.nextInt(100)+1; //plis 1 increases the range from 1 to 100 rather than 0 to 99
        int attempts=0;
        int  guess; //to store users guessed number 

        System.out.println("guess a numbe between 1 to 100:");
        while(true){
            System.out.println("your guess: ");
            guess=sc.nextInt();
            attempts++;
            if(guess==number){
                System.out.println("correct!! you guessed it in" +attempts+"attempts.");
                break;
            }
            else if(guess>number){
                System.out.println("too high!");
            }else{
                System.out.println("too low!");
            }
        }
    }
}