package rnd.java8features.stream;

import java.util.stream.Stream;

public class StreamOfValueDemo {
	 public static void main(String[] args)
     {
         Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> {
        	 System.out.print(p);
        	 System.out.print("   ");
         });
         
         //------------------------------------------------
         System.out.println();
         
         Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
         stream1.forEach(p -> {
        	 System.out.print(p);
        	 System.out.print("   ");
         	});
     }
}
