package lesson9.labs.prob4;

import java.util.stream.IntStream;

public class PrimeSquare {

	public static void main(String[] args) {
		printSquares(5);
	}

	public static void printSquares(int num) {
		IntStream intStream = IntStream.iterate(1, n -> n + 1).map(n -> n * n)
				.limit(num);
		intStream.forEach(System.out::println);
	}
}
