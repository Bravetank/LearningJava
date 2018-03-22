package catching_errors;

public class CreatingOwnExceptions {
    public static void main(String[] args) {
        String wordOfTheDay = "cold";
        char[] charWord = wordOfTheDay.toCharArray();
        if (charWord.length < 5) {
            try {
                throw new Exception("My custom Exception");
            } catch (Exception e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

    }
}
