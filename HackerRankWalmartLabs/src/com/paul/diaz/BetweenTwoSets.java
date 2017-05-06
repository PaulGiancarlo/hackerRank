package com.paul.diaz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets {
//int minIdx = IntStream.range(0,list.size())
//    .reduce((i,j) -> list.get(i) > list.get(j) ? j : i)
//    .getAsInt();  // or throw
	
	
//	buscamos un entero positivo que cumple las condifciones de ser factor en los dos conjuntos
//ref > https://www.hackerrank.com/challenges/between-two-sets?h_r=next-challenge&h_v=zen	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] b = new int[m];
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	        }
	        
	        Set<Integer> setA = Arrays.stream(a).boxed().collect(Collectors.toSet());
	        Set<Integer> setB = Arrays.stream(b).boxed().collect(Collectors.toSet());
	        
	        int min = setA.stream().min(Integer::min).get();
	        int max = setA.stream().max(Integer::max).get();
	        int minb = setB.stream().min(Integer::min).get();
	        int maxb = setB.stream().max(Integer::max).get();
	        int mcm = IntStream.rangeClosed(1, min).filter(factor -> (factor * max) % min == 0 )
	        			.map(factor -> Math.abs(factor * max))
	        			.findFirst().getAsInt();
	        
	        int mcm2 = IntStream.rangeClosed(1, minb).filter(factor -> (factor * maxb) % minb == 0 )
        			.map(factor -> Math.abs(factor * maxb))
        			.findFirst().getAsInt();
	        
	        
	        System.out.println("mcm " + mcm + " max " + max + " min " + min);
	        System.out.println("mcm " + mcm2 + " max " + maxb + " min " + minb);
	        
	        int mcda = gcd(a);
	        int lmca= lcm(a);
	        
	        int mcdb = gcd(b);
	        int lmcb= lcm(b);
	        
	        System.out.println("mcda  "+mcda);
	        System.out.println("lcma  "+lmca);
	        System.out.println("mcdb  "+mcdb);
	        System.out.println("lcmb  "+lmcb);
	}
	
	private static int gcd(int x, int y) {
	    return (y == 0) ? x : gcd(y, x % y);
	}

	public static int gcd(int... numbers) {
	    return Arrays.stream(numbers).reduce(0, (x, y) -> gcd(x, y));
	}

	public static int lcm(int... numbers) {
	    return Arrays.stream(numbers).reduce(1, (x, y) -> x * (y / gcd(x, y)));
	}

}
