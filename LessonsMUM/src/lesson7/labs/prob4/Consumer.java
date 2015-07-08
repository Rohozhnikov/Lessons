package lesson7.labs.prob4;

import java.util.List;

public interface Consumer {
	
	default void output(List<String> lists){
		lists.stream().forEach((list) -> {System.out.println(list);});
	}

}
