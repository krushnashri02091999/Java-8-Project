package Stream_API;

import java.util.List;
import java.util.stream.Collectors;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class StreamFilterExample {
	
	public static List<Student> getstudentByGradelevel(){
		System.out.println("Result using GradeLevel");
		List<Student> listgrade = StudentDataBase.getAllstudent().stream()
		.filter(s->s.getGradeLevel()>=3).collect(Collectors.toList());
		
		return listgrade;
	};
	
	public static List<Student> getstudentByGps(){
		System.out.println("Result using GPA");
		List<Student> listgpa = StudentDataBase.getAllstudent().stream()
		.filter(s-> s.getGpa()>=3.8).toList();
		
		return listgpa;
	};
	
	public static List<Student> getstudentByGender(){
		System.out.println("Result using Gender");
		List<Student> listgender = StudentDataBase.getAllstudent().stream()
		.filter(s-> s.getGender()=="female").toList();
		
		return listgender;
	}; 
	public static void main(String[] args) {
		getstudentByGradelevel().forEach(System.out::println);
		getstudentByGps().forEach(System.out::println);
		getstudentByGender().forEach(System.out::println);
	}

}
