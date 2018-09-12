import java.util.Scanner;
import java.lang.Math;

public class exercise3 {
    
    public static void main(String[] args) {
        
        int n;
        int nInitial;
        double value;
        double sumInt;
        sumInt = 0;
        double sumSquare;
        sumSquare = 0;
        double avgSum;
        double avgSquare;
        double standardDeviation;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbas you got idiot");
        n = scan.nextInt();
        nInitial = n;

        while (n >= 1) {
            System.out.println("Integer: ");
            value = scan.nextInt();

            sumInt = sumInt + value;
            value = value * value;
            sumSquare = sumSquare + value;

            n--;
        }

        avgSum = sumInt/(nInitial);
        avgSum = avgSum * avgSum;
        avgSquare = sumSquare/(nInitial);

        standardDeviation = Math.sqrt(avgSquare - avgSum);

        System.out.println("Standard deviation of " + standardDeviation);





    }
}