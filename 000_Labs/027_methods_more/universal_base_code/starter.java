 /*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// -------GLOBAL VARIABLES-------
		Scanner sc = new Scanner(System.in);

		System.out.println("This is the ATM");
		System.out.println("Please enter your Number info or name or name and initial deposit");
		if (sc.hasNextInt()) {
			int num = sc.nextInt();
			System.out.println("You entered a number: " + num);
		}
		else if (sc.hasNextDouble()) {
			double initialDeposit = sc.nextDouble();
			System.out.println("You entered an initial deposit: " + initialDeposit);
		}
		else if (sc.hasNextLine()) {
			String name = sc.nextLine();
			System.out.println("You entered a name: " + name);
		}
		else {
			System.out.println("Invalid input.");
		}
		System.out.println("Want to see your account balance? (yes/no)");
		String response = sc.next();
		if (response.equalsIgnoreCase("yes")|| response.equalsIgnoreCase("y")|| response.equalsIgnoreCase("sure")|| response.equalsIgnoreCase("ok")) {
			System.out.println("Your account balance is: $1000.00");
		}
		System.out.println("Do you want to see the rest of the account info? (yes/no)");
		String response2 = sc.next();
		if (response2.equalsIgnoreCase("yes")|| response2.equalsIgnoreCase("y")|| response2.equalsIgnoreCase("sure")|| response2.equalsIgnoreCase("ok")) {
			System.out.println("Account Number: 123456789");
			System.out.println("Account Holder: Michael Smith");
			System.out.println("Account Type: Checking");
			System.out.println("Account Balance: $1000.00");
		}
		else {
			System.out.println("Thank you for using the ATM.");
		}


		
	}
}
