package Stream_API;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ParallelStreamExample_CurrentTimeMills_IntStream_RangeClosed_Boxed {
	
	public static int sequentialStream(List<Integer> integerlist) {
		long start = System.currentTimeMillis();
		int sum = integerlist.stream().reduce(0, (x,y)-> x+y);  // this operation is called Unboxing
		long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println("Duration = "+duration);
		return sum;
	};
	public static int parallelStream(List<Integer> integerlist) {
		long start = System.currentTimeMillis();
		int sum = integerlist.parallelStream().reduce(0, (x,y)-> x+y);
		long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println("Duration = "+duration);
		return sum;
	};
public static void main(String[] args) {
	List<Integer> integerlist = IntStream.rangeClosed(1, 10000).boxed().toList();
	int sum = sequentialStream(integerlist);
	System.out.println("Sum is = "+sum);
	parallelStream(integerlist);
}
}
