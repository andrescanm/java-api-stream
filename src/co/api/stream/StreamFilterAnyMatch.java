package co.api.stream;

import java.util.stream.Stream;

import co.models.User;

public class StreamFilterAnyMatch {

	public static void main(String[] args) {
		boolean exist = Stream.of("a a", "b b", "c c").map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
				.peek(System.out::println).anyMatch(u -> u.getId().equals(4));
	}
}
