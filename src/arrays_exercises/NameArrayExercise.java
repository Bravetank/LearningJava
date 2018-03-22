package arrays_exercises;

import java.util.Scanner;

public class NameArrayExercise {
    public static void main(String[] args) {
        String[][] names = {{"Mickey", "Mouse"},
                {"Donald", "Duck"},
                {"Goofy", "Pluto"},
                {"Snow", "White"},
                {"James", "Bond"},
                {"Doc", "Sneezy"},
                {"Scotty", "Jimmy"},
                {"Peggy", "Sandy"},
                {"Joe", "Sean"},
                {"Alice", "Mackenzie"},
                {"Reshmi", "Vasant"},
                {"Steve", "Rae"}};

        Scanner in = new Scanner(System.in);
        String response = "y";
        String name;
        while (response.equalsIgnoreCase("y")) {
            System.out.println("Enter a name to check");
            name = in.nextLine();
            if (checkName(names, name)){
                System.out.println("Well done. Name found");
            } else {
                System.out.println("Sorry name not found");
            }
            System.out.println("Do you want to play again - y/n?");
            response = in.nextLine();
        }
        System.out.println("Thank you for playing!");
    }

    private static boolean checkName(String[][] names, String name) {
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[0].length; col++) {
                if (names[row][col].equalsIgnoreCase(name)) {
                    return true;
                }
            }

        } return false;
    }

}





