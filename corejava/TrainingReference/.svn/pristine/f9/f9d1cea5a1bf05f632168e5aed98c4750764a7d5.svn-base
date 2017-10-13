package com.nivtek.training.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;

@SuppressWarnings("all")
public class ExampleDate {
  
    @Deprecated
    private void foo() {
      
    }
    
    public static void main(String[] args) {
        Date date = new Date();
        date.getDay();
        System.out.println(date);
        System.out.println(date.getTime() + " ms since the epoch");

        // Use CST
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Chicago"));
        
        System.out.println("Year:   " + c.get(Calendar.YEAR));
        System.out.println("Month:  " + c.get(Calendar.MONTH));
        System.out.println("Day:    " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("WeekDay:" + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour:   " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + c.get(Calendar.MINUTE));
        System.out.println("Second: " + c.get(Calendar.SECOND));
        System.out.println("Millis: " + c.get(Calendar.MILLISECOND));

        TimeZone timeZone = c.getTimeZone();
        System.out.println("TZ ID:  " + timeZone.getID());
        System.out.println("TZ Name:" + timeZone.getDisplayName());
        System.out.println("TZ Off: " + timeZone.getRawOffset());
        
        Date now = new Date();
        DateFormat df;

        // Get the default date and time format
        df = DateFormat.getDateTimeInstance();
        System.out.println("DateTimeInstance date format output: " + df.format(now));

        // Get the default "short" date and time format
        df = DateFormat.getInstance();
        System.out.println("DateTimeInstance default short format output: " + df.format(now));

        // Get the default "medium" date format
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("DateTimeInstance MEDIUM date format output: " + df.format(now));

        // Get the default "long" time format
        df = DateFormat.getTimeInstance(DateFormat.LONG);
        System.out.println("DateTimeInstance LONG date format output: " + df.format(now));

        // Parsing and Formatting dates
        try {
            df = new SimpleDateFormat("MM/d/y");
            // Parsing a string into a date
            Date birthday = df.parse("08/29/1965");
            // Formatting a date into a string
            df = DateFormat.getDateInstance(DateFormat.MEDIUM);
            System.out.println(df.format(birthday));
            
            df = new SimpleDateFormat("E MMMM-d-yyyy hh:mm:ss a zzzz");
            //Date currentDate = new Date();
            Date currentDate = c.getTime();
            System.out.println("Current date: " + df.format(currentDate));
        } catch (ParseException e) {
            // Couldn't parse the date string
            e.printStackTrace();
        }
    }
}
