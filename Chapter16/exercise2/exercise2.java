import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int n;
        double sum;

        sum = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N");
        n = scan.nextInt();

        while (n > 0) {
            sum = sum + 1.0/n;
            n--;
        }

        System.out.println("Sum is " + sum);
    }

}