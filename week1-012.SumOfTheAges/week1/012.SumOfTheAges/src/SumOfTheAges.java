import java.util.Scanner;
 
public class SumOfTheAges {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String secName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int secAge = Integer.parseInt(reader.nextLine());
        
        System.out.println(name + " and " + secName + " are " + (age + secAge) + " years old in total.");
    }
}
