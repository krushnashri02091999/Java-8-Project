package Functional_Interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class BiFunctionalInterfaceExample {
                       // below is 1st 2 input class and 3rd is output class
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifunction =(studentslist, studentpredicate) -> {
		Map<String, Double> studentGradeMap=new HashMap();                                 // above is input variable 
		studentslist.forEach(student ->{             // Iterate student
	//		System.out.println(student);
			if (studentpredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());    // we cannot change getGpa if we want to change then change the datatype in Map object
	
			}
		});
		return studentGradeMap;
	};
	public static void main(String[] args) {
		
		System.out.println("GradeLavel >=3 "+bifunction.apply(StudentDataBase.getAllstudent(),PredicateInterfaceExample.p1));
		System.out.println("Gpa >=3.8   "+bifunction.apply(StudentDataBase.getAllstudent(),PredicateInterfaceExample.p2));
		System.out.println("Gender ==female   "+bifunction.apply(StudentDataBase.getAllstudent(),PredicateInterfaceExample.p3));   //P1,2,3 any predicate we can pass here 
		                                    // apply method have 2 object input                              // those predicate pass above on that basis output we get
	}    
		
		                                                                  
}
