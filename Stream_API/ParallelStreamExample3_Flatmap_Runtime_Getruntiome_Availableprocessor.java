package Stream_API;

import java.util.List;

import com.learnjava8.data.Student;
import com.learnjava8.data.StudentDataBase;

public class ParallelStreamExample3_Flatmap_Runtime_Getruntiome_Availableprocessor {
	
	public static List<String> sequencialPrintStudentActivity(){
		long start = System.currentTimeMillis();
		List<String> listofactivity = StudentDataBase.getAllstudent().stream()
				.map(Student::getActivities).flatMap(List::stream).toList();
		long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println("Duration = "+duration);
		return listofactivity;
			}
	public static List<String> parallelPrintStudentActivity(){
		long start = System.currentTimeMillis();
		List<String> listofactivity = StudentDataBase.getAllstudent().stream().parallel()
				.map(Student::getActivities).flatMap(List::stream).toList();
		long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println("Duration = "+duration);
		return listofactivity;
			}
public static void main(String[] args) {
	System.out.println("Available Processor = "+Runtime.getRuntime().availableProcessors());
	sequencialPrintStudentActivity();
	parallelPrintStudentActivity();
}
}
