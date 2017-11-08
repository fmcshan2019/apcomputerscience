//Frank McShan -- determines whether the first 'a' that appears in a string is immediately followed by a second 'a'
//return type is boolean

import java.util.Scanner; //imports scanner

public class Problem4 { //class
	
	public static boolean doubleA(String x) { //method that will return boolean true or false (takes a string in as a parameter)
		
		boolean answer = true; //creates and initializes boolean answer
		int partOne = 0; //creates and initializes partOne as an integer
		int partTwo = 0; //creates and initializes partOne as an integer
		partOne = x.indexOf("a"); //finds the index at which 'a' appears in the string
		partTwo = x.indexOf("aa"); //finds the index at which 'aa' appears in the string\
		
		if (partTwo > partOne) { //checks if index of 'aa' is greater than that of 'a'
			answer = false; //if true, false will be returned
		} else {
			answer = true; //else, it will return true
		}
		
		if (partOne == 0) { //will check to see if the index of 'a' is 0
			answer = false; //if true, it will return false
		}
		
		return answer; //returns the answer (either true or false)
	}
	
	public static void main(String[] args) {
		
		String userInput = ""; //creates and initializes user's input as a string
		
		Scanner in = new Scanner(System.in); //instantiates scanner in
		System.out.print("Please enter a string: "); //statement that will as user for input
		userInput = in.nextLine(); //assigns user's input to the variable userInput
		
		System.out.println(doubleA(userInput)); //plugs in user's input to method doubleA and prints the result
		
		in.close(); //closes the scanner
	}
}