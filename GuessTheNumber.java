# CODSOFT
package guess;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int randomNumber=random.nextInt(100)+1;
		int guess;
		int attempts=0;
		System.out.println("Welcome to the Guess The Number Game!!!");
		System.out.println("A number has been chosen between 1-100. Guess the number!!!");
		do {
			System.out.println("Enter your guess:");
			guess=scanner.nextInt();
			attempts++;
			if(guess<randomNumber) {
				System.out.println("Too Low!! Please try again!!");
			}
			else if(guess>randomNumber) {
				System.out.println("Too High!! Please try again!!");
			}
		} while(guess!=randomNumber);
		System.out.println("Congratulations!!! Your guess is correct. The number is" +randomNumber+ "and was answered right in" +attempts+ "attempts");
		scanner.close();
		
		
	}
}
