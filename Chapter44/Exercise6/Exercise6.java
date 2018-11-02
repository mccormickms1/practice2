import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        boolean validPassword = false;
        Scanner scan = new Scanner(System.in);

        char ch;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        while (!validPassword) {
            System.out.println("Enter your password: ");
            String password = scan.nextLine();
            
            for(int c = 0; c < password.length(); c++) {
                ch = password.charAt(c);

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            if (hasDigit && hasUpperCase && hasLowerCase && password.length() >= 7) {
                System.out.println("Acceptable password.");
                validPassword = true;
            } else {
                System.out.println("That password is not acceptable.");
            }
        }
    }
}