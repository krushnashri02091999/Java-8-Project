package Functional_Interface;

import java.util.List;
import java.util.function.Consumer;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class ConsumerInterfaceExample {
	
	static Consumer<Student> c1=p -> System.out.println(p.getName());
	static Consumer<Student> c2=p -> System.out.println(p.getName().toUpperCase());
	static Consumer<Student> c3=p -> System.out.println(p.getActivities());
	
	public static void printName() {
		List<Student> allStudent=StudentDataBase.getAllstudent();
//		for (Student student : allStudent) {            // old method 
//			System.out.println(student.getName());
			
//		}
		System.out.println("Student Name = ");
		allStudent.forEach(c1);      // New Method using functional Interface      
		System.out.println("Student Name in UpperCase = ");
		allStudent.forEach(c2);
		System.out.println("Student Activities = ");
		allStudent.forEach(c3);
	};
	public static void printNameAndActivities() {
		List<Student> allStudent=StudentDataBase.getAllstudent();
		System.out.println("1st Student Name in UpperCase and then Name = ");
		allStudent.forEach(c2.andThen(c1));
	};
	public static void main(String[] args) {
		printName();
		printNameAndActivities();
	}

}
