package rnd.java8features.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ListStreamDemo {
	public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 10; i> 0; i--){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        //stream.forEach(p -> System.out.println(p));
        stream.sorted().forEach(p->System.out.println(p));
    }
}
