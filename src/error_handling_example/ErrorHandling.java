package error_handling_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandling {


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("What is the file name?");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        //Now need to READ file
        Scanner inFile = null;
        double total = 0;
        int count = 0;
        try {
            inFile = new Scanner(new File(fileName));
            while (inFile.hasNextDouble()) {
                total += inFile.nextDouble();
                count++;
            }
            System.out.printf("The average is %5.2f", total / count);
            System.out.println();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File name cannot be found.");
            //fnfe.printStackTrace(); REMOVE COMMENT TO PRINT STACK TRACE
        } finally {
            try {
                inFile.close();
            } catch (NullPointerException npe) {
                System.out.println("Null Pointer Exception");
                //npe.printStackTrace(); REMOVE COMMENT TO PRINT STACK TRACE
            }

        }


    }

}


