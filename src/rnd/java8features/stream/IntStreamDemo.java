package rnd.java8features.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		//Get the collection and later convert to stream to process elements
		List<Integer> ints = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .collect(Collectors.toList());
		         
		System.out.println(ints);
		 
		//Stream operations directly
		Optional<Integer> max = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .max(Integer::compareTo);
		 
		System.out.println(max.get());
	}

}
