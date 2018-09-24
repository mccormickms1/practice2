import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        int star;
        int starLn;

        Scanner scan = new Scanner(System.in);
        

        System.out.println("Initial number of stars:");
        star = scan.nextInt();
        starLn = star;

        while (star >= 1) {
            while (starLn > 1) {
                System.out.print("*");
                starLn--;
            }
            System.out.println("*");
            starLn = star - 1;
            star--;
        }
    }
}