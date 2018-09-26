import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args) {
        double n;
        double sum = 0;
      
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the limit");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            if(i%2 == 1){
                sum = sum + i;
            }
           
        } System.out.println(sum);

        System.out.println(Math.pow(n,2));
    }
}