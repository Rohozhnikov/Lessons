package lesson9.labs.prob7b;

import java.util.List;

public class SecondSmallestMethod {

	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		T smallest = list.get(0);
		T secondSmollest = list.get(1);
		if (smallest.compareTo(secondSmollest) > 0) {
			T temp = smallest;
			smallest = secondSmollest;
			secondSmollest = temp;
		}

		for (int i = 2; i < list.size(); i++) {
			T next = list.get(i);
			if (next.compareTo(smallest) < 0) {
				secondSmollest = smallest;
				smallest = next;
			} else if (next.compareTo(secondSmollest) < 0) {
				secondSmollest = next;
			}
		}
		return secondSmollest;
	}
}
