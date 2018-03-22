package loops_review;

import java.util.Scanner;

public class LoopsReview {

    /* First a do while loop & switch on choice of snack
    do - ask the questions
    while - answer is not any of the above
    outside while turn to switch & tell customer what they selected
    * */

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int response = 0;

        do {
            System.out.println("Press 1 for Burger");
            System.out.println("Press 2 for Hotdogs");
            System.out.println("Press 3 for Crisps");
            response = in.nextInt();
        } while (
                response != 1 && response != 2 && response != 3);

        switch (response) {
            case 1:
                System.out.println("You picked Burger");
                break;
            case 2:
                System.out.println("You picked Hotdogs");
                break;
            case 3:
                System.out.println("You picked Crisps");
                break;

        }




    /* Loan - 5000, while more than 0, reduce by 500 & reduce month by 1
    Then print how long it will take to pay off the loan
    * */

    double loan = 5000;
    int months = 0;
    while (loan > 0){
        loan -= 500;
        months ++;
    }
        System.out.printf("It will take you %d months to pay off the loan", months);



    /* Use for loop to print all the odd numbers between 1 & 100
    * */

        for (int i = 0; i < 100; i++){
            if (i % 2 > 0){
                System.out.printf("%d %n", i );
            }
        }



    }
}


