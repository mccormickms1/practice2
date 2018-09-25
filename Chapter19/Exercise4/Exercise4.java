import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        String word;
        int n;
        n = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word = scan.nextLine();

        while (n < word.length()) {
            System.out.println(word.charAt(n));
            n++;
        }
    }
}