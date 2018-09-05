import java.util.Scanner;

public class ageInSeconds{
    
    public static void main(String[] args) {
        int years;
        int months;
        int days;
        double percent;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Years:");
        years = scan.nextInt();

        System.out.println("Months:");
        months = scan.nextInt();

        System.out.println("Days:");
        days = scan.nextInt();

        years = years * 365;

        if(months == 0){
            months = 0;
        } else if(months == 1){
            months = 31;
        } else if(months == 2){
            months = 59;
        } else if(months == 3){
            months = 90;
        } else if(months == 4){
            months = 120;
        } else if(months == 5){
            months = 151;
        } else if(months == 6){
            months = 181;
        } else if(months == 7){
            months = 212;
        } else if(months == 8){
            months = 243;
        } else if(months == 9){
            months = 273;
        } else if(months == 10){
            months = 304;
        } else if(months == 11){
            months = 334;
        }

        days = years + months + days;
        days = days*24*60*60;
        percent = (days/2500000000.0)*100;
        System.out.println("You have been alive " + days + " seconds");
        System.out.println("You have lived " + percent + " percent of your life");
    }
}