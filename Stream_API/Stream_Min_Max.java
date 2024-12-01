package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Min_Max {
// Max Value using reduce function (without using direct max)
	public static int findMaxValue(List<Integer> integer) {
		return integer.stream().reduce(0, (x, y) -> x > y ? x : y);
	};
// Min Value using reduce function (without using direct min)
	public static Optional<Integer> findMinValue(List<Integer> integer) {
		return integer.stream().reduce((x, y) -> x < y ? x : y);
	};
// Max Value using Max function		
	public static Integer findMaxValue2(List<Integer> integer) {
		Integer integer2 = integer.stream().max(Integer::compare).get();
		return integer2;
	};
// Max Value using Max function	
	public static int findMinValue2(List<Integer> integer) {
		return integer.stream().min(Integer::compare).get();
	};
	public static void main(String[] args) {
		List<Integer> integer = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		System.out.println("Result without Max Function");
		int maxvalue = findMaxValue(integer);
		System.out.println("Max Value is = " + maxvalue);
		System.out.println("Result without Min Function");
		Optional<Integer> minvalue = findMinValue(integer);
		if (minvalue.isPresent()) {
			System.out.println("Max Value is = " + minvalue.get());
		} else {
			System.out.println("Input is not passed");
		}

		System.out.println("Result using Max Function");
		int findmaxvalue2 = findMaxValue2(integer);
		if (minvalue.isPresent()) {
			System.out.println(findmaxvalue2);
		} else {
			System.out.println("Input is not passed");
		}

		System.out.println("Result using Min Function");
		int findminvalue2 = findMinValue2(integer);
		System.out.println(findminvalue2);
	}
}
