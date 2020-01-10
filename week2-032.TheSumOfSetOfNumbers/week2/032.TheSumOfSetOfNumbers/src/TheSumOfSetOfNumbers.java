import java.util.Scanner;
 
public class TheSumOfSetOfNumbers {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        int userNum = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 1;
        
        while(counter <= userNum){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
