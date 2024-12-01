package Optional_Class;

import java.util.Optional;

public class OfNullable_Of_Empty_Method {
	public static Optional<String> ofNullable() {
		Optional<String> stringoptional = Optional.ofNullable("Hello Optional");
		Optional<String> stringoptional2 = Optional.ofNullable(null);
		return stringoptional2;
	//	return stringoptional;	
	};
	
	public static Optional<String> of() {
		Optional<String> stringoptional = Optional.of("Hello Optional");
	//	Optional<String> stringoptional2 = Optional.of(null);
	//	return stringoptional2;
		return stringoptional;	
	};
	
	public static Optional<String> empty() {
		return Optional.empty();
	};
public static void main(String[] args) {
	System.out.println("Output of ofNullable Method = "+ofNullable());
	System.out.println("Output of of Method = "+of());
	System.out.println("Output of Empty Method = "+empty());
}
}
