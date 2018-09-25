import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        int lowRange;
        int highRange;
        int data;
        int rangeSum;
        rangeSum = 0;
        int outRangeSum;
        outRangeSum = 0;
        boolean active = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("In-range Adder");

        System.out.println("Low end of range:");
        lowRange = scan.nextInt();

        System.out.println("High end of range:");
        highRange = scan.nextInt();

        while (active) {
            System.out.println("Enter data:");
            data = scan.nextInt();

            if (data != 0) {
                if (data >= lowRange && data <= highRange) {
                    rangeSum = rangeSum + data;
                } else {
                    outRangeSum = outRangeSum + data;
                }
            } else {
                active = false;
                System.out.println("Sum of in range values: " + rangeSum);
                System.out.println("Sum of out of range values: " + outRangeSum);
            }
        }
    }
}