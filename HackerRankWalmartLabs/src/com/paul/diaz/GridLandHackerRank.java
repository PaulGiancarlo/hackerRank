package com.paul.diaz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GridLandHackerRank {
	/*
	3
	1
	a
	a
	3
	dab
	abd
	5
	ababa
	babab
	 */

//
//	public static String printWords( String str1){
//		String temp = str1;
//
//		final int m = temp.length()/2;
//		final int s = temp.length();
//		temp = temp.substring(m,s) + temp.substring(0,m);
//
//		return temp;
//
//	}
//
//	public static String swapMidWord(String str){
//		int n = str.length();
//		String s = "";
//		if(n % 2 != 0 ){
//			s = str.charAt(n-1) + str.substring(1, n-1) + str.charAt(0);
//		}
//
//
//		return s;
//	}

	public static void main(String[] args) {
		// TODO code application logic here

		Scanner in = new Scanner(System.in);
		int n = in .nextInt();
		int columns [] = new int[n];
		String rows1[] = new String [n];
		String rows2[] = new String [n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			columns[arr_i] = in.nextInt();
			rows1[arr_i]   = in.next();
			rows2[arr_i]   = in.next();
		}
		System.out.println("Size of n " + n);
		for (int arr_i = 0; arr_i < n; arr_i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(rows1[arr_i]);
			sb.append(new StringBuffer(rows2[arr_i]).toString());
			StringBuilder sb1 = new StringBuilder();
			sb1.append(rows2[arr_i]);
			sb1.append(new StringBuffer(rows1[arr_i]).toString());


			HashSet<String> genWords = new HashSet<String>();
			String s = sb.toString();
			String s1 = sb1.toString();

			String reversed = sb.reverse().toString();
			String reversed1= sb1.reverse().toString();

			int num = s.length();

			for (int i = 0; i < num; i++) {

				genWords.add(s);
				genWords.add(s1);
				genWords.add(reversed1);
				genWords.add(reversed);

				String sl = s.substring(i);
				String sl1 = s1.substring(i);

				if (i !=0 ) {
					String sr = s.substring(0, i);
					String sr1 = s1.substring(0, i);

					genWords.add(sl+sr);
					genWords.add(sl1 + sr1);
			} 
				else{
					genWords.add(sl);
					genWords.add(sl1);

				}
			}


//			genWords.stream().filter(str -> (str.length() == num)).collect(Collectors.toSet());
			System.out.println(genWords.size());
//			genWords.forEach(System.out::println);

		}

		in.close();   
	}


}
