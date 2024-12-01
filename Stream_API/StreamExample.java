package Stream_API;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class StreamExample {
	public static void predicate1() {
	};

	public static void main(String[] args) {
		Predicate<Student> studentpredicate1 = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> studentpredicate2 = (student) -> student.getGpa() >= 3.8;
		Predicate<Student> studentpredicate3 = (student) -> student.getGender() == "female";

		Map<String, List<String>> mapstudent = StudentDataBase.getAllstudent().stream()
				.peek(student -> {System.out.println("Simple List" + student);})
				.filter(studentpredicate1) // we are passing above predicate
				.peek(student -> {System.err.println("After 1st Predicate" + student);})
				.filter(studentpredicate2).peek(student -> {System.out.println("After 2nd Predicate" + student);})
				.filter(studentpredicate3).peek(student -> {System.out.println("After 3rd Predicate" + student);})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(mapstudent);
	}
}
