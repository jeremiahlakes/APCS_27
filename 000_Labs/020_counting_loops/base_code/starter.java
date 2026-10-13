/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = "Mark";
		System.out.println("Enter a number less than 10:");
		int x = sc.nextInt();
		while(x < 10){
			System.out.println(name + " is awesome!");
			x++;
		}



		
	}
}
