package arrays_exercises;
import java.lang.*;
import java.util.Arrays;

public class UsingJavaUtilArrays {


    public static void main(String[] args) {
        int[] numbers = {5, 3, 17, 25, 4, 33, 45, 12};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean[] responses = {true, false, false, true, true};
        boolean[] responses2 = {false, true, false, true, true};


        //Sorting & Arrays.toString()

        System.out.println("Before sorting: "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: "+ Arrays.toString(numbers));
        //sorting works with arrays of type int, double, char, 
        //byte, long, short, object

        //BinarySearch

        int key = 25;
        int keyPosition = Arrays.binarySearch(numbers,key);
        //works with arrays of type int, double, char, byte, long, short, object
        System.out.println("Your key was found in position "+keyPosition);


        //Comparing two Arrays

        if(Arrays.equals(responses, responses2)==true)
            System.out.println("The two boolean arrays are the same.");
        else
            System.out.println("The two boolean arrays are different");

        //Setting initial size
        int [] newNumbers = new int[10];
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]); //will just print 0
        }
        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i] = i * 10;
            System.out.println(newNumbers[i]); //will just print 0
        }

        //copyOf - copying a part of an array to another array
        int[] copiedShorterArray = new int[5];
        copiedShorterArray = Arrays.copyOf(newNumbers, 5 );
        for (int value: copiedShorterArray) {
            System.out.println(value);
        }



        //copyof - moving entire array to a bigger array
        int[] largerArray = Arrays.copyOf(newNumbers,newNumbers.length*2);
        for (int value: largerArray) {
            System.out.println(value);
        }
             
    }
    
}
