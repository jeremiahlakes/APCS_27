/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
        System.out.println("Enter another number: ");
        String input2 = sc.nextLine();
        System.out.println("You entered: " + input2);
        sc.close();
        if (input.equals(input % 2 == 0)) {
            System.out.println("Your number is even.");

        } else {
            System.out.println("Your number is odd.");
    }
}
