import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner(System.in);

    boolean doorOpen = true;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    
    System.out.println("Welcome to Mother Hubbard's Pantry!");

    while (doorOpen) {
        System.out.println("The jams are:");
        System.out.println( hubbard );
        System.out.println("Enter your selection (1, 2, or 3)");
        int c = scan.nextInt();
        if (c >= 1 && c <= 3) {
            hubbard.select(c);
            System.out.println("Enter amount to be spread:");
            hubbard.spread(scan.nextInt());
        } else if (c < 1) {
            doorOpen = false;
            System.out.println("Good-by");
        } else {
            System.out.println("There are only 3 jams in the cupboard." + "\n");
        }
    }

    // System.out.println( hubbard );

    // hubbard.select(1);
    // hubbard.spread(2);
    // System.out.println( hubbard );

    // hubbard.select(3);
    // hubbard.spread(4);
    // System.out.println( hubbard );
  }
}