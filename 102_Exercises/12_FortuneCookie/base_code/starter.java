/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("You are about to receive a fortune cookie. Please enter your name: ");	
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hello, " + name + "! Here is your fortune cookie.");
		int a = (int)(Math.random()*5);
		if(a == 0){
			System.out.println("You will have a great day today!");
		}
		if(a == 1){
			System.out.println("You will find a new friend today!");
		}
		if(a == 2){
			System.out.println("You will have a great day today!");
		}
		if(a == 3){
			System.out.println("You will find a peace today!");
		}
		if(a == 4){
			System.out.println("You will have great luck today!");
		}
		if(a == 5){
			System.out.println("You will have success today!");
		}
	}
}
