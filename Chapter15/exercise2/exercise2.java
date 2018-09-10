import java.util.Scanner;

public class exercise2{
    
    public static void main(String[] args) {
        String word;
        int repeatWord;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Whats the word?");
        word = scan.nextLine();
        repeatWord = word.length();

        while (repeatWord > 1) {
            System.out.println(word);
            repeatWord = repeatWord - 1;
        }

        
    }
}