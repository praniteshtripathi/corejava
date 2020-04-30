package rnd.java8features.stream.foreach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ListForEachDemo {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("a","c","b","e","d","f","g");
		Consumer<String>action=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				t=t.toUpperCase();
				System.out.println(t);
			}
		};
		
		list.sort((String v1,String v2)->{
				return v1.compareTo(v2);
			}
		);
		
		list.forEach(action);
		

	}

}
