/*
 *	Author: Jeremiah Lakes
 *  Date: September 24 2026
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		sc.nextLine();
		var a = (int)(Math.random()*3)+1;
		
		if (a == 1){
			System.out.println("The first hint is that the word is a type of fruit.");
			sc.nextLine();
			System.out.println("The second hint is that the word is commonly found in a tree.");
			sc.nextLine();
			System.out.println("What is your guess?");
			String guess = sc.nextLine();
			if (guess.equals("apple") || guess.equals("Apple")){
				System.out.println("You guessed the word correctly!");
			}
			else{
				System.out.println("You guessed the word incorrectly.");
			}
		}
		else if (a == 2){
			System.out.println("The first hint is that the word is a type of fruit.");
			sc.nextLine();
			System.out.println("The second hint is that the word is commonly found in tropical regions.");
			sc.nextLine();
			System.out.println("What is your guess?");
			String guess = sc.nextLine();
			if (guess.equals("banana") || guess.equals("Banana")){
				System.out.println("You guessed the word correctly!");
			}
			else{
				System.out.println("You guessed the word incorrectly.");
			}
		}
		else if (a == 3){
			System.out.println("The first hint is that the word is a type of fruit.");
			sc.nextLine();
			System.out.println("The second hint is that the word is commonly found in a bush and its a type of berry.");
			sc.nextLine();
			System.out.println("What is your guess?");
			String guess = sc.nextLine();
			if (guess.equals("blueberry") || guess.equals("Blueberry")){
				System.out.println("You guessed the word correctly!");
			}
			else{
				System.out.println("You guessed the word incorrectly.");
			}
		}
	}
}