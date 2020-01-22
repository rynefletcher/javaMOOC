import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            String userInput = "";
            System.out.println("Type a word: ");
            userInput = reader.nextLine();
            
            if(userInput.equals("")){
                break;
            }
            else{
                words.add(userInput);
            }
        }
        
        Collections.sort(words);
        
        for(String word : words){
            System.out.println(word);
        }
    }
}
