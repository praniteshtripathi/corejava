package rnd.y2020.practice.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMapMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		//memberNames.add("Lokesh");
		// filter from stream
		/*
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);
		*/
		// Stream.map()
		/*
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);  
        */
		/*
		//Stream.sorted()
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
		*/
		
		/*
		 * Stream.collect()
		 * 
		 */
		
		/*List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

			System.out.print(memNamesInUppercase);
			*/
		/*
		boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		
		matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
			
		matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		
		
		//Stream.count()
		
		long totalMatched = memberNames.stream()
			    //.filter((s) -> s.startsWith("A"))
			    .count();
			 
			System.out.println(totalMatched);
			*/
		
		//Stream.reduce()
		
		
		Optional<String> reduced = memberNames.stream()
		        .reduce((s1,s2) -> s1 + "#" + s2);
		 
		reduced.ifPresent(System.out::println);
			
	}

}
