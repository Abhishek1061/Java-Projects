package Projects;
import java.util.Scanner;
import java.util.Random;

// Create a class Game, which allows a user to play "Guess the Number" game once.
// Game should have the following methods:
// Constructor to generate the random number-+-
// takeUserInput() to take a user input of number
// isCorrectNumber() to detect whether the number entered by the user is true
// getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!


public class Guess_the_Number_OOPS_Edition {

//     private int randomNumber;
//     private int userNumber;
//     private int noOfGuesses;

//     public int Game(){
//         Random r = new Random();
//         randomNumber = r.nextInt(1,100);
//         noOfGuesses = 0; 
//     }

//     public void takeUserInput(){
//         Scanner sc = new Scanner(System.in); 
//         System.out.println("Guess the Number: ");
//         userNumber= sc.nextInt();
//         noOfGuesses++;

//     } 
    
//     public boolean isCorrectNumber(){
//         return userNumber == randomNumber;
//     }
//     public int getNoOfGuesses(){
//         return noOfGuesses;
//     }
//     public void setNoOfGuesses(int noOfGuesses){
//         this.noOfGuesses = noOfGuesses;
//     }
//     public static void main(String[] args) {
//         System.out.println("\n \t ''''' Welcome to the game '''''\n  \n \t     '' GUESS THE NUMBER ''\n" );
        
//         Guess_the_Number_OOPS_Edition game = new Guess_the_Number_OOPS_Edition();
//         while(true){
//             game.takeUserInput();
//             if(game.isCorrectNumber()){
//                 System.out.println("Congratulations! You guessed the Correct Number in " + game.getNoOfGuesses() + " guesses.");
//                 break;
//             }else{
//                 System.out.println("Try again. Guesses made: " + game.getNoOfGuesses());
//             }
//         } 
//     }
// }  




    private int randomNumber;
    private int userNumber;
    private int previousDifference;
    private int currentDifference;
    private int noOfGuesses;

    public void Game() {
        randomNumber = (int) (Math.random() * 100) + 1;
        noOfGuesses = 0;
        previousDifference = 0;
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the number: ");
        userNumber = scanner.nextInt();
        noOfGuesses++;
    }

    public boolean isCorrectNumber() {
        return userNumber == randomNumber;
    }

    public void provideFeedback() {
        if (isCorrectNumber()) {
            System.out.println("Congratulations! You guessed the correct number in " + noOfGuesses + " guesses.");
        } else {
            currentDifference = Math.abs(randomNumber - userNumber);

            if (currentDifference < previousDifference) {
                System.out.println("Getting warmer. Try again. Guesses made: " + noOfGuesses);
            } else {
                System.out.println("Getting colder. Try again. Guesses made: " + noOfGuesses);
            }

            previousDifference = currentDifference;
        }
    }

    public static void main(String[] args) {
        Guess_the_Number_OOPS_Edition game = new Guess_the_Number_OOPS_Edition();

        while (true) {
            game.takeUserInput();
            game.provideFeedback();

            if (game.isCorrectNumber()) {
                break;
            }
        }
    }
}
