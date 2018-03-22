package methods_and_basics;

import java.util.Scanner;

public class GroceryExercise {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {



        System.out.println("Enter the name of the store or \"None\" if not known:");
        String storeName = in.nextLine();

        double totalGroceryCosts = 0;
        totalGroceryCosts = getTotalCost();

        if (storeName.equalsIgnoreCase("None")) {
            System.out.printf("The total cost is %7.20f", totalGroceryCosts);
        } else {
            System.out.printf("The total cost is %7.2f. Thank you for shopping at %s", totalGroceryCosts, storeName);
        }
    }


    public static double getTotalCost() {
        double total = 0;
        Boolean moreItems = true;
        char response;

        while (moreItems) {
            total += getItemPrice(getGroceryItem());
            System.out.println("Are you buying anything else? Y/N");
            response = in.next().charAt(0);
            if (response == 'N' || response == 'n') {
                moreItems = false;
            } in.nextLine();
        }
        return total;
    }

    public static String getGroceryItem() {
        System.out.println("Enter item: ");
        String itemName = in.nextLine();
        return itemName;
    }

    public static double getItemPrice(String groceryItem) {
        double itemPrice = 0;
        try {
            System.out.printf("Enter item price for %s: %n ", groceryItem);
           itemPrice = in.nextDouble();
        } catch (Exception e) {
            System.out.println("Wrong data type");
            e.printStackTrace();
        }
        System.out.println("Enter quantity: ");
        int quantity = in.nextInt();
        double totalItemPrice = quantity * itemPrice;
        return totalItemPrice;
    }

}