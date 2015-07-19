package lesson9.labs.prob1;

import java.util.stream.IntStream;

public class TaskA {

	public static void main(String[] args) {
		IntStream ones = IntStream.generate(() -> 1).limit(20).distinct();
		ones.forEach(System.out::println);
	}
}
