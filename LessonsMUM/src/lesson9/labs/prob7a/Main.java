package lesson9.labs.prob7a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
			IntStream ones = IntStream.generate(() -> 1).distinct();
//			Stream<String> echoes = Stream.generate(() -> “Echo”);
			System.out.println("------------");
			IntStream zeroToNinetyNine = IntStream.range(0, 100);
			System.out.println(zeroToNinetyNine);
			IntStream zeroToNinetyNine1 = IntStream.rangeClosed(0, 100);
			System.out.println(zeroToNinetyNine1.toString());
			
//			ones.forEach(System.out::println);
		//your stream pipeline here
			
			System.out.println("-----2--");
			System.out.println(list.stream()
			.filter(s ->s.salary > 100000)
			.filter(s ->s.lastName.charAt(0)>'M')
			.map(s -> s.firstName+" "+s.lastName)
			.collect(Collectors.joining(", ")));
	}

}
