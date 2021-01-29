package rnd.y2020.practice.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Alex", "Brian", "Charles");
		Consumer<String> action=System.out::println;
		names.forEach(action);
		
		
		
	}

}
