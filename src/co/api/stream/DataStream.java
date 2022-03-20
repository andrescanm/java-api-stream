package co.api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DataStream {

	public static void main(String[] args) {

		System.out.println("------------------");
		// names.forEach(e -> System.out.println(e)); OR
		// names.forEach(System.out::println);

		Stream<String> names = Stream.of("Tom", "John", "Kate");
		names.forEach(System.out::println);

		System.out.println("------------------");
		String[] arrayDecNames = { "Louis", "Jane", "Michael" };
		Stream<String> names2 = Arrays.stream(arrayDecNames);
		names2.forEach(System.out::println);

		System.out.println("------------------");
		Stream<String> names3 = Stream.<String>builder().add("Jack").add("Mary").add("Alex").build();
		names3.forEach(e -> System.out.println(e));

		System.out.println("------------------");
		List<String> names4List = new ArrayList<>();
		names4List.add("Peter");
		names4List.add("Carl");
		names4List.add("Gina");
		Stream<String> names4 = names4List.stream();
		names4.forEach(System.out::println);
		System.out.println("***Or Directly***");
		names4List.stream().forEach(e -> System.out.println(e));
	}

}
