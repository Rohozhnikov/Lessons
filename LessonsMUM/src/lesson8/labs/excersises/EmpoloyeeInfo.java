package lesson8.labs.excersises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import lesson7.labs.prob4.Consumer;

public class EmpoloyeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	/*
	 * Example: (String x) -> x.toUpperCase() Function<String, String> toUpper1
	 * = (String x) -> x.toUpperCase(); Function<String, String> toUpper2 =
	 * String::toUpperCase;
	 */

	/*
	 * A. (Employee e) -> e.getName() B. (Employee e,String s) -> e.setName(s)
	 * C. (String s1,String s2) -> s1.compareTo(s2) D. (Integer x,Integer y) ->
	 * Math.pow(x,y) E. (Apple a) -> a.getWeight() F. (String x) ->
	 * Integer.parseInt(x); 
	 * G. EmployeeNameComparator comp = new EmployeeNameComparator(); (Employee e1, Employee e2) -> comp.compare(e1,e2)
	 */
	public static void main(String[] args) {
		/* a */Function<Employee, String> getName = (Employee e) -> e.getName();
		/* b */BiConsumer<Employee, String> name = (Employee e, String s) -> e.setName(s);
		/* c */BiFunction<String, String, Integer> compare = (String s1, String s2) -> s1.compareTo(s2);
		/* d */BiFunction<Integer, Integer, Double> pow = (Integer x, Integer y) -> Math.pow(x, y);
		/* e */Function<Apple, Integer> weight = (Apple a) -> a.getWeight();
		/* f */Function<String, Integer> parse = (String x) -> Integer.parseInt(x);
		/* g */EmployeeNameComparator comp = new EmployeeNameComparator(); 
		
		BiFunction<Employee, Employee, Integer> comps = (Employee e1, Employee e2) -> comp.compare(e1, e2);
		Employee empl = new Employee();
				empl.setName("aello");
				Employee empl1 = new Employee();
				empl1.setName("dello");
		
				List<Employee> emp = new ArrayList<Employee>();
				emp.add(empl);
				emp.add(empl1);
				System.out.println(comps.apply(empl, empl1));
				
				Comparator<Employee> nameComparator = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
				Collections.sort(emp, nameComparator);
				emp.forEach(a -> System.out.println(a.getName()));
				System.out.println("------");
		
		name.accept(empl, "hello");
		name.accept(empl, "hello2");
		System.out.println(empl.getName());
		System.out.println(getName.apply(empl));
		System.out.println(compare.apply("hello1", "hello2"));
		System.out.println(pow.apply(3, 3));
		System.out.println(weight.apply(new Apple()));
		System.out.println(parse.apply("25"));
		System.out.println("---");
		System.out.println(comps.apply(empl,empl1 ));

	}
}

class EmployeeNameComparator implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		return e1.getName().compareTo(e2.getName());
	}

}
class eveluator{
	void evaluator(){
		Function<String, String> toUpper2 = (String e) -> e.toUpperCase()	;
		System.out.println(toUpper2.apply("hello"));
	}
}

class Apple {
	int weight = 3;

	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

}

class Employee {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String s) {
		this.name = s;
	}

}