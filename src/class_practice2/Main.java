package class_practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 100;

        System.out.println("What type of event is it? Wedding, Birthday or Graduation?");
        String name = in.nextLine();

        System.out.println("What's the date?");
        String date = in.nextLine();

        System.out.println("How many guests?");
        int guests = in.nextInt();
        // Skip the newline that is being generated and causing the next questions to all be asked before answer given!
        in.nextLine();

        count++;

        Event event = new Event(name, date, guests);
        event.setEventNumber(name, count);
        event.total(guests);

        System.out.println(event.toString());
        System.out.println();


        System.out.println("What type of event is it? Wedding, Birthday or Graduation?");
        String name2 = in.nextLine();

        System.out.println("What's the date?");
        String date2 = in.nextLine();


        System.out.println("How many guests?");
        int guests2 = in.nextInt();


        count++;

        Event event2 = new Event(name2, date2, guests2);
        event2.setEventNumber(name2, count);
        event2.total(guests);


        System.out.println(event2.toString());


    }
}
