package co.api.stream;

import java.util.stream.Stream;

import co.models.User;

public class StreamFilterCount {

	public static void main(String[] args) {
		long count = Stream.of("a a", "b b", "c c").map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
				.peek(System.out::println).count();

		System.out.println(count);
	}
}
