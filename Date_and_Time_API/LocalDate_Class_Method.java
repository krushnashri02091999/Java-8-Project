package Date_and_Time_API;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDate_Class_Method {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date = "+localDate);
		
// Custom Date Print		
		LocalDate localDate1 = LocalDate.of(1999, 9, 2);
		System.out.println("Local Date 1 = "+localDate1);
		
// if we give year and day month automatically takes 1st		
		LocalDate localDate2 = LocalDate.ofYearDay(2025,5);
		System.out.println("Local Date 2 = "+localDate2);
		
// get Value from Local Date
		System.out.println("get Month = "+localDate.getMonth());
		System.out.println("get Month Value = "+localDate.getMonthValue());
		System.out.println("get Day of the Week = "+localDate.getDayOfWeek());
		System.out.println("get Day of the Month = "+localDate.getDayOfMonth());
		System.out.println("get Day of the Year = "+localDate.get(ChronoField.DAY_OF_YEAR));
		
// Modifying Local Date
		
		System.out.println("With Year = "+localDate.withYear(1999));
		System.out.println("plus Days = "+localDate.plusDays(6));
		System.out.println("plus Months = "+localDate.plusMonths(6));
		System.out.println("with chrono Field = "+localDate.with(ChronoField.YEAR, 1999));
		System.out.println("with Temporal Adjuster = "+localDate.with(TemporalAdjusters.firstDayOfMonth()));
	
// Leap Year
		System.out.println("Leap Year = "+localDate.ofYearDay(2020, 01).isLeapYear());
		
		System.out.println("is Equal = "+localDate.isEqual(localDate1));
		System.out.println("is Before = "+localDate.isBefore(localDate2));
		System.out.println("is After = "+localDate.isAfter(localDate1));
	}
}