import java.util.Random;
import java.util.Scanner;
 
public class GuessingNumberGame {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
 
        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number:");
        int userNum = Integer.parseInt(reader.nextLine());
        int numOfGuess = 1;
        
        while(userNum != numberDrawn){
            if(userNum > numberDrawn){
                System.out.println("Number is lesser, guesses made: " + numOfGuess);
            }
            else{
                System.out.println("Number is greater, guesses made: " + numOfGuess);
            }
            numOfGuess++;
            System.out.println("Guess a number:");
            userNum = Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("Congratulations, your guess is correct!");
    }
 
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
