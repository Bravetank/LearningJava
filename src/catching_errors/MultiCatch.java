package catching_errors;

public class MultiCatch {
    public static void main(String[] args) {
        String greeting = "Welcome";
        try {
            char[] charGreeting = greeting.toCharArray();
            char lastChar = charGreeting[charGreeting.length-1];
            System.out.println(lastChar);

            //Deliberate error - no 10th index in Welcome
            String sub = greeting.substring(10);
            System.out.println("Substring " + sub);

        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index problem");
        }  catch (StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("String index problem");
    }
    }
}


