package rnd.y2020.practice.java8.features;

import java.util.stream.Stream;

public class EvenOddBySteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer>stream=Stream.of(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> even=stream.filter(i->i%2==0);
		even.forEach(System.out::print);
		
	}

}
