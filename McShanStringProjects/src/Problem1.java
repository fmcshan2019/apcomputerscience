//Frank McShan -- checks if an enter string contains the substring '@cchs' -- returns true or false accordingly

import java.util.Scanner; //imports Scanner

public class Problem1 { //class
	//method below accepts a String x and returns a boolean (true or false) as an answer
	//method will check if the entered string contains the substring by taking the first occurence of @cchs
	public static boolean containsAt(String x) {
		
		boolean answer; //creates answer as a boolean type variable
		
		if (x.indexOf("@cchs") > 0) { //if @cchs is in string the number will be greater than 0
			answer = true; //return true
		} else {
			answer = false; //if it isn't true, simply return false
		}
		
		return answer; //returns the answer as a variable
	}
	
	public static void main(String[] args) {
		
		String input = ""; //declares and initializes String input
		
		Scanner in  = new Scanner(System.in); //creates scanner in
		System.out.print("Please enter a string: "); //statement for user to enter email to check for validity
		input = in.nextLine(); //sets the variable input equal to what the user entered
		
		System.out.println(containsAt(input)); //print the new answer on a new line by plugging in user's input into the method containsAt
		
		in.close(); //closes the scanner
	}
}