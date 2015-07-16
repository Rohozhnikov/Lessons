package lesson9.labs.prob6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionMethod {
	public static Set<String> union(List<Set<String>> sets) {
		return sets.stream().reduce((a,b) ->{a.addAll(b); return a;}).get();
	}
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("asf");
		s.add("sdfsaf");
		Set<String> s1 = new HashSet<>();
		s1.add("dd");
		s1.add("vv");
		Set<String> s2 = new HashSet<>();
		s2.add("fff");
		s2.add("bb");
		List<Set<String>> sss = new ArrayList<>();
		
		sss.add(s2);
		sss.add(s1);
		sss.add(s);
		System.out.println(union(sss));
	}
}
