package co.api.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamIntStream {

	public static void main(String[] args) {

		IntStream numbers = IntStream.range(1, 6).peek(System.out::println);
		IntSummaryStatistics result = numbers.summaryStatistics();
		System.out.println("SUM: " + result.getSum());
		System.out.println("MAX: " + result.getMax());
		System.out.println("MIN: " + result.getMin());
		System.out.println("AVG: " + result.getAverage());
		System.out.println("COUNT: " + result.getCount());

		IntStream numbers2 = IntStream.of(3, 45, 6, 7, 214, 74536, 7, 4).peek(System.out::println);
		IntSummaryStatistics result2 = numbers2.summaryStatistics();
		System.out.println("SUM: " + result2.getSum());
		System.out.println("MAX: " + result2.getMax());
		System.out.println("MIN: " + result2.getMin());
		System.out.println("AVG: " + result2.getAverage());
		System.out.println("COUNT: " + result2.getCount());
	}

}
