package Lab2;
import java.util.*;
import java.time.LocalDate;
public class time_date {

	public static void main(String[] args) {
     Date currentDate = new Date();
     System.out.println("date is "+currentDate);
     int day = currentDate.getDay();
     System.out.println("Day of the week (0 = Sunday): " + day);
     int date = currentDate.getDate();
     System.out.println("Date of the month: " + date);
     LocalDate today = LocalDate.now();
     System.out.println("Today's Date: " + today);;

	}

}
