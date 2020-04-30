package rnd.java8features.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class DoubleStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> doubles = DoubleStream.of(1,2d,3d,4d,5d)
                .boxed()
                .collect(Collectors.toList());
         
			System.out.println(doubles);
	}

}
