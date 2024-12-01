package Stream_API;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample2 {
	
	public static long checkperformance(Supplier<Integer> supplier, int numberoftimes) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < numberoftimes; i++) {
			supplier.get();
		}
		long end = System.currentTimeMillis();
		long duration=end-start;
		System.out.println("Duration = "+duration);
		return duration;
	};
	public static int sequencialStream() {
		return IntStream.rangeClosed(1,10000).sum();
	};
	public static int parallelStream() {
		return IntStream.rangeClosed(1,10000).parallel().sum();
	};
	public static void main(String[] args) {
		checkperformance(ParallelStreamExample2::sequencialStream, 20);
		checkperformance(ParallelStreamExample2::parallelStream, 20);
	}
}

