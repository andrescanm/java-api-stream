package co.api.stream;

import java.util.stream.Stream;

public class StreamFilterReduce {

	public static void main(String[] args) {

		Stream<String> myStream = Stream.of("User a", "Another User", "Duplicated user!", "w w", "e e",
				"Duplicated user!", "t t", "y y", "Duplicated user!").distinct();

		String response = myStream.reduce("Initial value: ", (arg1, arg2) -> arg1 + " | " + arg2);
		System.out.println(response);

		Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5);
		int result = numbersStream.reduce(0, (a, b) -> a + b);
		System.out.println("Result sum numbersStream: " + result);
	}

}
