package rnd.java8features.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMapDemo {

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
		
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
		System.out.println();
		memberNames.stream().sorted().forEach(System.out::println);
	}

}
