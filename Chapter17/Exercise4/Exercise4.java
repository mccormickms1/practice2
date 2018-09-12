import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        int star;

        Scanner scan = new Scanner(System.in);

        System.out.println("Initial number of stars:");
        star = scan.nextInt();

        while (star >= 1) {
            System.out.println("*");
            star--;
            while (star > 1) {
                System.out.print("*");
            }
        }
    }
}