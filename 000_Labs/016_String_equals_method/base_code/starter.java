/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a wizard a Warrior or a Rogue?");
		String answer = sc.nextLine();
		if (answer.equals("wizard")|| answer.equals("Wizard")) {
			System.out.println("You are a wizard");
		}
		else if (answer.equals("Warrior")|| answer.equals("warrior")) {
			System.out.println("You are a Warrior");
		}
		else if (answer.equals("Rogue")|| answer.equals("rogue")) {
			System.out.println("You are a Rogue");
		}
		else {
			System.out.println("You are not a valid class");
		}
	}
}
