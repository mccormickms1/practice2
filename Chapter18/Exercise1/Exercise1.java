import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        boolean charge = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter checking account balance:");
        int checkingAccount = scan.nextInt();   

        
        System.out.println("Enter checking account balance:");
        int savingsAccount = scan.nextInt();
        
        if (checkingAccount > 1000 || savingsAccount > 1500) {
            charge = false;
        }

        if (charge == false) {
            System.out.println("No service charge");
        } else {
            System.out.println("$0.15 per check");
        }
    }
}