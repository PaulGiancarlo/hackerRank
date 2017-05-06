package com.paul.diaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author paul
 */
public class HackerRank {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner in = new Scanner(System.in);
//        int n = in .nextInt();
//        int num;
        String firstStr ="abc",secondStr = "efg";
//        while(n>0){
//            
//            num = in.nextInt();
//            firstStr = in.nextLine();
//            secondStr = in.nextLine();
//            
//        n--;
//        }
//        
        Set<String> oldStringSet = new HashSet<String>() ;
        Set<String> newStringSet = new HashSet<String>() ;
        List<String> charList = Arrays.asList(firstStr.split(""));
        List<String> strs2 = Arrays.asList(secondStr.split(""));
        List<String> result = new ArrayList<>();
        
        Consumer<String> consumer = (String str) -> result.addAll(Arrays.stream(firstStr.split("",1)).map(s -> s+str).collect(Collectors.toList()));
        Arrays.stream(secondStr.split("",1)).forEach(consumer);
newStringSet.addAll(result);
        System.out.println(result);
        System.out.println(charList);
        
        System.out.println(newStringSet);
//        in.close();
    }

    
}
