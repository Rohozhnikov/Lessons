package lesson9.labs.prob2;

import java.math.BigInteger;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskA {
	public static void main(String[] args) {

		final Stream<BigInteger> primes = Stream.iterate(BigInteger.valueOf(3), n -> n.nextProbablePrime()).limit(20);
		System.out.println(primes.collect(Collectors.toList()));
	}
}
