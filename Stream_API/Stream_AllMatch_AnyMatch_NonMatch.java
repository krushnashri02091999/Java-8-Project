package Stream_API;

import com.learnjava8.data.StudentDataBase;

public class Stream_AllMatch_AnyMatch_NonMatch {

	public static boolean anyMatch() {
		boolean anymatch = StudentDataBase.getAllstudent().stream()
				.anyMatch(student -> student.getGpa() >= 3.5);
		return anymatch;
	};

	public static boolean allMatch() {
// if this condition satisfied by all Student then only result is true
		return StudentDataBase.getAllstudent().stream()
				.allMatch(student -> student.getGpa() >= 4.5);
	};
	
	public static boolean noneMatch() {
		return	StudentDataBase.getAllstudent().stream()
				.noneMatch(student -> student.getGpa() >= 5);
		 
	};

	public static void main(String[] args) {
		System.out.println("Result of AnyMatch = " + anyMatch());
		System.out.println("Result of AllMatch = " + allMatch());
		System.out.println("Result of NoneMatch = " + noneMatch());
	}

}
