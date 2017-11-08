//Frank McShan -- user inputs a string (their name) and their name is returned in reversed (separate with space and comma)

import java.util.Scanner; //imports scanner

public class Problem7 { //class

	//Method that accepts a string as a parameter (x) and will return a string.  User's entered first and last name will be returned in reverse, separated by a comma and space
	public static String processName(String x) {
		
		int index = x.indexOf(" "); //declares index and an int and sets it equal to the index where a blank space " " in the name is located

		String lastName = x.substring(index + 1); //declares lastName as a string and sets it equal to the substring of x from the index + 1 onward to the end of the string
		String firstName = x.substring(0, index); //declares firstName as a string and sets it equal to the substring of x from 0 to that index
		
		String answer = lastName + ", " + firstName + "."; //prints user's inputed name in reverse, separated by a space and comma, ended with a period
		
		return answer; //returns answer
	}
	
	public static void main(String[] args) {
		
		String userInput = ""; //creates and initializes user's input as a string
		
		Scanner in = new Scanner(System.in); //instantiates scanner in
		System.out.print("Please enter your first and last name: "); //statement that will ask user for input
		userInput = in.nextLine(); //assigns user's input to the variable userInput
		
		System.out.println("Your name in reverse order is " + processName(userInput)); //plugs in user's input to method doubleA and prints the result
		
		in.close(); //closes the scanner
	}
}