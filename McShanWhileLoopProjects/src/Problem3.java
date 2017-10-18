//Frank McShan -- Displays a user's exponent with a base 2; program keeps asking for input and displays output until -1 is entered
import java.util.Scanner; //import scanner
public class Problem3 { //class
	
	
	public static void main(String[] args) {
		int input; //declares input as an integer
		int mathAnswer; //declares mathAnswer as an integer
		Scanner in = new Scanner(System.in); //creates scanner in
		System.out.println("Enter an exponent.  The number will be displayed as 2 to that power. ");
		input = in.nextInt(); //assigns user's input to variable input 
		
		mathAnswer = (int) Math.pow(2, input); //CAST AS INTEGER -- finds answer when base is 2 and exponent is user's input
		
		while (input != -1) { //check if input does not equal -1
			mathAnswer = (int) Math.pow(2, input); 
			System.out.println(mathAnswer); //prints answer
			input = in.nextInt(); //asks for input again
		}
	}
}