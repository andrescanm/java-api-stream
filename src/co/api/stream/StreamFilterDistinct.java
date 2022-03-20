package co.api.stream;

import java.util.stream.Stream;

public class StreamFilterDistinct {

	public static void main(String[] args) {
		Stream.of("User a", "Another User", "Duplicated user!", "w w", "e e", "Duplicated user!", "t t", "y y",
				"Duplicated user!").distinct().forEach(System.out::println);
	}

}
