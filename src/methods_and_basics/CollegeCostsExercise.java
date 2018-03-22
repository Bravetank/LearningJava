
package methods_and_basics;


import java.util.Scanner;

public class CollegeCostsExercise {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getStudentName();

        printExpensesTotal(name);
    }

    private static String getStudentName() {
        System.out.println("What is the student's name?");
        String name = in.nextLine();
        return name;

    }

    private static void printExpensesTotal(String name) {

        double totalExpenses;

        if (isOnCampus()) {
            totalExpenses = calculateTotalCosts(estimatedLivingExpenses(), booksAndSupplies(),
                    creditHours(), costPerCredit());
        } else totalExpenses = calculateTotalCosts(booksAndSupplies(),
                creditHours(), costPerCredit());





        if (getStudentName().equalsIgnoreCase("other")) {
            System.out.printf("%s your expenses for the year are %7.2f",
                    name, totalExpenses);
        } else {
            System.out.printf("%s you are a %s and your expenses for the year are %7.2f",
                    name, getStudentYear(), totalExpenses);
        }

    }


    public static boolean isOnCampus() {

        boolean invalidResponse = true;

        do {
            System.out.println("Does the student live on campus?");
            String answer = in.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Invalid response");
            }
        } while (invalidResponse);
        return false;
    }


//Second estimatedLiving expenses

    public static double estimatedLivingExpenses() {
        double total = 0;
        try {
            System.out.println("How many weeks on campus?");
            String value = in.nextLine();
            int weeks = Integer.parseInt(value);

            System.out.println("Estimated weekly expenses?");
            String value2 = in.nextLine();
            int expenses = Integer.parseInt(value2);

            System.out.println("Cost of room & board for a year?");
            String value3 = in.nextLine();
            int roomBoard = Integer.parseInt(value3);

            total = (weeks * expenses) + roomBoard;
        } catch (NumberFormatException e) {
            System.out.println("Invalid data type");
            e.printStackTrace();
        } finally {
            return total;
        }
    }

    public static double booksAndSupplies() {
        System.out.println("How much for books and supplies?");
        double costs = in.nextInt();
        return costs;
    }

    public static int creditHours() {
        System.out.println("How many credit hours?");
        int creditHours = in.nextInt();
        return creditHours;
    }


    public static int costPerCredit() {
        System.out.println("How much is the cost per credit?");
        int costPerCredit = in.nextInt();
        return costPerCredit;
    }


    public static double calculateTotalCosts(double expenses, double books, int creditHours, int costPerCredit) {
        double total = expenses + books + (creditHours * costPerCredit);
        return total;

    }

    public static double calculateTotalCosts(double books, int creditHours, int costPerCredit) {
        double total = books + (creditHours * costPerCredit);
        return total;

    }

    private static String getStudentYear() {
        System.out.println("What year are you? Freshman, Sophomore, Junior, Senior or Other");
        String year = in.nextLine();
        return year;
    }

}
