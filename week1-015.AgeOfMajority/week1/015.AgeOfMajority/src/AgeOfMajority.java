import java.util.Scanner;
 
public class AgeOfMajority {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.println("How old are you? ");
        int userAge = Integer.parseInt(reader.nextLine());
        
        if(userAge >= 18){
            System.out.println("You have reache the age of majority!");
        }
        else{
            System.out.println("You have not reached the age of majority yet!");
        }
    }
}
