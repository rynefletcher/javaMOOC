import java.util.Scanner;
 
public class SumOfThePowers {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int userNum = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int exponential = 0;
        
        while(exponential <= userNum){
            int result = (int)Math.pow(2, exponential);
            sum += result;
            exponential++;
        }
        
        System.out.println("The result is " + sum);
    }
}
