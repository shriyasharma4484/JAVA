import java.util.Scanner;
import java.util.Random;
public class Rock_paper{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] options = {"rock","paper","scissors"};
        String playAgain;
do{


       String playerChoice;
       String computerChoice;
       while(true){
          System.out.println("Enter your choice (rock/paper/scissors): ");
                playerChoice = sc.nextLine().toLowerCase();
       
        if (playerChoice.equals("rock") ||
                    playerChoice.equals("paper") ||
                    playerChoice.equals("scissors")) {
                    break;  // valid input → exit loop
                } else {
                    System.out.println("Invalid input! Please enter again.");
                }
            }
            int computerIndex = rand.nextInt(3);
            computerChoice = options[computerIndex];
             System.out.println("Computer chose: " + computerChoice);


      
       if(!playerChoice.equals("rock") &&
      !playerChoice.equals("paper") &&
      !playerChoice.equals("scissors")){

     System.out.println("Invalid input, enter again");

}
    
       else if(computerChoice.equals(playerChoice)){
        System.out.println("its a draw!!");
       }
       else if(computerChoice.equals("rock") && playerChoice.equals("scissors")){
        System.out.println("computer wins");
       }
        else if(computerChoice.equals("scissors") && playerChoice.equals("paper")){
        System.out.println("computer wins");
       }
       
        else if(computerChoice.equals("paper") && playerChoice.equals("rock")){
        System.out.println("computer wins");
       }
       else {
        System.out.println("player wins!!");
       }
       System.out.println("play again??");
       playAgain = sc.nextLine();

    }while(playAgain.equalsIgnoreCase("y"));

sc.close();
    }
}