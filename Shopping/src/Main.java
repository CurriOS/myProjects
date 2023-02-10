import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = new String[] {"Bread", "Apples", "Milk"};
        int[] prices = new int[] {100,200,300};

        for (int i = 0; i < products.length; i++)
            System.out.println((i+1 + ". " + products[i] + " - " + prices[i]));
        int sumProducts = 0;
        int[] basket = new int[products.length];
        while (true) {
            System.out.println("Please, input product code or 'end': ");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")){
                break;
            }
           int productNumber = Integer.parseInt(inputString);
            System.out.println("Please, input amount of product: ");
           int productCount = scanner.nextInt();

           sumProducts += (prices[productNumber - 1] * productCount);
           scanner.nextLine();
           basket[productNumber - 1] += productCount;

        }

        for (int i = 0; i < products.length; i++) {
            if (basket[i] > 0) {
                int priceOfProduct = basket[i] * prices[i];
                System.out.println("Name of product: " + products[i]);
                System.out.println("Amount : " + basket[i] + "\n" +
                        "Price for 1 product: " + prices[i] + "\n" +
                        "Total for this product: " + priceOfProduct + "\n" + "-----------------" + "\n");

            }
        }
        System.out.println("Total: " + sumProducts);
    }
}