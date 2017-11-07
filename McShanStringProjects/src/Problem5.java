import java.util.Scanner;

public class Problem5 {
	public static String noYak(String x) {
		int length = x.length();
		int index = x.indexOf("yak");
		String answer = "";
		
		if (index < length) {
		answer = x.substring(0, index) + x.substring(index + 3);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		String userInput = ""; //creates and initializes user's input as a string
		
		Scanner in = new Scanner(System.in); //instantiates scanner in
		System.out.print("Please enter a string: "); //statement that will as user for input
		userInput = in.nextLine(); //assigns user's input to the variable userInput
		
		System.out.println(noYak(userInput)); //plugs in user's input to method doubleA and prints the result

	}

}
