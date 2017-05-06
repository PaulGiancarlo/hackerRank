package com.paul.diaz.java_problems;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class JavaCurrencyFormatter {


	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        NumberFormat numf = //NumberFormat.getInstance(Locale.US).getCurrency() ;
	        
	        NumberFormat.getCurrencyInstance(new Locale("US"));
	        
	        numf.setCurrency(Currency.getInstance("USD"));
	        String currencyString = numf.format(payment);
	        System.out.println(currencyString);
	        
	        //numf.getCurrencyInstance(Locale.US);
	        String us = numf.format(payment);
	        
	        // Write your code here.
	        //numf.format(payment);
	        System.out.println("US: " + us);
	        //System.out.println("India: " + india);
	        //System.out.println("China: " + china);
	        //System.out.println("France: " + france);
	    }
	}