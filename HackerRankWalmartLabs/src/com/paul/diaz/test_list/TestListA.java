/**
 * 
 */
package com.paul.diaz.test_list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author paul
 *
 */
public class TestListA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Structure> listStruct = Arrays.asList(new Structure(1,"ABCD"),
				new Structure(2,"def"),
				new Structure(3,"ghi"),
				new Structure(4,"jkl"));
		
		
		listStruct.forEach(System.out::println);
		
		Function<Structure, Integer> byNum = str -> str.getNum();
		Function<Structure, String> byName = str -> str.getName();
		List<Structure> list =
		listStruct.stream().filter(obj -> obj.getNum() == 2).collect(Collectors.toList());
		list.forEach(System.out::println);

	}

}
