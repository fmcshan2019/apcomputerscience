//Frank McShan -- User inputs a string along with an index -- Returns a string length 3 beginning at the index

import java.util.Scanner; //imports scanner

public class Problem3 { //class
	
	//method accepts two parameters (x as string and index as int) -- returns a string with a length of three beginning at the user defined index
	public static String threeChars(String x, int index) {
		
		String answer = ""; //declares and initializes answer as a string by setting it equal to an empty string
		int length = x.length(); //creates length as an int and sets it equal to the length of x
		
		//check if the index is too big or too small to define a string length 3 -- if so, the first three characters are returned
		if (index < length - 2 && index >= 0) { //checks if the index is less than the length - 2 AND index is greater than or equal to 0 (BOTH MUST BE TRUE!)
			answer = x.substring(index, index + 3); //if BOTH are true, answer equals the substring of x from index to the index + 3
		} else {
			answer = x.substring(0, 3); //if one or both is false, answer equals the substring of x from 0 to 3
		}
		
		return answer; //returns answer
	}
	
	public static void main(String[] args) {
		
		String inputString = ""; //declares and initializes inputString variable by setting it equal to a blank string
		int inputIndex = 0; //declares and initializes the inputIndex variable by setting it equal to 0
		
		Scanner in = new Scanner(System.in); //creates the scanner in
		System.out.print("Please enter a string: "); //statement that asks user to input a string
		inputString = in.nextLine(); //assigns user's input to the input variable
		System.out.print("Please enter an index: "); //statement that asks the user to input an index
		inputIndex = in.nextInt();
		
		while (inputString.length() < 3) {
			System.out.print("Please enter a string with three or more characters: ");
			inputString = in.nextLine();
		}

		System.out.println(threeChars(inputString, inputIndex)); //print the answer on a new line by plugging in user's input into the method withoutEnds

		in.close(); //closes the scanner
	}
}