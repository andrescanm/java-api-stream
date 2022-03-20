package co.api.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import co.models.User;

public class StreamMap {
	public static void main(String[] args) {
		System.out.println("------------------");
		Stream.of("Kelly", "Carl", "Fancis").map(String::toUpperCase).peek(System.out::println).map(String::toLowerCase)
				.forEach(e -> System.out.println(e));

		System.out.println("------------------");
		Stream<String> namesStream = Stream.of("Rick", "Ash", "Ely").map(String::toUpperCase).peek(System.out::println)
				.map(String::toLowerCase);
		List<String> listFromNamesStream = namesStream.collect(Collectors.toList());
		listFromNamesStream.forEach(System.out::println);

		System.out.println("------------------");
		Stream<User> usersStream = Stream.of("User1", "User2", "User3").map(name -> new User(name, null))
				.peek(System.out::println).map(niceUser -> {
					String name = niceUser.getName().toLowerCase();
					niceUser.setName(name);
					return niceUser;
				});
		List<User> listFromUsersStream = usersStream.collect(Collectors.toList());
		listFromUsersStream.forEach(System.out::println);

		System.out.println("------------------");
		Stream<User> usersStream2 = Stream.of("User1 Lastname1", "User2 Lastname2", "User3 Lastname3")
				.map(fullName -> new User(fullName.split(" ")[0], fullName.split(" ")[1]))
				.peek(u -> System.out.println(u.getName().concat(" ").concat(u.getLastName()))).map(niceUser -> {
					String name = niceUser.getName().toLowerCase();
					niceUser.setName(name);
					return niceUser;
				});
		List<User> listFromUsersStream2 = usersStream2.collect(Collectors.toList());
		listFromUsersStream2.forEach(u -> System.out.println(u.getName()));

	}
}
