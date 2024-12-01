package Optional_Class;

import java.util.Optional;

public class IfPresent_IsPresent_Method {

	public static void main(String[] args) {
// isPresent
//		Optional<String> optional = Optional.ofNullable("Hello");
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(optional.isPresent());
		if (optional.isPresent()) {
			System.out.println(optional.get());
		} else {
			System.out.println("Object is Empty");
		}
// ifPresent
		optional.ifPresent(s-> System.out.println("Output of ifPresent = "+s));
	}
}
