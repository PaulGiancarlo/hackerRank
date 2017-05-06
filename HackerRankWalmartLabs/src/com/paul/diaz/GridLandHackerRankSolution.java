package com.paul.diaz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GridLandHackerRankSolution {

	
	public static String genWord(int n, String str1, String str2){
		StringBuilder sb = new StringBuilder();
		String chi1 = String.valueOf(str1.charAt(0));
		String chin = String.valueOf(str1.charAt(str1.length()-1));
		String chj1 = String.valueOf(str2.charAt(0));
		String chjn = String.valueOf(str2.charAt(str2.length()-1));
		String firstWord = str1+str2;
		System.out.println(" iniciales de cada palabra " + chi1+" "+ chin + " "+ chj1 + " "+ chjn);
		sb.append(firstWord);
//		sb.append();
		
		System.out.println("Primeras cadenas " + sb.toString() + " y su inversa " + sb.reverse().toString());
		sb.delete(0, 2*n);
		sb.append(chi1 + str1.substring(str1.indexOf(chi1)) + str2);
		
		System.out.println("valor del index " + str1.indexOf(chi1.substring(0)) + " substring  "+ str1.substring(1) );
		
		System.out.println("Primer camino " +sb.toString() +" inversa "+ sb.reverse().toString());
		
		List<String> listStr = Arrays.asList(str1,str2);
		
		
		
//		listStr.stream().filter(str -> str.charAt(str1.charAt(0)))
		
		
		return "";
	}
	
	public static String shuffle(String s) {
	    List<String> letters = Arrays.asList(s.split(""));
	    Collections.shuffle(letters);
	    StringBuilder t = new StringBuilder(s.length());
	    for (String k : letters) {
	        t.append(k);
	    }
	    return t.toString();
	}
	
	//metodo recursivo
	public static String printWords( String str1){
		String temp = str1;
		
		final int m = temp.length()/2;
		final int s = temp.length();
		temp = temp.substring(m,s) + temp.substring(0,m);
		//lamar al mismo metodo printWords( String str1)
		
		return temp;
	
	}
	
	
	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
	
	
	public static String swapMidWord(String str){
		int n = str.length();
		String s = "";
		if(n % 2 != 0 ){
			s = str.charAt(n-1) + str.substring(1, n-1) + str.charAt(0);
		}
		
		return s;
	}
	
	
	public static String reverseString(String str) {
	    int len = str.length();
	    return len<=1 ? str : (
	        reverseString(str.substring(len/2))+
	        reverseString(str.substring(0, len/2))
	    );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setStr = new HashSet<String>();
		List<String> strLst = Arrays.asList();
		
		
//		strLst.forEach(System.out::println);
		//genWord(3, "dab", "abd");
		String firtsWord = "dababd";
		
		System.out.println(printWords(firtsWord));
		
		//System.out.println("test  "+ swapMidWord("123"));
		setStr.add(printWords(firtsWord));
		
		System.out.println("reverse  " + reverseString(firtsWord));
		
	}

}
