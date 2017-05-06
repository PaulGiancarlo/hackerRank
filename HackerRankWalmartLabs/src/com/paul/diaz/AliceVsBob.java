package com.paul.diaz;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class AliceVsBob {


	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	 
	        int arr_a[] = {a0,a1,a2};
	        int arr_b[] = {b0,b1,b2};
	        int alice = 0;
	        int bob = 0;
	        
	        System.out.println(Integer.compare(a0, b0));
	        
	        for (int i = 0; i < 3; i++) {
				
					if(Integer.compare(arr_a[i], arr_b[i]) == 1)
			        	alice++;
			        
					if(Integer.compare(arr_a[i], arr_b[i]) == -1)
				        	bob++;
				        
			       	
					
				
			}
	        
	        System.out.println(alice + " " + bob);
	        
	        
	        
	        
	        
	        
	        
//	        Comparator<Integer> compPoints = (a,b) -> alice.compareTo(bob);
//	        alice.stream().sorted((a,b) -> ((Comparable<Integer>) bob).compareTo(alice)).collect(toList());
	            
	    }
	
}
