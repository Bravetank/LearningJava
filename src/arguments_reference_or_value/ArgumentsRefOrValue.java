package arguments_reference_or_value;

import java.util.Arrays;

public class ArgumentsRefOrValue {

    public static void main(String[] args) {

       //Primitive Types example
        int original = 10;
        System.out.println("Original int: " + original);
        incrementMethod(original);
        System.out.println("Original int after method call: " + original); //Original stays same

        System.out.println();

        //Primitives wrapped in Objects example
        int[] originalObject = {10, 20, 30};
        System.out.println("Original object 1st element before method call: " + originalObject[0]);
        incrementElement(originalObject);
        System.out.println("Original object 1st element after method call: " + originalObject[0]);

        System.out.println();


        //Passing Strings as values
        String greeting = "Hello";
        System.out.println("The original string: " + greeting);
        changeGreeting(greeting);
        System.out.println("The original string after method has executed:" + greeting);//String has not changed


    }

    private static void changeGreeting(String inMethodGreeting) {
        System.out.println("The string passed in: " + inMethodGreeting);//Hello was passed in
        inMethodGreeting = "Goodbye";
        System.out.println("The changed string: " + inMethodGreeting); //It has changed to Goodbye but this is only a copy, the original has not changed
    }

    private static void incrementElement(int[] inMethodObject) {
        inMethodObject[0]++;
        System.out.println("In method object - first Element: " + inMethodObject[0]);
    }

    private static void incrementMethod(int inMethod) {
        inMethod++;
        System.out.println("In method int: " + inMethod); //inMethod version is original+1
    }
  }


