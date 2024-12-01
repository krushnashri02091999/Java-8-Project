package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimit_Skip_Reduce_OptionalClass {

	public static Optional<Integer> limit(List<Integer> integer) {

		return integer.stream().limit(5).reduce((x, y) -> x + y);

//   after return the output of reduce method is Optional Integer so we make method return type Optional.

	};
	public static Optional<Integer> skip(List<Integer> integer) {

		return integer.stream().skip(5).reduce((x, y) -> x + y);
//   after return the output of reduce method is Optional Integer so we make method return type Optional.

	};

	public static void main(String[] args) {
		List<Integer> integer = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		Optional<Integer> limitresult = limit(integer);
		System.out.println(limitresult.get());

		if (limitresult.isPresent()) {
			System.out.println("The Limit Method Result is = " + limitresult.get());
		} else {
			System.out.println("No Input is Passed");
		}

		Optional<Integer> limitresult2 = skip(integer);
		System.out.println(limitresult2.get());

		if (limitresult2.isPresent()) {
			System.out.println("The Skip Method Result is = " + limitresult2.get());
		} else {
			System.out.println("No Input is Passed");
		}
	}
}