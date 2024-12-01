package Date_and_Time_API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Custom_Date_Formating {

	public static void formattedCustomDate() {
// Current Date to Formated		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate localDate = LocalDate.now();
		System.out.println("Local Date = "+ localDate);
		String formatedDate = localDate.format(dateTimeFormatter);
		System.out.println("Formated Date = "+ formatedDate);

// Custom Date to Formated
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy|MM|dd");		
	String s="2020-12-23";
	LocalDate customDate = LocalDate.parse(s);
	String formatedDate2 = customDate.format(dateTimeFormatter1);
	System.out.println("Formated Date = "+ formatedDate2);
	
// Custom Date to Formated 2
	String s1="2020|12|23";
	DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy|MM|dd");
	LocalDate localDate2 = LocalDate.parse(s1, dateTimeFormatter2);
	System.out.println("Formated to Local Date = "+localDate2 );
	};
	public static void main(String[] args) {
		formattedCustomDate();
	}
}
