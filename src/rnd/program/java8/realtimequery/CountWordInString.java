package rnd.program.java8.realtimequery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountWordInString {

    public static void main(String args[]){
        String str="This is my name . my name is pranitesh tripathi"  ;
        IntStream intStream = str.chars();
        Stream<Character> charsStream = intStream.mapToObj(ch -> (char) ch);
        Map<Character, Long> output = charsStream.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        output.forEach((k,v)->{
            if(v>2)
            System.out.println(k+"-----"+v);
        });
    }
}
