import java.util.Scanner;

public class Exercise6 {
    
    public static void main(String[] args) {
        String name;
        String password;
        int priority;
        boolean active = true;

        Scanner scan = new Scanner(System.in);

        while (active) {
            priority = 0;
            
            System.out.print("User Name: ");
            name = scan.nextLine();
        
            System.out.print("Password : ");
            password = scan.nextLine();

            if (name.equals("bill") && password.equals ("money")) {
                priority = 1;
            } else if (name.equals("hugh") && password.equals ("mungus")) {
                priority = 2;
            } else if (name.equals("steve") && password.equals ("apple")) {
                priority = 3;
            } else if (name.equals("donald") && password.equals ("hair")) {
                priority = 4;
            } else if (name.equals("legolas") && password.equals ("elf")) {
                priority = 5;
            } else if (name.equals("quit") && password.equals ("exit")) {
                priority = -1;
            } 

            if (priority == 0) {
                System.out.println("Logon failed");
            } else if (priority > 0) {
                System.out.println("You have logged on with priority " + priority);
            } else {
                active = false;
            }
        }

        System.out.println("System shutting down.");
        System.out.println("Bye.");
    }
}