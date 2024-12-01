package Functional_Interface;

import java.util.List;
import java.util.function.Predicate;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class PredicateInterfaceExample {
	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.8;
	static Predicate<Student> p3 = (student) -> student.getGender() =="female";

	public static void filterStudentByGradeLevel() {
		System.out.println("filterStudentByGradeLevel");
		List<Student> studentslist = StudentDataBase.getAllstudent();
//		System.out.println(studentslist);
		studentslist.forEach(student ->{
			if (p1.test(student)&&p2.test(student) && p3.test(student)) {
				System.out.println(student);
				
			}
		});
	};

	public static void main(String[] args) {
		filterStudentByGradeLevel();
	}
}
