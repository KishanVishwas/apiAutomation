package javaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateAndTime
{
    public static void main(String[] args) {
        LocalDate myObj=LocalDate.now();
        System.out.println(myObj);

        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myTo=LocalDateTime.now();
        System.out.println("before Formatted " + myTo);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("E,dd/MM/yy HH:mm");
        String newFormat = myTo.format(format);
        System.out.println(newFormat);

    }
}
