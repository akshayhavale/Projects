package com.java.example.array;

public class ArrayExample {

	// primitive data types
	// int, long, short, byte, char, String

	// Intialization and Instantiation

	public void printArray() {

		// 0 1 2 3 4 5 6 7 8 9
		int[] numbers = new int[2];
		numbers[0] = 1;
		numbers[1] = 5;

//		for (int i = 0; i <numbers.length; i++) {
//			System.out.println(numbers[i]);
//
//		}
//		
//		for(int i : numbers) {
//			System.out.println(i);
//		}

		
		String[] names = new String[5];
		
		names[0]="Pandurang".toUpperCase();
		names[1]="Niramla".toUpperCase();
		names[2]="Amrut".toUpperCase();
		names[3]="Priyanka".toUpperCase();
		names[4]="Akshay".toUpperCase();
//		names[5]="Havale";
		
		for(String name: names) {
			System.out.println(name);
		}
	}

}
