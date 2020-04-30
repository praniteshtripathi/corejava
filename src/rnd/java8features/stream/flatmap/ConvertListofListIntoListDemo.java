package rnd.java8features.stream.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConvertListofListIntoListDemo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>>list= Arrays.asList(list1,list2,list3);
        List<Integer> list4= list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        list4.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
			   System.out.println("---------------------"+t);
			}
		});

	}

}
