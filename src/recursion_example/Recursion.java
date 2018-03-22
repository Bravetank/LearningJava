package recursion_example;

public class Recursion {

    public static void main(String[] args) {
        //Recursion example - countdown method calls itself until finished

        System.out.println("Countdown starts...");
        countdown(10);
        System.out.println("Blast Off!!!");

    }

    private static void countdown(int i) {
        if (i == 0){
            return;
        }
        System.out.println(i);
        i--;
        countdown(i);

    }

}
