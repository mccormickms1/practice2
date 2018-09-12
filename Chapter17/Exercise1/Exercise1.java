import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {

        double hours;
        double zones;
        double depart;
        double arrive;
        double daysOfRecovery;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hours of travel:");
        hours = scan.nextDouble();

        System.out.println("Time zones crossed:");
        zones = scan.nextDouble();

        System.out.println("Departure time(military):");
        depart = scan.nextDouble();

        System.out.println("Arrival time(military):");
        arrive = scan.nextDouble();

        if (depart > 8 && depart <= 12) {
            depart = 0;
        } else if (depart <= 18 && depart > 12) {
            depart = 1;
        } else if (depart <= 22 && depart > 18) {
            depart = 3;
        } else if (depart <= 1 || depart > 22) {
            depart = 4;
        } else {
            depart = 5;
        }

        if (arrive > 8 && arrive <= 12) {
            arrive = 4;
        } else if (arrive <= 18 && depart > 12) {
            arrive = 2;
        } else if (arrive <= 22 && depart > 18) {
            arrive = 0;
        } else if (arrive <= 1 || depart > 22) {
            arrive = 1;
        } else {
            arrive = 3;
        }

        daysOfRecovery = (hours/2 + (zones-3) + depart + arrive)/10;
        System.out.println("Days of recovery: " + daysOfRecovery);

    }
}