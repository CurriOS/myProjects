import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int points = 0;
        boolean res = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game Number of days in a year ");
        while (res) {
            System.out.print("Enter the year in the format yyyy ");
            int year = scanner.nextInt();
            System.out.print("Enter the number of days in a year ");
            short days = scanner.nextShort();
            if ((year % 4 == 0) && (days == 366)) {
                points++;
                System.out.println("Number of points scored: " + points);
            }
            else if ((year % 4 != 0) && (days == 365)) {
               points++;
                System.out.println("Number of points scored: " + points);
            }
                else {
                    res = false;
                }
        }
        System.out.println("Number of points scored: " + points);
        System.out.println("Game Over!");
    }
}

// I wrote this code to try using "while", "if", "else", "else if" and also using different data types.