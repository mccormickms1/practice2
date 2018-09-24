import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        boolean ok = true; 

        System.out.println("Input right front pressure");
        int firstTire = scan.nextInt();

        if (firstTire > 45 || firstTire < 35) {
            ok = false;
        }

        System.out.println("Input left front pressure");
        int secondTire = scan.nextInt();

        if (secondTire > 45 || secondTire < 35) {
            ok = false;
        }

        if (firstTire != secondTire) {
            ok = false;
        }

        System.out.println("Input right rear pressure");
        firstTire = scan.nextInt();

        if (firstTire > 45 || firstTire < 35) {
            ok = false;
        }

        System.out.println("Input left rear pressure");
        secondTire = scan.nextInt();

        if (secondTire > 45 || secondTire < 35) {
            ok = false;
        }

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