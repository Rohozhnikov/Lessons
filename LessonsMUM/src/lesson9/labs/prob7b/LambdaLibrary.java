package lesson9.labs.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static TriFunction<List<Employee>, Integer, Character, String> mmm = (list, salasry, letter) ->
			list.stream()
			.filter(s ->s.salary > salasry)
			.filter(s ->s.lastName.charAt(0)>letter)
			.map(s -> s.firstName+" "+s.lastName)
			.collect(Collectors.joining(", "));
			
}
