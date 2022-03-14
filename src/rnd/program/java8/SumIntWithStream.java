package rnd.program.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumIntWithStream {
    public static void main(String args[]){
        int n[]={1,2,33,44,45,56,9};
        //1
        int sum=IntStream.of(n).sum();
        System.out.println(sum);
        //method 2
        Integer no[]={1,2,3,4};
        int sum2=Stream.of(no).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum2);

        //method 3
        int sum3=Stream.of(no).reduce(0,(a,b)->a+b);
        System.out.println(3);
        //method 3
        int sum4=Stream.of(no).reduce(0,Integer::sum);
        System.out.println(sum4);
 //  sum
        int sum5=Stream.of(no).reduce(0,(a,b)->sum(a,b));
        System.out.println(sum5);

    }

    private static int sum(int a,int b){
        return a+b;
    }
}
