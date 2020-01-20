import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userWord = reader.nextLine();
        System.out.println("Length of the end part: ");
        int userLength = Integer.parseInt(reader.nextLine());
        
        System.out.print("Result: ");
        int counter = userWord.length() - userLength;
        while(counter < userWord.length()){
            System.out.print(userWord.charAt(counter));
            counter++;
        }
    }
}
