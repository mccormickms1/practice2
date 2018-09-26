import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        double probability;
        probability = 1;
        double newPerson;
        int numberOfGuests;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of guests");
        numberOfGuests = scan.nextInt();

        for (int i = 0; i <= numberOfGuests; i++) {
            newPerson = ((365 - i)/365);
            probability = probability * newPerson;
            System.out.println(i + "      " + probability);
        }
    }
}