//Frank McShan -- prompts user for a sum, then repeatedly rolls two 6 sided dice until their sum is the user's sum
import java.util.Scanner; //import scanner
public class Problem5 { //class
	
	public static int getRandInt(int min, int max) { //method to find a random integer between two values
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static void main(String[] args) {
		int userInput; //declares userInput as an int
		int secretNum1; //declares secretNum1 as an int
		int secretNum2; //declares secretNum2 as an int
		int sum; //declares sum as an int
		Scanner in = new Scanner(System.in); //creates scanner 'in'
		System.out.print("Desired dice sum: "); 
		userInput = in.nextInt(); //assigns user input from scanner to userInput
		
		secretNum1 = getRandInt(1,6); //secretNum1 equals a random integer between 1 and 6
		secretNum2 = getRandInt(1,6); //secretNum2 equals a random integer between 1 and 6
		sum = secretNum1 + secretNum2; //sum equals the sum of both secret numbers
		
		while ((secretNum1 + secretNum2) != userInput) { //while sum is not equal to userInput...
			System.out.println(secretNum1 + " and " + secretNum2 + " = " + sum); //print starting number, then when looped again, prints new number
			secretNum1 = getRandInt(1,6); //get a random integer
			secretNum2 = getRandInt(1,6); //get a random integer
			sum = secretNum1 + secretNum2; //calculate the sum
		}
		
		if ((secretNum1 + secretNum2) == userInput) { //check if sum equals userInput
			System.out.println(secretNum1 + " and " + secretNum2 + " = " + userInput); //prints final answer
		}
	}
}