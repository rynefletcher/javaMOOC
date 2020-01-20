import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int counter = 0;
        
        if (name.length() >= 3){
            while (counter <= 2){
                System.out.println((counter + 1) + ". character: " + name.charAt(counter));
                counter++;
            }
        }
    }
}
