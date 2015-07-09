package lesson8.labs.prob4;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import lesson8.lecture.filter.Folks;

@FunctionalInterface
interface FourFunction<S, T, U, V, R> {
	R apply(S s, T t, U u, V v);
}

public class Best {
	final BiFunction<List<String>, String, List<String>> listStartsWith = (list, letter) -> list.stream()
			.filter(name -> name.startsWith(letter)).collect(Collectors.toList());

	final List<String> friendsStartN = listStartsWith.apply(Folks.friends, "N");

	final List<String> friendsStartB = listStartsWith.apply(Folks.friends, "B");

	final FourFunction<List<String>, Character, Character, Integer, Long> f = (list, contain, dontContain,
			length) -> list.stream().filter((word) -> word.contains(String.valueOf(contain)))
					.filter((word) -> !word.contains(String.valueOf(dontContain)))
					.filter((word) -> word.length() == length).count();

	public static void main(String[] args) {
		Best best = new Best();
		System.out.println(Folks.friends);
		System.out.println(best.f.apply(Folks.friends, 'a', 'd', 4));
		System.out.println(Folks.editors);
		System.out.println(best.f.apply(Folks.editors, 'c', 'd', 4));
		System.out.println(Folks.comrades);
		System.out.println(best.f.apply(Folks.comrades, 'c', 'd', 4));
	}
}
