import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        boolean ok = true; 

        System.out.println("Input right front pressure");
        int firstTire = scan.nextInt();

        System.out.println("Input left front pressure");
        int secondTire = scan.nextInt();

        if (firstTire != secondTire) {
            ok = false;
        }

        System.out.println("Input right rear pressure");
        firstTire = scan.nextInt();

        System.out.println("Input left rear pressure");
        secondTire = scan.nextInt();

        if (firstTire != secondTire) {
            ok = false;
        }

        if (ok) {
            System.out.println("Inflation is OK");
        } else {
            System.out.println("Inflation is not OK");
        }
    }
}