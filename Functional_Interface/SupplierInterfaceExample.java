package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		 Supplier<Student> studentSupplier=() -> {
			 Student student1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("Swimming", "Basketball", "Vollyball"));
//		 return student1;
// 2nd way to give return	 
		 return new Student("Adam", 2, 3.6, "male", Arrays.asList("Swimming", "Basketball", "Vollyball"));
		 };
		 
		 Supplier<Integer> integer=() -> {
		 return 10+10;
		 };
		 Supplier<List<Student>> liststudentSupplier=() -> {
			
			 return StudentDataBase.getAllstudent();
		 };
		 System.out.println(studentSupplier.get());
		 System.out.println(integer.get());
		 System.out.println(liststudentSupplier.get());
	}
}
