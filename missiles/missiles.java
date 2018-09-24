import java.util.Scanner;

public class missiles{

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many minutes until launch?");
        int seconds = scan.nextInt() * 60;

        while (seconds >= 10) {
            if (seconds % 60 == 0) {
                System.out.println("T-minus " + seconds/60 + " minutes to launch");
            } else if (seconds/60 > 0) {
                System.out.println("T-minus " + seconds/60 + " minutes " + seconds%60 + " seconds to launch");
            } else {
                System.out.println("T-minus " + seconds + " seconds to launch");
            }
            seconds = seconds - 10;
        }
        
        System.out.println("Missile Away!");

    }

}