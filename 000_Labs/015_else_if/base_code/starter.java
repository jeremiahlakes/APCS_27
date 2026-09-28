/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter a number between 1 and 11");
		int num = sc.nextInt();
		
		if(num == 1){
			System.out.println("You entered one");
		}
		else if(num == 2){
			System.out.println("You entered two");
		}
		else if(num == 3){
			System.out.println("You entered three");
		}
		else if(num == 4){
			System.out.println("You entered four");
		}
		else if(num == 5){
			System.out.println("You entered five");
		}
		else if(num == 6){
			System.out.println("You entered six");
		}
		else if(num == 7){
			System.out.println("You entered seven");
		}
		else if(num == 8){
			System.out.println("You entered eight");
		}
		else if(num == 9){
			System.out.println("You entered nine");
		}
		else if(num == 10){
			System.out.println("You entered ten");
		}
		else if(num == 11){
			System.out.println("You entered eleven");
		}
	}
}
