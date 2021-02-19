package rnd.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_Intger_Array_ToString_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]= {1,2,3};
		List<String> list=Arrays.stream(no).boxed().map(n->String.valueOf(n)).collect(Collectors.toList());
		list.forEach(System.out::println);	

	}

}
