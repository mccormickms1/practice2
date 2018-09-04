import java.util.Scanner;

public class lastChanceGas{
    
    public static void main(String[] args) {
        int tankCapacity;
        int gageReading;
        int milesPerGallon;
        double milesLeft;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tank Capaciy in Gallons");
        tankCapacity = scan.nextInt();

        System.out.println("Gage Reading, 1-100");
        gageReading = scan.nextInt();

        System.out.println("Miles per gallon");
        milesPerGallon = scan.nextInt();

        milesLeft = tankCapacity*(gageReading/100.0)*milesPerGallon;

        if(milesLeft <= 200.0) {
            System.out.println("Get gas!");
        } else {
            System.out.println("Good to go!");
        }

    }
}