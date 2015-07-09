package lesson8.lecture.comparator2;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if (!e1.name.equals(e2.name)) {
			return e1.name.compareTo(e2.name);
		} else {
			if (e1.salary != e2.salary) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
