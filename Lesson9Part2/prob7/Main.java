package Lesson9Part2.prob7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		System.out.println(Main.ordering1Fun.apply(list));
		
	}
	public static Function<List<Integer>,List<Integer>> ordering1Fun=(list)->
			list.stream()
			.sorted(Comparator.comparingInt(Math::abs))
			.collect(Collectors.toList());
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		System.out.println(Main.ordering2Fun.apply(words));
				
	}
	//Code By Adnan Shehzad
	// First Implementing the Reverse function and then calling that Function in another Function
	public static Function<String,String> reverse=(str)-> str==null|| str.isEmpty()?null: String.valueOf(new StringBuilder(str).reverse());
	public static Function<List<String>,List<String>> ordering2Fun=list->
			list.stream()
					.sorted(Comparator.comparing((String w) -> reverse.apply(w)).thenComparing((w1, w2) -> w1.compareTo(w2)))
			.collect(Collectors.toList());
}
