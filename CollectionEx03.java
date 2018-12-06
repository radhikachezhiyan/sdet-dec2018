package com.training.sdet.day3.collection;

import java.util.Vector;

// program to how vector works
public class CollectionEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(5,7);
		
		System.out.println("Size of the vector: "+vector.size());
		System.out.println("Capacity of the vector: "+vector.capacity());
		
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		vector.add("One");
		vector.add("Two");
		vector.add("Three");
		vector.add("Four");
		vector.add("Five");
		
		System.out.println("Size of the vector: "+vector.size());
		System.out.println("Capacity of the vector: "+vector.capacity());
	}
}
