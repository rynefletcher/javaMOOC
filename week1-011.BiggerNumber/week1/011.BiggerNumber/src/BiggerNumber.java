import java.util.Scanner;
import java.lang.Math;
 
public class BiggerNumber {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secNum = Integer.parseInt(reader.nextLine());
        
        int bigNum = Math.max(firstNum, secNum);
        
        System.out.println("The bigger number of the two numbers given was: " + bigNum);
    }
}
