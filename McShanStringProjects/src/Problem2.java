//Frank McShan -- user enters a string and that string minus the first and last characters are returned
import java.util.Scanner; //imports scanner
public class Problem2 { //class
	//method that accepts a string parameter 'x' and returns it minus its first and last character as a string
	public static String withoutEnds(String x) {
		String answer; //declares string variable that will return the answer
		int length1 = x.length() - 1; //takes the length of the string minus 1 to be used to remove the last character
		int length2 = x.length() - length1; //takes the length of the string minus the answer above to reach where the first character lies
		
		if (x.length() >= 2) { //check if the length of the string is greater than or equal to 2
			answer = x.substring(length2, length1); //if true, return the substring of length2 and length1 (the original string minus first and last characters
		} else {
			answer = ""; //to avoid an error message, for strings less than 2, return a blank string
		}
		
		return answer; //returns the final answer
	}
	public static void main(String[] args) {
		String input = ""; //declares and initializes String variable
		
		Scanner in = new Scanner(System.in); //creates the scanner in
		System.out.print("Please enter a string: "); //statement that asks user to input a string
		input = in.nextLine(); //assigns user's input to the input variable
		
		System.out.println(withoutEnds(input)); //print the answer on a new line by plugging in user's input into the method withoutEnds
	}

}
