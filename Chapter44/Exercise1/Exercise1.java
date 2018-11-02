import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        String[] fin = name.split(" ");
        fin[1] = fin[1].toUpperCase();
        System.out.println(fin[0] + " " + fin[1]);

    }

    public String split(String name) {
        name.trim();
        int n = name.indexOf(' ');
        return name.substring(0, n) + name.substring(n, name.length());
    }
}