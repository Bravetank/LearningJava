package char_array_from_string;

public class CharArrayFromString {
    public static void main(String[] args) {
        String greeting = "Welcome";
        try {
            char[] charGreeting = greeting.toCharArray();
            char lastChar = charGreeting[charGreeting.length];
            System.out.println(lastChar);
            //Changed the Exception below to the specific Exception I know the above error throws
        } catch (ArrayIndexOutOfBoundsException e) {
              e.printStackTrace();
        }
    }
}
