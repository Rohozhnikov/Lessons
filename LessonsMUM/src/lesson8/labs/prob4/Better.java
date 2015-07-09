package lesson8.labs.prob4;

import java.util.function.Function;
import java.util.function.Predicate;

import lesson8.lecture.filter.Folks;

public class Better {
	final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);

	final Function<String, Predicate<String>> contains = letter -> word -> word.contains(letter);
	final Function<String, Predicate<String>> dontContains = letter -> word -> !word.contains(String.valueOf(letter));
	final Function<Integer, Predicate<String>> wordLength = length -> word -> word.length() == length;

	final long contianA = Folks.editors.stream().filter(contains.apply(String.valueOf('a')))
			.filter(dontContains.apply(String.valueOf('r'))).filter(wordLength.apply(4)).count();
	final long contianA1 = Folks.friends.stream().filter(contains.apply(String.valueOf('a')))
			.filter(dontContains.apply(String.valueOf('r'))).filter(wordLength.apply(4)).count();
	final long contianA2 = Folks.comrades.stream().filter(contains.apply(String.valueOf('a')))
			.filter(dontContains.apply(String.valueOf('r'))).filter(wordLength.apply(4)).count();

	public static void main(String[] args) {
		Better better = new Better();
		
		System.out.println(Folks.editors);
		System.out.println(better.contianA);
		System.out.println(Folks.friends);
		System.out.println(better.contianA1);
		System.out.println(Folks.comrades);
		System.out.println(better.contianA2);
//		System.out.println(good.countWords(Folks.friends, 'a', 'r', 4));
//		System.out.println(String.format("", good.countWords(Folks.friends, 'c', 'd', 4)));
//		System.out.println(good.countWords(Folks.editors, 'a', 'r', 4));
//		System.out.println(String.format("", good.countWords(Folks.editors, 'c', 'd', 4)));
//		System.out.println(good.countWords(Folks.comrades, 'a', 'r', 4));
//		System.out.println(String.format("", good.countWords(Folks.comrades, 'c', 'd', 4)));
	}
}
