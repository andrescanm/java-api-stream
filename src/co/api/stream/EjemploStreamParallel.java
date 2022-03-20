package co.api.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import co.models.User;

public class EjemploStreamParallel {
	public static void main(String[] args) {

		List<User> lista = new ArrayList<>();
		lista.add(new User("Andrés", "Guzmán"));
		lista.add(new User("Luci", "Martínez"));
		lista.add(new User("Pepe", "Fernández"));
		lista.add(new User("Cata", "Pérez"));
		lista.add(new User("Lalo", "Mena"));
		lista.add(new User("Exequiel", "Doe"));
		lista.add(new User("Bruce", "Lee"));
		lista.add(new User("Bruce", "Willis"));

		long t1 = System.currentTimeMillis();
		String resultado = lista.stream().parallel().map(u -> u.toString().toUpperCase()).peek(n -> {
			System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n);
		}).flatMap(nombre -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (nombre.contains("bruce".toUpperCase())) {
				return Stream.of(nombre);
			}
			return Stream.empty();
		}).findAny().orElse("");

		long t2 = System.currentTimeMillis();
		System.out.println("Tiempo total: " + (t2 - t1));
		System.out.println(resultado);
	}
}
