package quiz1.prob1;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";

	// sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE = (
			list, namelength, year) -> list.stream()
			.filter(e -> e.getName().length() > namelength)
			.filter(e -> e.getYearOfBirth() > year)
			.collect(Collectors.toList());

	public static Function<int[], OptionalInt> pr1 = (ints) -> IntStream.of(
			ints).max();

	public static Function<int[], Integer> pr2 = (ints) -> IntStream.of(ints)
			.reduce(0, (a, b) -> a * a + b * b);
	// iterate(0, ints.length -> Math.pow(ints, 2));

	public final static TriFunction<List<Employee>, Integer, Integer, List<Pair>> pr6 = (
			empl, low, up) -> empl
			.stream()
			.filter(em -> em.getSalary() > low)
			.filter(em -> em.getSalary() < up)
			// .sorted((Employee e1, Employee e2) -> (new Integer(e1.getName())
			// .compareTo(new Integer(e2.getName()))))
			.sorted(Comparator.comparing((Employee e1) -> e1.getName()))
			.sorted(Comparator.comparing((Employee e1) -> -e1.getSalary()))
			.map(em -> (new Pair(em.getName(), em.getSalary())))
			.collect(Collectors.toList());

	public final static Function<List<Transaction>, List<Trader>> pr7 = (
			transactions) -> transactions
			.stream()
			.sorted((Transaction i1, Transaction i2) -> (new Integer(i1
					.getValue()).compareTo(new Integer(i2.getValue()))))
			.filter(transaction -> transaction.getYear() == 2011)
			.map(transaction -> transaction.getTrader())
			.collect(Collectors.toList());

	public final static Function<List<Transaction>, List<Trader>> pr8 = (
			transactions) -> transactions
			.stream()
			.filter(tr -> tr.getTrader().getCity().equals("Cambridge"))
			.sorted((Transaction i1, Transaction i2) -> (new String(i1
					.getTrader().getName()).compareTo(new String(i2.getTrader()
					.getName())))).map(transaction -> transaction.getTrader())
			.collect(Collectors.toList());
}
