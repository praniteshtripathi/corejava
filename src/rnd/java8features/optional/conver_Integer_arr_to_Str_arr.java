package rnd.java8features.optional;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class conver_Integer_arr_to_Str_arr {

	public static void main (String[] args)
    {
        // input primitive integer array
        int[] intArray = { 1, 2, 3, 4, 5 };
        
       String [] str=Arrays.stream(intArray).mapToObj(String::valueOf).toArray(String[]::new);
       System.out.println(Arrays.toString(str));
       
       Stream<String> str1=Arrays.stream(intArray).mapToObj(String::valueOf);
       str1.collect(Collectors.toList()).forEach(System.out::println);
       
    }
}
