package lesson8.labs.prob4;

import java.util.List;

import lesson8.lecture.filter.Folks;

public class Good {
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(word -> word.length() == len)
				.filter(word -> word.contains(String.valueOf(c)))
				.filter(word -> !word.contains(String.valueOf(d)))
				.count();
	}

	public static void main(String[] args) {

		Good good = new Good();
		System.out.println(Folks.friends);
		System.out.println(good.countWords(Folks.friends, 'a', 'r', 4));
		System.out.println(String.format("", good.countWords(Folks.friends, 'c', 'd', 4)));
		System.out.println(Folks.editors);
		System.out.println(good.countWords(Folks.editors, 'a', 'r', 4));
		System.out.println(String.format("", good.countWords(Folks.editors, 'c', 'd', 4)));
		System.out.println(Folks.comrades);
		System.out.println(good.countWords(Folks.comrades, 'a', 'r', 4));
		System.out.println(String.format("", good.countWords(Folks.comrades, 'c', 'd', 4)));
	}
}
