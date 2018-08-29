import java.util.Scanner;

public class discountPrices {

    public static void main (String[]args) {
        int inData;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter purchase price in cents");
        inData = scan.nextInt();
        if(inData >= 1000) {
            inData = (inData + 0.0) * 0.9;
        }
        System.out.println("Discounted Price: " + inData);
    }
}