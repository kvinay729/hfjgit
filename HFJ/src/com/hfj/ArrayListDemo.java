package com.hfj;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<ArrayListDemo> al = new ArrayList<ArrayListDemo>();
		ArrayListDemo d1 = new ArrayListDemo();
		al.add(d1);
		ArrayListDemo d2 = new ArrayListDemo();
		al.add(d2);
		int size = al.size();
		System.out.println(d1.toString()+","+d2+","+size);
		al.remove(d1);
		boolean contains = al.contains(d1);
		System.out.println(contains);
		int index = al.indexOf(d1);
		System.out.println(index);
		
		
	
		
 		
	}

}
