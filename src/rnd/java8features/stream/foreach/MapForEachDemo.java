package rnd.java8features.stream.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapForEachDemo {
     public static void main(String args[]) {
    	 HashMap<String, Integer> map = new HashMap<>();
    	 map.put("A", 1);
    	 map.put("B", 2);
    	 map.put("C", 3);
    	 
    	 //To print key and value
    	 Consumer<Map.Entry<String, Integer>> action = System.out::println;
    	 map.entrySet().forEach(action);
    	 
    	 // To print key
    	 Consumer<String> actionOnKeys = System.out::println;
    	 map.keySet().forEach(actionOnKeys);
    	 
    	 //To print value;
    	 
    	//3. Map values
    	 Consumer<Integer> actionOnValues = System.out::println;
    	 map.values().forEach(actionOnValues);
    	 
    	 
    	 
     }

}
