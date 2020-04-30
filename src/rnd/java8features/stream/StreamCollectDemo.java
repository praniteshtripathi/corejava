package rnd.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
		memNamesInUppercase.forEach(System.out::println);
		
		
	}

}
