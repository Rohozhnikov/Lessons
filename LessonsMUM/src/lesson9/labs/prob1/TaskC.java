package lesson9.labs.prob1;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskC {

	public static void main(String[] args) {
//		Stream<Integer> intStream = Stream.of(3,3,2,1);
		Stream<Integer> intStream = Arrays.asList(3,3,2,1).stream();
		
		IntSummaryStatistics summaryStatistics = intStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("getSum = " + summaryStatistics.getSum());
		System.out.println("getAverage = " + summaryStatistics.getAverage());
		System.out.println("getMin = " + summaryStatistics.getMin());
		System.out.println("getMax = " + summaryStatistics.getMax());
		System.out.println("getCount = " + summaryStatistics.getCount());
	}
}
