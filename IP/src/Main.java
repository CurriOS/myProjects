import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumEarning = 0, sumSpending = 0, newEarning, newSpending;
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            System.out.println("Choose action: \n 1. Add new income \n 2. Add new spending \n 3. Optimal taxation system \n end - Finish program ");
            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    System.out.println("Enter the amount of income: ");
                    String earningInput = scanner.nextLine();
                    newEarning = Integer.parseInt(earningInput);
                    sumEarning += newEarning;
                    break;
                case "2":
                    System.out.println("Enter the amount of the spending: ");
                    String spendingInput = scanner.nextLine();
                    newSpending = Integer.parseInt(spendingInput);
                    sumSpending += newSpending;
                    break;
                case "3":
                    if ((sumEarning / 100 * 6) < ((sumEarning - sumSpending) / 100 * 15)) {
                        int dif1 = ((sumEarning - sumSpending) / 100 * 15) - (sumEarning / 100 * 6);
                        System.out.println("Optimal taxation system - STS income \n You will save " + dif1);
                    } else if ((sumEarning / 100 * 6) > ((sumEarning - sumSpending) / 100 * 15)) {
                        int dif2 = (sumEarning / 100 * 6) - ((sumEarning - sumSpending) / 100 * 15);
                        System.out.println("Optimal taxation system - STS income minus spending \n You will save " + dif2);
                    }
                    break;
                case "end":
                    check = false;

            }
        }
        System.out.println("Program finished.");
    }
}
//This code is made for choosing optimal taxation system for individual entrepreneurs in Russia and to practice "switch", "while" and "break".