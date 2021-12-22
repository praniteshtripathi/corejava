package rnd.ds.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStream {

    public static void main(String args[]){
        Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };

        List<Integer> listWithoutDuplicates = Arrays.stream(origArray)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listWithoutDuplicates);
    }
}
