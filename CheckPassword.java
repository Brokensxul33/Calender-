/* Title: Check Password
 * Date: 10/05/2020
 * Author:Luis Flores Cardoza 
 */

package lab9;
import java.util.Scanner;
public class CheckPassword {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Square root of 12  is " + sqrt(12));
		System.out.println("Square root of 4 is " + sqrt(4));
		System.out.println("Enter a string for password");
		String s = in.nextLine();
		
		
		if(isValidPassword(s)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Invalid password");
		}
		
		

	}
	public static boolean isValidPassword(String s) {
		final int LENGTH_OF_VALID_PASSWORD = 8;
		final int MINIMUM_NUMBER_OF_DIGITS = 2;
		
		boolean validPassword = islengthValid(s, LENGTH_OF_VALID_PASSWORD) && isOnlyLettersAndDigits(s) && hasNDigits(s, MINIMUM_NUMBER_OF_DIGITS);
		
		return validPassword;	
	}
	public static boolean islengthValid(String s, int validLength) {
		return s.length() >= validLength;
		
	}
	public static boolean isOnlyLettersAndDigits(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static boolean hasNDigits(String s, int n) {
		int numOfDigits = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				numOfDigits++;
			}
			if(numOfDigits >= n) {
				return true;
			}
		}
		return false;
	}
	

	public static double sqrt(double x) {
		double lastGuess = 1; // starting guess number positive value
		double nextGuess = (lastGuess + x / lastGuess) / 2;
		
		
		// difference between nextGuess and lastGuess is less than 0.0001
		// returns the nextGuess as a square root of n
		while (Math.abs(nextGuess - lastGuess) > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + x / lastGuess) / 2;
			
			
			}
		lastGuess = nextGuess;
		return nextGuess;

		}
}
	
