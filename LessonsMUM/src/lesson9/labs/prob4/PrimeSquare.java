package lesson9.labs.prob4;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeSquare {
	
	public static void main(String[] args) {
		printSquares(5);
	}

	public static void printSquares(int num){
		IntStream intStream = IntStream.iterate(1,n ->n+BigInteger.ONE.nextProbablePrime().intValue()).limit(num*num);
		 	System.out.println(intStream.toArray());
//		 	System.out.println(intStream.toArray().toString());
		 	System.out.println(intStream);
		 	System.out.println(intStream.count());
		 	System.out.println(intStream.toString());
	}
}
