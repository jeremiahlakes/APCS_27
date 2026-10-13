/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		int number = (int)(Math.random() * 1000) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 1000:");
		int guess = sc.nextInt();

		while (guess != number) {
			if (guess < number) {
				System.out.println("your guess is too low");
			} else if (guess > number) {
				System.out.println("your guess is too high");
			}
			System.out.println("Guess again:");
			guess = sc.nextInt();
		}

		System.out.println("You guessed the number!");

		
	}
}
