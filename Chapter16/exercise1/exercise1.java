import java.util.Scanner;

public class exercise1{
    public static void main(String[] args){
        int addedNumbers;
        int number;
        int answer;

        answer = 0;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("How manys numbers you gots");
        addedNumbers = scan.nextInt();

        while (addedNumbers > 0) {
            System.out.println("Enter a number");
            number = scan.nextInt();
            answer = answer + number;
            addedNumbers--;
        }

        System.out.println("The sum is " + answer);
    }
}