import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        long n;
        long nFactorial;
        long r;
        long nMinusR;
        long nMinusRFactorial;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N:");
        n = scan.nextLong();
        nFactorial = n;

        System.out.println("Enter R:");
        r = scan.nextLong();
        nMinusR = n - r;
        nMinusRFactorial = nMinusR;

        while (n > 1) {
            nFactorial = nFactorial * (n - 1);
            n--;
        }

        while (nMinusR > 1) {
            nMinusRFactorial = nMinusRFactorial * (nMinusR - 1);
            nMinusR--;
        }

        System.out.println(nFactorial/nMinusRFactorial + " permutations");

    }
}