/*
 *	Author: Jeremiah Lakes
 *  Date: Sep 17 2026
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.print("Enter a Integer: ");
		int num = input.nextInt();
		System.out.println("You entered: " + num);
		System.out.print("Enter a second Integer: ");
		int num2 = input.nextInt();
		System.out.println("You entered: " + num2);
		System.out.println("your range is " + num + " to " + num2);
		System.out.println("Random number between " + num + " and " + num2 + ": " + (int)(Math.random() * (num2 - num + 1) + num) + ", " + (int)(Math.random() * (num2 - num + 1) + num) + ", " + (int)(Math.random() * (num2 - num + 1) + num) + ", " + (int)(Math.random() * (num2 - num + 1) + num) + ", " + (int)(Math.random() * (num2 - num + 1) + num));
	}
}
