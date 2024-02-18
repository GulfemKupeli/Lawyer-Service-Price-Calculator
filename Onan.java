import java.util.Scanner;

public class Onan {
    public static void main(String[] args){
        /**

         Program description: Lawyer Service Price Calculator

         Author: Gülfem Küpeli

         E-mail address: 210401024@ogr.ikcu.edu.tr

         Homework Number:02

         Last Changed: 31/10/2023

         */
        System.out.println("Please enter the price you can afford(in TL): ");
        Scanner input_p = new Scanner(System.in);
        double price = input_p.nextDouble();

        // Calculated affordable minutes
       double minute_price = 15.0;
       double available_minutes = price / minute_price;

       // Calculated the days, hours and minutes using reminder operator.
       int day_count = (int) (available_minutes / 1440);
       available_minutes = available_minutes % 1440;
       int hour_count = (int) (available_minutes / 60);
       int minute_count = (int) (available_minutes % 60);

       String day_string;
       String hour_string;
       String minute_string;
        // I initialized strings for deciding the use of the plural and singular form of the words. I used if and else statement. But I guess there is a way to do it with ? operator.

       if (day_count == 1)
           day_string = "day";
           else
               day_string = "days";

           if(hour_count == 1)
               hour_string ="hour";
           else hour_string ="hours";

           if(minute_count ==1)
               minute_string = "minute";
           else
               minute_string ="minutes";

        System.out.println(day_count + " " + day_string + ", " + hour_count + " " + hour_string + ", and " + minute_count + " " + minute_string);







    }
}
