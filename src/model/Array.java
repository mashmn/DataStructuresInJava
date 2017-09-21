package model;

import java.util.Scanner;

public class Array {
	
	public void welcomeMsg() {		
		
		try {
			int length=lengthScanner();
			System.out.println("This is the length: " + length);
		}
		catch (NumberFormatException e) {
			System.out.println("Type length in numbers");
		}
		
		
	}
	
	public int lengthScanner() {
		System.out.println("What is the length of the Array you need?");
		Scanner array_length = new Scanner(System.in);			
		int length = array_length.nextInt();
		array_length.close();
		return length;
	}
	
}
