/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Rock Paper Scissors Game!");
        System.out.println("Please enter your name: ");
        String playerName = sc.nextLine();
        System.out.println("Hello, " + playerName + "! Let's start the game.");
        
        System.out.println("Please enter your choice (rock, paper, or scissors): ");
        String playerChoice = sc.nextLine().toLowerCase();
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice = choices[(int)(Math.random() * 3)];
        System.out.println("You chose: " + playerChoice);
        System.out.println("Computer chose: " + computerChoice);
if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }










        
        System.out.println("Thank you for playing, " + playerName + "!");







































































































































































































    }
}
