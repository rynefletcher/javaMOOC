import java.util.Scanner;
 
public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        // call your method from here
        int nameLength = 0;
        nameLength = calculateCharacters(name);
        System.out.println("Number of characters: " + nameLength);
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        return text.length();
    }
    
}
