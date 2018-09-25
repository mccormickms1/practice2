import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args) {
        int initialMiles;
        int finalMiles;
        int gallons;
        double milesPerGallon;
        boolean active = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Miles Per Gallon Program");

        while (active) {
            System.out.println("Initial miles:");
            initialMiles = scan.nextInt();

            if (initialMiles >= 0) {
            
                System.out.println("Final miles:");
                finalMiles = scan.nextInt();
            
                System.out.println("Gallons:");
                gallons = scan.nextInt();

                milesPerGallon = (finalMiles - initialMiles)/gallons;

                System.out.println("Miles per Gallon: " + milesPerGallon);
                System.out.println("");
            
            } else {
                active = false;
                System.out.println("bye");
            }
        }
    }
}