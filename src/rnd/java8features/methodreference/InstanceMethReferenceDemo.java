package rnd.java8features.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InstanceMethReferenceDemo {

	public static void main(String[] args) {
		List<String> strings = Arrays
		        .asList("how", "to", "do", "in", "java", "dot", "com");
		 
		List<String> sorted = strings
		        .stream()
		        .sorted((s1, s2) -> s1.compareTo(s2))
		        .collect(Collectors.toList());
		 
		System.out.println(sorted);
		 
		List<String> sortedAlt = strings
		        .stream()
		        .sorted(String::compareTo)
		        .collect(Collectors.toList());
		sortedAlt.forEach(System.out::print);
		//System.out.println(sortedAlt);
	}

}
