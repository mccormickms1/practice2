import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        double numberOfSheep;
        numberOfSheep = 20;
        double power;
        power = 0.83;

        for (int i = 0; i <= 25; i++) {
            power = power * 0.83;
            numberOfSheep = 220/((1 + 10) * power);
            System.out.println(i + "   " + numberOfSheep);
        }
    }
}