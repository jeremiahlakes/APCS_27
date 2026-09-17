/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Hello welcome to the pizza planet!");
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Nice to meet you, " + name + "!");
		System.out.println("We serve pizza, pasta, and salad. What would you like to  order?");
		String order = sc.nextLine();
 		System.out.println("You ordered: " + order);
		System.out.println("Thank you for your order, " + name + "! Your " + order + " will be ready shortly.");
	}
}