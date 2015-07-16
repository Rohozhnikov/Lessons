package lesson9.labs.prob8;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary2 {
	public static MyTriFunction<List<Employee>, Integer, Character, Long> mmm2 = (list, salasry, letter) -> list
			.stream().filter(s -> s.getSalary() > salasry).filter(s -> s.getLastName().charAt(0) > letter).count();

	// print a list of sorted full names - all upper case -- of Employees with
	// salary > 85000 and whose first name begins with a letter that comes
	// before the letter 'R'
	public static MyTriFunction<List<Employee>, Integer, Character, List<String>> nnn = (list, salasry, letter) -> list
			.stream().filter(s -> s.getSalary() > salasry).filter(s -> s.getFirstName().charAt(0) < letter)
			.map(s -> s.firstName.toUpperCase() + " " + s.lastName.toUpperCase()).sorted().collect(Collectors.toList());

}
