package model.array;

import java.util.*;

import model.array.ArrayOps;

public class Array {	
	Scanner elementscan = new Scanner(System.in);
	public void welcomeMsg() {		
		
		try {
			
			int length=lengthScanner();
			
			if (length <= 2) {
				System.out.println("Sigh!!! Really! This is the length: " + length + "! -__-");
			}
			else {
				System.out.println("This is the length: " + length);
			}
			
			int numArray[]=new int[length];			
			System.out.println("Insert the elements next.\n");
			System.out.println("Enter element: ");
			
			for (int i = 0; i < length; i++) {				
				String temp = elementscan.next();				
				int tempparse = Integer.parseInt(temp);
				if (i < (length-1)) {
					System.out.println("Next one: ");
				}
				numArray[i] = tempparse;
			}
			
			System.out.print("The elements: ");
			
			for (int i = 0; i < length; i++) {
				System.out.print(numArray[i] + " ");
			}
			
			int AddDelUpdChoice = AddDelUpd();
			ArrayOps arrayOps = new ArrayOps();
			arrayOps.OperatorChoice(AddDelUpdChoice, numArray);
		}
		catch (NumberFormatException e) {
			System.out.println("Type length in numbers");
		}
	}
	
	public int lengthScanner() {
		System.out.println("What is the length of the Array you need?");
		System.out.println("Please try to type more than 2 elements! No one likes an oversmart fella!");
					
		int length = elementscan.nextInt();
		return length;
	}
	
	public int AddDelUpd() {
		System.out.println("What would you like to do next with this Array you created?");
		System.out.println("1. Add an element to this Array");
		System.out.println("2. Delete an element to this Array");
		System.out.println("3. Update an element to this Array");
					
		int addDelUpdChoice = elementscan.nextInt();
		return addDelUpdChoice;
	}
	
}
