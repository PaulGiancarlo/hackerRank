package com.paul.diaz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.*;
public class Mini_MaxSum {

	//1 2 3 4 5

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();


		List<Long>nlist = Arrays.asList(new Long(a),
				new Long(b),
				new Long(c),
				new Long(d),
				new Long(e));


		//nlist.stream().sorted().collect(Collectors.toList());
		nlist.forEach(System.out::println);
		Long sumMax = nlist.stream().mapToLong(Long::longValue).sum();

		System.out.println("sun max es " + sumMax);		
		List<Long> result = Arrays.asList(new Long(0),
				new Long(0),
				new Long(0),
				new Long(0));
		
		System.out.println("temp////////////");
		List<Long> temp = null;
		
		temp =  nlist.stream().filter(i -> !nlist.get(0).equals( nlist.get(nlist.indexOf(i)))).collect(Collectors.toList());
		temp.forEach(System.out::println);
		
		System.out.println("temp////////////");
		result = Arrays.asList(new Long(nlist.stream().filter(i -> !nlist.get(0).equals( i)).collect(Collectors.toList())
				.stream().mapToLong(Long::longValue).sum())
				,new Long(nlist.stream().filter(i -> !nlist.get(1).equals( i)).collect(Collectors.toList())
						.stream().mapToLong(Long::longValue).sum())
				,new Long(nlist.stream().filter(i -> !nlist.get(2).equals( i)).collect(Collectors.toList())
						.stream().mapToLong(Long::longValue).sum())
				,new Long(nlist.stream().filter(i -> !nlist.get(3).equals( i)).collect(Collectors.toList())
						.stream().mapToLong(Long::longValue).sum())
				,new Long(nlist.stream().filter(i -> !nlist.get(4).equals( i)).collect(Collectors.toList())
						.stream().mapToLong(Long::longValue).sum())
				); 

		result.forEach(System.out::println);
		System.out.println(
				result.stream().min(Long::compare).get()+" "+result.stream().max(Long::compare).get()
				);
	
	///////////////////
		
		int n= nlist.size();
		 List<Long> resV2;
		    int fence = IntStream.range(0, n).peek(x -> System.out.println("Valor consultado " + x))
		                         .filter(idx -> nlist.get(idx).equals(nlist.get(idx))) // leave only B's
		                         .skip(n-1)
		                         .findFirst() // an index of n-th B
		                         .getAsInt(); // with throw NoSuchElementException if not enough B's
		     resV2 = nlist.subList(0, fence);
		
	
	System.out.println("v2 -------- fence " + fence);
	resV2.forEach(System.out::println);
	

	
	
	}


}
