package scanner_example;

import java.util.Scanner;

public class ScannerInputExample {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        System.out.printf("Hello %s you are %d", name, age);
    }
}
