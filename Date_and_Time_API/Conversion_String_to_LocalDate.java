package Date_and_Time_API;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Conversion_String_to_LocalDate {
	public static void parseLocalDate() {

// 1st way using parse Method	
		String date = "2022-02-25";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println(" Formated Local Date = " + localDate);

// 1st way using parse TimeDateFormatter Method
		LocalDate localDate2 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(" Formated Local Date = " + localDate2);
		
		String date1 = "20220225";
		LocalDate localDate3 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(" Formated Local Date = " + localDate3);
	};

	public static void main(String[] args) {
		parseLocalDate();
	}
}
