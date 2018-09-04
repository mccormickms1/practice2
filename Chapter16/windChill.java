import java.util.Scanner;
import java.lang.Math;

public class windChill{
    
    public static void main(String[] args) {
        int windSpeed;
        int temperature;
        double windChill;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Wind Speed:");
        windSpeed = scan.nextInt();
        
        System.out.println("Temperature:");
        temperature = scan.nextInt();

        if(windSpeed < 3 || temperature > 50) {
            System.out.println("Go bother another computer");
        } else {
            windChill = 35.74 + (0.6215*temperature) - (35.75*Math.pow(windSpeed, 0.16)) + (0.4275*temperature*Math.pow(windSpeed, 0.16));
            System.out.println(" WInd Chill: " + windChill);
        }
    }
}