package lesson9.labs.prob2;

import java.math.BigInteger;
import java.util.stream.Stream;

public class TaskB {

	public static void main(String[] args) {
		printFirstNPrimes(5);
	}

	public static void printFirstNPrimes(long n) {
		System.out.println(BigInteger.valueOf(n).nextProbablePrime().intValue());
	}
}
