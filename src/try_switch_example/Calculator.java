package try_switch_example;

import java.util.Scanner;

public class Calculator {

    static double firstNumber;
    static double secondNumber;
    static String operator;
    static double total;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        askNumbers();

    }


    private static void askNumbers() {
        try {
            System.out.println("Enter the first number: ");
            firstNumber = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("That's not a number!");
            return;
        }

        try {
            System.out.println("Enter the second number: ");
            secondNumber = Double.parseDouble(in.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("That's not a number!");
            return;
        }

            System.out.println("Enter the operator ie +, -, *, or /");
            operator = in.nextLine();
            calculate(firstNumber, secondNumber, operator);
         }

    private static void calculate(double firstNumber, double secondNumber, String operator) {
        switch (operator) {
            case "+":
                total = firstNumber + secondNumber;
                System.out.println("Total: " +  total);
                break;
            case "-":
                total = firstNumber - secondNumber;
                System.out.println("Total: " +  total);
                break;
            case "*":
                total = firstNumber * secondNumber;
                System.out.println("Total: " +  total);
                break;
            case "/":
                if (secondNumber != 0) {
                    total = firstNumber / secondNumber;
                    System.out.println("Total: " +  total);
                } else {
                    System.out.println("Cannot divide by 0");
                    break;
                }
            default:
                System.out.println("Not an operator");
                break;
        }
    }
}




