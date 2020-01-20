import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userWord = reader.nextLine();
        System.out.println("Length of the first part: ");
        int userLength = Integer.parseInt(reader.nextLine());
        
        System.out.print("Result: ");
        int counter = 0;
        while(counter < userLength){
            System.out.print(userWord.charAt(counter));
            counter++;
        }
    }
}
