package lesson7.labs.prob4;

import java.util.Arrays;
import java.util.List;


public class ForEachExample implements Consumer{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		new ForEachExample().output(list);
	}
	
	//implement a Consumer
	
	
}