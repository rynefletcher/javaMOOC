import java.util.Scanner;
 
 
public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int userNum1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int userNum2 = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = userNum1;
        
        while(counter <= userNum2){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
