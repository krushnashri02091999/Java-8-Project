package Date_and_Time_API;

import java.time.LocalTime;

public class LocalTime_Class_Method_of_getHour_getMinute_plusMinute_withHour {
	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("Local Time = "+localTime);
// Custom Time print in hour and minute 		
		LocalTime localTime1 = LocalTime.of(12, 20);
		System.out.println("Local Time1 = "+localTime1);
		
// Custom Time print in hour and minute and second
		LocalTime localTime2 = LocalTime.of(12, 20,55);
		System.out.println("Local Time2 = "+localTime2);

// Custom Time print in hour and minute and second and nano Second
		LocalTime localTime3 = LocalTime.of(12, 20, 55, 48797631);
		System.out.println("Local Time3 = "+localTime3);
		
		System.out.println("get Hour = "+localTime.getHour());
		System.out.println("get Minute = "+localTime.getMinute());
		System.out.println("plus Minute = "+localTime.plusMinutes(31));
		System.out.println("with Hour = "+localTime.withHour(2));         // Hour replace karto
	}

}
