package rnd.java8features.stream.foreach;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
	 public static void main(String args[]) {
	 HashMap<String, Integer> map = new HashMap<>();
	 map.put("A", 1);
	 map.put("B", 2);
	 map.put("C", 3);
	 
	 BiConsumer<String,Integer> consumer= new BiConsumer<String, Integer>() {
		
		@Override
		public void accept(String t, Integer u) {
			System.out.println("key "+t);
			System.out.println("value "+u);
		}
	};
	 }
}
