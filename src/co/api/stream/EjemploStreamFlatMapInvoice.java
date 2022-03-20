package co.api.stream;

import java.util.Arrays;
import java.util.List;

import co.models.Invoice;
import co.models.User;

public class EjemploStreamFlatMapInvoice {
	public static void main(String[] args) {

		User u1 = new User("John", "Doe");
		User u2 = new User("Pepe", "Perez");

		u1.addInvoice(new Invoice("compras tecnologias"));
		u1.addInvoice(new Invoice("compras muebles"));

		u2.addInvoice(new Invoice("bicicleta"));
		u2.addInvoice(new Invoice("notebook gamer"));

		List<User> Users = Arrays.asList(u1, u2);
		Users.stream().flatMap(u -> u.getInvoices().stream()).forEach(
				f -> System.out.println(f.getDescription().concat(" : cliente ").concat(f.getUser().toString())));

		/*
		 * for(User u: Users){ for(Invoice f: u.getInvoices()){
		 * System.out.println(f.getDescription()); } }
		 */
	}
}
