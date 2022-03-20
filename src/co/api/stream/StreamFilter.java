package co.api.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import co.models.User;

public class StreamFilter {
	public static void main(String[] args) {

		System.out.println("------------------");
		Stream<User> usersStream = Stream
				.of("User1 Lastname1", "Customer Lastname2", "User3 Lastname3", "User4 Lastname4", "Customer Lastname5")
				.map(fullName -> new User(fullName.split(" ")[0], fullName.split(" ")[1]))
				.filter(e -> e.getName().toLowerCase().equals("customer")).peek(System.out::println);
		List<User> listFromUsersStream2 = usersStream.collect(Collectors.toList());
		listFromUsersStream2.forEach(System.out::println);

		System.out.println("------------------");
		User myUserMapFilterFindFirst = Stream
				.of("User1 Lastname1", "Customer Lastname2", "User3 Lastname3", "User4 Lastname4", "Customer Lastname5")
				.map(u -> new User(u.split(" ")[0], u.split(" ")[1]))
				.filter(u -> u.getName().toLowerCase().equals("user3")).findFirst().get();
		System.out.println(myUserMapFilterFindFirst);
	}
}
