package co.api.stream;

import java.util.stream.Stream;

public class StreamFilterEmpty {

	public static void main(String[] args) {
		long count = Stream.of("", "w w", "e e", "", "t t", "y y", "").filter(String::isEmpty).peek(System.out::println)
				.count();

		System.out.println("Count of empty elements is: " + count);
	}

}
