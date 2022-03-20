package co.api.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterDistinct {

	public static void main(String[] args) {
		Stream<String> myStream = Stream.of("User a", "Another User", "Duplicated user!", "w w", "e e",
				"Duplicated user!", "t t", "y y", "Duplicated user!").distinct();

		// myStream.forEach(System.out::println);

		List<String> listFromStream = myStream.collect(Collectors.toList());
		for (String element : listFromStream) {
			System.out.println("Iteration listFromStream: " + element);
		}
	}

}
