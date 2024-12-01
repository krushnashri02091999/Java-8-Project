package Stream_API;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class StreamMapMethodExample {

	// List
	
	public static List<String> nameList(){
//  Conversion
//        List<Student>	           Stream<Student>        Stream<String>    	
		
		List<String> namelist = StudentDataBase.getAllstudent().stream()
				.map(Student::getName).toList();  // we can pass any function in map like (Uppercase,Lowercase)
//		return namelist;
		List<String> upperCasenameList = StudentDataBase.getAllstudent().stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());	
	return upperCasenameList;
	};
	
	//Set
	
	public static Set<Double> gpaSet(){
		Set<Double> gpaset = StudentDataBase.getAllstudent().stream().map(Student::getGpa).collect(Collectors.toSet());
	return gpaset;
	};
	public static void main(String[] args) {
		System.out.println("List of Student");
		nameList().forEach(System.out::println);
		System.out.println("Set of Student");
		gpaSet().forEach(System.out::println);
	}

}
