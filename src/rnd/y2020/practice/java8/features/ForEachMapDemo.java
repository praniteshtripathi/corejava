package rnd.y2020.practice.java8.features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachMapDemo {

	public static void main(String[] args) {
		/*
		BiConsumer<? super String, ? super String> action = (a, b) -> 
		{ 
		    //Process the entry here as per business
		    System.out.println("Key is : " + a); 
		    System.out.println("Value is : " + b); 
		}; 
		*/
		
		Map<String, String> map = new HashMap<String, String>();
		 
		map.put("A", "Alex");
		map.put("B", "Brian");
		map.put("C", "Charles");
		map.forEach((k,v)->{
			System.out.println("key is: "+k);
			System.out.println("value is: "+v);
		});

	}

}
