import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {

        double x;
        double xInitial;
        double n;
        double nInitial;

        Scanner scan = new Scanner(System.in);

        System.out.println("X:");
        x = scan.nextDouble();
        xInitial = x;

        System.out.println("n:");
        n = scan.nextDouble();
        nInitial = n;

        while (n > 1) {
            x = x*xInitial;
            System.out.println(x);
            n--;
        }

        if (n < 0 ) {
            System.out.println("N must be greater than 0");
        } else {
            System.out.println(xInitial + " to the power of " + nInitial + " is " + x);
        }

        

    }
}