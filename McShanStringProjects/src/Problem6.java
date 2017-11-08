//Frank McShan -- accepts a string and builds it up by adding a character each time until the full string is reached

import java.util.Scanner; //imports scanner

public class Problem6 { //class
	
	//method will accept a string (x) and will end up returning a string -- it will build up the string until the full string is reached
	public static String stringBuildup(String x) {
		
		int length = x.length(); //declares length as an int and sets it equal to the length of x
		String answer = ""; //declares and initializes the string answer by setting it equal to an empty string
		
		//for statement: create counter as an int and set it equal to 1, then check if counter is less than or equal to length, if so, run what's inside the for statement
		for (int counter = 1; counter <= length; counter ++) {
			answer = answer + x.substring(0, counter); //concatenate answer and keep adding the substring of x from 0 to the counter
		} //once loop is complete, add one to counter and check condition again
		
		return answer; //returns answer
	}
	
	public static void main(String[] args) {
		
		String userInput = ""; //creates and initializes user's input as a string
		
		Scanner in = new Scanner(System.in); //instantiates scanner in
		System.out.print("Please enter a string: "); //statement that will ask user for input
		userInput = in.nextLine(); //assigns user's input to the variable userInput
		
		System.out.println(stringBuildup(userInput)); //plugs in user's input to method stringBuildup and prints the result
		
		in.close(); //closes the scanner
	}
}