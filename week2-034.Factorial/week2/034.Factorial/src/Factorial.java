import java.util.Scanner;
 
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int userNum = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int counter = 1;
        
        if(userNum == 0){
            System.out.println("Factorial is " + userNum);
        }
        else{
            while(counter <= userNum){
                factorial *= counter;
                counter++;
            }
            System.out.println("Factorial is " + factorial);
        }
    }
}
