import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        boolean terminate = false;

        int integer;
        int sum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer (Enter 0 to quit):");
        integer = scan.nextInt();
        
        sum = integer;

        if (integer == 0) {
            terminate = true;
            System.out.println("No integers were entered.");
        } else {

        while (!terminate) {
            System.out.println("Enter an integer (or 0 to quit): ");
            integer = scan.nextInt();

            if (integer == 0) {
                terminate = true;
            } else {
                sum = sum + integer;
            }
        }

        System.out.println("Sum of the integers: " + sum);

        }

        System.out.println("bye");
    }
}