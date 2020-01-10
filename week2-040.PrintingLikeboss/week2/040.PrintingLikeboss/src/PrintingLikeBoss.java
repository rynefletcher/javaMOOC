public class PrintingLikeBoss {
 
    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 1;
        while(counter <= amount){
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }
 
    public static void printWhitespaces(int amount) {
        // 40.1
        int counter = 1;
        while(counter <= amount){
            System.out.print(" ");
            counter++;
        }
    }
 
    public static void printTriangle(int size) {
        // 40.2
        int counter = 1;
        while(counter <= size){
            printWhitespaces(size - counter);
            printStars(counter);
            counter++;
        }
    }
 
    public static void xmasTree(int height) {
        // 40.3
        int spaces = height - 1;
        int stars = 1;
        
        while(spaces >= 0){
            printWhitespaces(spaces);
            printStars(stars);
            
            spaces--;
            stars+=2;
        }
        
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
        
    }
 
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
 
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
