package Date_and_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDate_LocalTime_LocalDateTime_Class {

	public static void main(String[] args) {
// LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date = " + localDate);
// Local Time
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time = "+localTime);
// Local Date and Time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local Date Time = "+localDateTime);
	}

}
