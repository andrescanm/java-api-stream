package co.api.stream;

import java.util.stream.Stream;

public class StreamFilterReduce {

	public static void main(String[] args) {

		/* Reduce Strings */
		Stream<String> myStream = Stream.of("User a", "Another User", "Duplicated user!", "w w", "e e",
				"Duplicated user!", "t t", "y y", "Duplicated user!").distinct();

		String response = myStream.reduce("Initial value: ", (arg1, arg2) -> arg1 + " | " + arg2);
		System.out.println(response);

		/* Reduce Numbers */
		// Form 1
		Stream<Integer> numbersStream1 = Stream.of(1, 2, 3, 4, 5);
		int result = numbersStream1.reduce(0, (a, b) -> a + b);

		// Integer.sum()
		Stream<Integer> numbersStream2 = Stream.of(1, 2, 3, 4, 5);
		int result2 = numbersStream2.reduce(0, (a, b) -> Integer.sum(a, b));

		// Method reference
		Stream<Integer> numbersStream3 = Stream.of(1, 2, 3, 4, 5);
		int result3 = numbersStream3.reduce(0, Integer::sum);

		System.out.println("Result1: " + result);
		System.out.println("Result2: " + result);
		System.out.println("Result3: " + result);
	}

}
