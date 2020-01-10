import java.util.Scanner;
 
public class Password {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        System.out.println("Type the password: ");
        String userPass = reader.nextLine();
        
        while(!password.equals(userPass)){
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            userPass = reader.nextLine();
        }
        
        System.out.println("Right!");
        System.out.println("The secret is: jryy qbar!");
    }
}
