package lesson8.lecture.lambdaexamples.bifunction;

import java.util.function.BiFunction;

public class FunctionExample {
	/*
	 * public static void main(String[] args) { BiFunction<Integer, Integer,
	 * Integer> f = (x,y) -> 2*x - y; System.out.println(f.apply(2, 3)); }
	 */
	public static void main(String[] args) {
		class MyBiFunction implements BiFunction<Integer, Integer, Integer> {
			public Integer apply(Integer x, Integer y) {
				return 2 * x.intValue() - y.intValue();
			}
		}
		BiFunction<Integer, Integer, Double> power = (Integer i1, Integer i2) -> Math.pow(i1, i2);
		MyBiFunction f = new MyBiFunction();
		System.out.println(power.apply(2, 3)); // output 1
//		(x,y) -> {List<Double> list = new ArrayList<>(); 
//		list.add(Math.pow(x,y)); 
//		list.add(x * y);
//		return list;
//		};
	}

}