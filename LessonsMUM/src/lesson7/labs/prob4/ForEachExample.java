package lesson7.labs.prob4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ForEachExample implements Consumer{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		new ForEachExample().output(list);
		
		System.out.println("=====");
		list.forEach((word) -> System.out.println(word.toUpperCase()));
		Function<List<String>, List<String>> func = (list1) -> list1.stream().map((word) -> word.toUpperCase()).collect(Collectors.toList());
		System.out.println(func.apply(list));
	}
	
	//implement a Consumer
	
	
}