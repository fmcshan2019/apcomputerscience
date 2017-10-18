//Frank McShan -- asks user to guess a secret integer until he or she gets it right.
import java.util.Scanner; //imports scanner
public class Problem4 { //class
	
	public static int getRandInt(int min, int max) { //method to calculate a random integer between two values
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}
	
	public static void main(String[] args) {
		int guess; //declares guess as an int
		int secretInteger; //declares secretInteger as an int
		int counter = 0; //declare counter as an int and sets it equal to 0
		secretInteger = getRandInt(1,100); //assigns a random integer from 1 to 100 to secret integer
		Scanner in  = new Scanner(System.in); //creates scanner in
		System.out.println("Guess the secret integer: ");
		guess = in.nextInt(); //assigns the user's input to guess
		
		while (guess != secretInteger) { //check if guess is not equal to secret integer
			while (guess > secretInteger) { //check to see if guess is greater than secret integer
				System.out.println("Too high"); //if true, display 'too high'
				guess = in.nextInt(); //this statement allows for another input
				counter ++; //adds one to counter
			}
			
			while (guess < secretInteger) { //check if guess is less than than secret integer
				System.out.println("Too low"); //if true, display 'too low'
				guess = in.nextInt(); //this statement allows for another input
				counter ++; //adds one to counter
			}
		
		if (guess == secretInteger) { //check if guess equals secret integer
			System.out.println("Correct"); //if true, display 'correct'
			counter ++; //add one to counter
			System.out.println("Game finished.  The Secret Number was " + secretInteger); //displays what the secret integer was
			System.out.println("Number of guesses required: " + counter); //displays number of guesses
		}
	}
}
}