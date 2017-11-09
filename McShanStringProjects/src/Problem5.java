//Frank McShan -- User will enter a string, and the string will be returned without 'yak' if applicable

import java.util.Scanner; //imports scanner

public class Problem5 { //class
	
	//method will check if the string contains 'yak' and if so, it will remove it and return the remaining string
	public static String noYak(String x) {
		
		int length = x.length(); //declares length as an int and sets it equal to the length of x
		int index = x.indexOf("yak"); //declares index as an int and sets it equal to the index where 'yak' first appears
		String answer = ""; //declares and initializes answer as a string by setting it equal to an empty string
		
		
		while (index < length && index >= 0) { //check if index is less than length
		answer = x.substring(0, index) + x.substring(index + 3) + answer; //if true, answer equals the substring of x from 0 to the index and the substring of x from the index + 3
		index = answer.indexOf("yak"); //finds new index
			if (index < length && index >= 0) { //check to find new answer
				answer = answer.substring(0, index) + answer.substring(index + 3) + answer; //finds new string base on substring statements
				index = answer.indexOf("yak"); //finds new index
			}
		}
	
		return answer; //returns answer
}
	
	public static void main(String[] args) {
		
		String userInput = ""; //creates and initializes user's input as a string
		
		Scanner in = new Scanner(System.in); //instantiates scanner in
		System.out.print("Please enter a string: "); //statement that will ask user for input
		userInput = in.nextLine(); //assigns user's input to the variable userInput
		
		System.out.println(noYak(userInput)); //plugs in user's input to method noYak and prints the result
		
		in.close(); //closes the scanner
	}
}