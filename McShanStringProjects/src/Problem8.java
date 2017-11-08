//Frank McShan -- Returns an entered string with its characters in the opposite order
import java.util.Scanner; //imports scanner

public class Problem8 { //class
	
	//accepts a string as a parameter, returns a string with the inputed string's characters in reverse order
	public static String printReverse(String x) {
		
		int index = x.length() - 1; //finds the length of the string minus 1 to set index notation
		String answer = ""; //creates and initializes variable answer as a String
		
		//for statement: create counter as an int and set it equal to index, then check if counter is greater than or equal to 0, if so, run what's inside the for statement
		for (int counter = index; counter >= 0; counter--) { 
			answer = answer + x.substring(index, index + 1); //concatenate answer plus the substring of x -- returns the single character from index to index +  1
			index --; //subtract one from index
		} //once loop is complete, subtract one from counter and check condition again
		
		return answer; //return answer
	}
	
	public static void main(String[] args) {
		
		String userInput = ""; //creates and initializes userInput as a string
		
		Scanner in = new Scanner(System.in); //instantiates scanner in
		System.out.print("Please enter a string: "); //statement that will ask user for input
		userInput = in.nextLine(); //assigns user's input to the variable userInput
		
		System.out.println(printReverse(userInput)); //plugs in user's input to method printReverse and prints the result

		in.close(); //closes the scanner
	}
}