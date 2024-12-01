package Optional_Class;

import java.util.Optional;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class OptionalExample {

// Simple Method without Optional	

	public static String getStudentName() {
//		Student student = StudentDataBase.StudentSupplier.get();  // for this if return execute
		Student student = null; // for this after if return execute
		if (student != null) {
			return student.getName();
		}
		return null;
	};

// Method Using Optional Class
	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentoptional = Optional.ofNullable(StudentDataBase.StudentSupplier.get());
//		Optional<Student> studentoptional = Optional.ofNullable(null);
//		Optional<Student> studentoptional = null;
		if (studentoptional.isPresent()) { // in Optional no need write != it provide ispresent method
			studentoptional.get();
			return studentoptional.map(Student::getName);
		}
//		return null;                // Both return are same 
		return Optional.empty();
	};

	public static void main(String[] args) {
		String name = getStudentName();
		if (name != null) {
			System.out.println("Name of Student = " + name);
		} else {
			System.out.println("Name not Found");
		}

		Optional<String> studentNameOptional = getStudentNameOptional();
		if (studentNameOptional.isPresent()) {
			System.out.println("Name of Student = " + studentNameOptional.get());
			System.out.println("Length of Student Name = " + studentNameOptional.get().length());
		} else {
			System.out.println("Name Not Found");
		}
	}
}