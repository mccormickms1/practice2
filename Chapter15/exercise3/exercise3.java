import java.util.Scanner;

public class exercise3{
    
    public static void main(String[] args) {
        String word1;
        String word2;
        int spaces;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Yo whats the word?");
        word1 = scan.nextLine();
        
        System.out.println("Yo whats the word again?");
        word2 = scan.nextLine();

        spaces = 30 - word1.length() + word2.length();

        while (spaces > 1) {
            System.out.print(".");
            spaces--;
        }
    }
}