package co.api.stream;

import java.util.Optional;
import java.util.stream.Stream;

import co.models.User;

public class OptionalEx {

	public static void main(String[] args) {
		Stream<User> users = Stream.of("q q", "w w", "e e", "r r", "t t", "y y")
				.map(data -> new User(data.split("")[0], data.split("")[1]))
				.filter(element -> element.getName().equals("User Not found!")).peek(System.out::println);

		Optional<User> myOptionalUser = users.findFirst();

		// System.out.println("OUT: " + myOptionalUser.get());
		// System.out.println("OUT: " + myOptionalUser.orElse(new User("Default",
		// "User")));
		// System.out.println("OUT: " + myOptionalUser.orElseGet(() -> new
		// User("Default", "User")));
		System.out.println("OUT: " + myOptionalUser.orElseThrow(null));
	}

}
