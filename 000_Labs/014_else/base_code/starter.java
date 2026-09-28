/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		System.out.print("Please enter a second number: ");
		int num2 = sc.nextInt();
		if(num > num2) {
			System.out.println(num + " is greater than " + num2);
		}
		else if(num < num2) {
			System.out.println(num2 + " is greater than " + num);
		}
		else {
			System.out.println("The numbers are equal.");
		}
	}
}
