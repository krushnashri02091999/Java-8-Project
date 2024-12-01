package Functional_Interface;

import java.util.function.Function;

public class FunctionInterfaceExample {
	static Function<String, String> function = (name) -> name.toUpperCase();
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("Thakare");

	public static void main(String[] args) {
		System.out.println("Result is" + function.apply("shri"));
		System.out.println("Result of andThen" + function.andThen(addSomeString).apply("Shri"));
		System.out.println("Result of Compose" + function.compose(addSomeString).apply("shri"));
	}
}