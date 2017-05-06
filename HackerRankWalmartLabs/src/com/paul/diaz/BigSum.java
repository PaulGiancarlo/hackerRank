package com.paul.diaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        
        Scanner in = new Scanner(System.in);
		
        int n = in .nextInt();
        int i = 0;
		System.out.println("n    "+ n);
		List<Long> bigSum = new ArrayList<Long>();
	    while(n != i){
	         bigSum.add((long) in.nextInt());
	         i++;
	    }		
		
	    Long r = bigSum.stream().mapToLong(Long::longValue).sum();
	    		//bigSum.stream().reduce(0, (x,y) -> x+y);
	    		//bigSum.stream().mapToInt(Integer::intValue).sum();
	    
	    System.out.println(r);
	    bigSum.forEach(System.out::println);
//		int columns [] = new int[n];
//		String rows1[] = new String [n];
//		String rows2[] = new String [n];
//		for (int arr_i = 0; arr_i < n; arr_i++) {
//			columns[arr_i] = in.nextInt();
//			rows1[arr_i]   = in.next();
//			rows2[arr_i]   = in.next();
//		}
//		
//	    Scanner scan = new Scanner(System.in);
//	    ArrayList<Integer> list = new ArrayList<Integer>();
//	    System.out.print("Enter integers please ");
//	    System.out.println("(EOF or non-integer to terminate): ");
//
//	    while(scan.hasNextInt()){
//	         list.add(scan.nextInt());
    }
        
        
	

}
