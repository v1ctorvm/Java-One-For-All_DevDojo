package javaoneforall.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest01 {
    static void main() {

        Calendar calendar = Calendar.getInstance();

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of the week");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        calendar.add(Calendar.DAY_OF_MONTH,2);
        calendar.add(Calendar.HOUR,2);

        Date date = calendar.getTime();
        System.out.println(date);

    }
}
