package com.paul.diaz;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KanguroJump {

	//288 9679 9653 99 		yes
	// 
	//43 2 70 2		no
	//
	//0 3 4 2		yes
	//
	//0 2 5 3		no
	//14 4 98 2
	//yes
	
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int max = Math.max(x1,x2) +1;
        Stream<Integer> axis, axis2;
        
        List<Integer> a = IntStream.iterate(x1, i -> i + v1).limit(max).boxed().collect(Collectors.toList());
        List<Integer> b = IntStream.iterate(x2, i -> i + v2).limit(max).boxed().collect(Collectors.toList());
       
        
        boolean xD = Collections.disjoint(b, a);
        System.out.println(max);
//      
//        if(xD== true){
//        	System.out.println("YES");
//        }else{
//        if(v2 > v1) 
//            System.out.println("NO");
//        
//        }

        
        //boolean x = b.contains(a.get(max-1));
        int x = 0;
        if(v2-v1 != 0)
        	x = (x2-x1)/(v1-v2);
     
        
        if(x > 0){
        	if (a.get(x).equals(b.get(x)) )
        		System.out.println("YES"); //+ "     " +a.get(it) +"    " + b.get(it));
        	else
            	System.out.println("NO");
        }
        else{
        	System.out.println("NO"); //+ "    " + a.get(it) + "    " + b.get(it)) ;

        }


        	System.out.println("El valor de x " + x + "   last a " + a.get(x) + " last b " + b.get(x));
        
//        axis = IntStream.iterate(x1, i -> i + v1).limit(max).boxed();
//        axis2 = IntStream.iterate(x2, i -> i + v2).limit(max).boxed();
//        axis.forEach(System.out::println);
//        axis2.forEach(System.out::println);
        
    }
}
