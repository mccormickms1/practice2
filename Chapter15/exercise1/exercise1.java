import java.util.Scanner;

public class exercise1{
    
    public static void main(String[] args) {
        int startValue;
        int endValue;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start value");
        startValue = scan.nextInt();

        System.out.println("Enter end value");
        endValue = scan.nextInt();

        System.out.println(" ");

        System.out.println(startValue);

        if (startValue < endValue) {
            while (startValue < endValue){
                startValue = startValue + 1;
                System.out.println(startValue);
            }
        } else if (startValue > endValue) {
            while (startValue > endValue) {
                startValue = startValue - 1;
                System.out.println(startValue);
            }
        }


    }
}