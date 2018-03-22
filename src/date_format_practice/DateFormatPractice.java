package date_format_practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.getDateInstance;

public class DateFormatPractice {
    //psvm
    //Use SimpleDateFormat
    //Usr Today's date - Java Data
    //Use locale Data Format
    //Print today's date in French format

    public static void main(String[] args) {

        //Today's date
        Date today = new Date();
        SimpleDateFormat simpleDateFormat;


        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("This is the date without formatting: " + today);
        System.out.println("This is the date with formatting: " + simpleDateFormat.format(today));

        DateFormat dateFormat = DateFormat.getDateInstance(java.text.DateFormat.LONG, Locale.FRENCH);
        String dateOut = dateFormat.format(today);
        System.out.println("This is the formatted French date: " + dateOut);


    }

}
