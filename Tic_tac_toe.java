import java.util.Scanner;

public class Tic_tac_toe {

    static char player = 'X';

    static char[][] TicTacToe = {
        {'1','2','3'},
        {'4','5','6'},
        {'7','8','9'}
    };

    static void gameBoard(){
        for(int row = 0; row < 3 ; row++){
            for(int col = 0 ; col < 3; col++){

                System.out.print(" " + TicTacToe[row][col]);

                if(col < 2){
                    System.out.print(" | "); // separation between numbers
                }
            }

            System.out.println(); // moves to next line

            if(row < 2){
                System.out.println("---|---|---"); // separation between rows
            }
        }
    }

    // check rows
    static boolean decideWinner(){

        for(int row = 0; row < 3; row++){
            if(TicTacToe[row][0] == TicTacToe[row][1] &&
               TicTacToe[row][1] == TicTacToe[row][2])
                return true;
        }

        // checks columns
        for(int col = 0; col < 3; col++){
            if(TicTacToe[0][col] == TicTacToe[1][col] &&
               TicTacToe[1][col] == TicTacToe[2][col])
                return true;
        }

        // check diagonal 1
        if(TicTacToe[0][0] == TicTacToe[1][1] &&
           TicTacToe[1][1] == TicTacToe[2][2])
            return true;

        // checks diagonal 2
        if(TicTacToe[0][2] == TicTacToe[1][1] &&
           TicTacToe[1][1] == TicTacToe[2][0])
            return true;

        return false;
    }

    static boolean decideDraw (){

        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){

                if(TicTacToe[row][col] != 'X' &&
                   TicTacToe[row][col] != 'O') // the game is not over yet
                    return false; // cannot be draw then
            }
        }

        return true; // draw
    }

    static void resetBoard(){
        char value = '1';
        for(int row = 0 ; row < 3; row++){
            for(int col = 0; col < 3; col++){
                TicTacToe[row][col] = value++;
            }
        }
        player = 'X'; // start from player X
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String playAgain;

        do{

            boolean gameEnd = false; // game is running

            while(!gameEnd){ // game runs until gameEnd becomes true, game ends

                gameBoard(); // show gameBoard

                System.out.println("Player " + player + ", enter position: ");
                int choice = sc.nextInt();

                int row =  (choice - 1) / 3; // to find row
                int col = (choice - 1) % 3; // to find the position inside the row

                if(choice >= 1 && choice <= 9 &&
                   TicTacToe[row][col] != 'X' &&
                   TicTacToe[row][col] != 'O') // valid choice and not occupied
                {
                    TicTacToe[row][col] = player; // replace the cell with the current player symbol (X OR O)
                }
                else{
                    System.out.println("Invalid choice or already filled, make another choice");
                    continue;
                }

                if(decideWinner()){
                    gameBoard();
                    System.out.println("Player " + player + " wins!!");
                    gameEnd = true;
                }
                else if(decideDraw()){
                    gameBoard();
                    System.out.println("Game draw!!");
                    gameEnd = true;
                }
                else{
                    if(player == 'X') // runs when no winner no draw
                        player = 'O';
                    else
                        player = 'X';
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            playAgain = sc.next();

            if(playAgain.equalsIgnoreCase("y")){
                resetBoard();
            }

        } while(playAgain.equalsIgnoreCase("y"));

        sc.close();
    }
}