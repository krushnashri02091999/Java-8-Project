package Stream_API;

import java.util.Optional;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class Stream_FindFirst_FindAny {
	public static Optional<Student> findAny() {
		Optional<Student> findAny = StudentDataBase.getAllstudent().stream().filter(student -> student.getGpa() >= 4.5)
				.findAny();
		return findAny;
	};

	public static Optional<Student> findFirst() {
		Optional<Student> findfirst = StudentDataBase.getAllstudent().stream()
				.filter(student -> student.getGpa() >= 3.5).findFirst();
		return findfirst;
	};

	public static void main(String[] args) {
		Optional<Student> findany = findAny();
		System.out.println("Result of Find Any Method");
		if (findany.isPresent()) {
			System.out.println("Found the Student = " + findany);
		} else {
			System.out.println("Student not Found");
		}
		Optional<Student> findfirst = findFirst();
		System.out.println("Result of Find First Method");
		if (findfirst.isPresent()) {
			System.out.println("Found the Student = " + findfirst);
		} else {
			System.out.println("Student not Found");
		}
	}
}
