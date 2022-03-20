package co.api.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import co.models.User;

public class StreamFilter {
	public static void main(String[] args) {

		System.out.println("------------------");
		Stream<User> usersStream = Stream.of("1 1", "2 2", "3 3").map(u -> new User(u.split(" ")[0], u.split(" ")[1]))
				.filter(e -> e.getName().toLowerCase().equals("2")).peek(System.out::println);
		List<User> listFromUsersStream2 = usersStream.collect(Collectors.toList());
		listFromUsersStream2.forEach(System.out::println);

		System.out.println("------------------");
		User myUserMapFilterFindFirst = Stream.of("4 4", "5 5", "6 6")
				.map(u -> new User(u.split(" ")[0], u.split(" ")[1])).filter(u -> u.getName().toLowerCase().equals("5"))
				.findFirst().get();
		System.out.println(myUserMapFilterFindFirst);

		System.out.println("------------------");
		User userFilterById = Stream.of("7 7", "8 8").peek(System.out::println)
				.map(u -> new User(u.split(" ")[0], u.split(" ")[1])).filter(u -> u.getId().equals(6)).findFirst()
				.get();
		System.out.println(userFilterById);
	}
}
