package lesson9.labs.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSectionMethod {

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n+1);
	}

	public static void main(String[] args) {
		System.out.println(
				streamSection(Arrays.asList("a", "b", "c", "d", "e").stream(), 2, 3).collect(Collectors.toList()));
	}
}
