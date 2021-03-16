package com.java.example.palindrom;

public class PalindromeExample {

	public static void main(String args[]) {

		String words = "ABCDDCBA";

		int middleIndex = words.length() / 2;
		System.out.println(middleIndex);
		int lastIndex = words.length();
		System.out.println(lastIndex);
		int check = middleIndex - 1;
		System.out.println(check);
		
		
		for (int i = 0; i < middleIndex; i++) {

			char forwardChar = words.charAt(i);
			char backwardChar = words.charAt(lastIndex - 1);
			if (forwardChar == backwardChar) {
				if (check == i) {
					System.out.println("Yes Its Palindrome");
				}
				lastIndex--;
				continue;
			} else {
				System.out.println("Its not a plaindrome");
				break;
			}
		}

	}

}
