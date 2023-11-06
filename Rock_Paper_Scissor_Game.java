package Projects;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for the user
        System.out.println("Your are playing Rock Paper Scissor Game");
        System.out.print("The rules are easy.\n You have to pick the number between 1 to 3.\n 1 is for rock.\n 2 is for paper.\n 3 is for scissor.  \n Enter the number: ");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("You picked rock");
        }else if(num == 2){
            System.out.println("You picked paper");
        }else if(num == 3){
            System.out.println("You picked scissor");
        }

        //computer input
        Random r = new Random();
        int a = r.nextInt(1,4);
    //    System.out.print(a);

        if(a == 1){
            System.out.println("Computer picked rock");
        }else if(a == 2){
            System.out.println("Computer picked paper");
        }else if(a == 3){
            System.out.println("Computer picked scissor");
        }

        //Comparison

        if(num ==1 && a ==1){
            System.out.println("It's a tie!!");
        }else if(num ==1 && a==2){
            System.out.println("Computer wins!!");
        }else if(num ==1 && a==3) {
            System.out.println("You wins!!");
        }else if(num ==2 && a==1){
            System.out.println("You wins!!");
        }else if(num ==2 && a==2) {
            System.out.println("It' a tie!!");
        }else if(num ==2 && a==3){
            System.out.println("Computer wins!!");
        }else if(num ==3 && a==1){
            System.out.println("Computer wins!!");
        }else if(num ==3 && a==2) {
            System.out.println("You wins!!");
        }else if(num ==3 && a==3){
            System.out.println("Its a tie!!");
        } else {
            System.out.println("Sorry, Your choice was Wrong!");
        }
    }
}
