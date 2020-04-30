package rnd.java8features.methodreference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReferenceToConstructor {

	public static void main(String[] args) {
		Collection<Integer> integers = IntStream.range(1, 100)
		.boxed().collect(Collectors.toCollection( ArrayList::new ));
	Optional<Integer> max = integers.stream().reduce(Math::max); 
		max.ifPresent(System.out::println);
	}

}
