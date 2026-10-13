/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int cash = 100;

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the slot machine! You have $100 to start with.");
		System.out.println("How much would you like to bet? (Enter a number between 1 and 100)");
		int bet = sc.nextInt();
		System.out.println("You bet $" + bet);
		System.out.println("Spinning the reels...");
		while (true) {
			int reel1 = (int)(Math.random() * 8);
			int reel2 = (int)(Math.random() * 8);
			int reel3 = (int)(Math.random() * 8);

			System.out.println("Reel 1: " + reel1);
			System.out.println("Reel 2: " + reel2);
			System.out.println("Reel 3: " + reel3);

			if (reel1 == reel2 && reel2 == reel3) {
				System.out.println("You win! You get $" + (bet * 10));
				cash += bet * 10;
			} else {
				System.out.println("You lose! You lose $" + bet);
				cash -= bet;
			}

			System.out.println("You now have $" + cash);
			if (cash <= 0) {
				System.out.println("You are out of money! Game over.");
				break;
			}

			System.out.println("Would you like to play again? (yes/no)");
			String response = sc.next();
			if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("y")) {
				break;
			}

			System.out.println("How much would you like to bet? (Enter a number between 1 and " + cash + ")");
			bet = sc.nextInt();
		};
	}
}
