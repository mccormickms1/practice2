import java.util.Scanner;

public class pie {
    
    public static void main(String[] args) {
        int contestantWeight;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Weight of contestant:");
        contestantWeight = scan.nextInt();

        if(contestantWeight >=220 && contestantWeight <= 280) {
            System.out.println("Qualifies for contest.");
        } else {
            System.out.println("Does not qualify for contest.");
        }
    }
}