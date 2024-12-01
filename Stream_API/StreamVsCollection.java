package Stream_API;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamVsCollection {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("adam");
		name.add("jim");
		name.add("jenny");
		name.add("emily");
		name.add("jems");
		System.out.println(name);

		System.out.println("Name using Stream");
		Stream<String> namestream = name.stream(); // 1st write right side code then Assign
//		namestream.forEach(System.out::println);      // for each is a method not loop
		namestream.forEach(s -> {
			System.out.println(s);
		}); // we cannot print Stream Twice

	}

}
