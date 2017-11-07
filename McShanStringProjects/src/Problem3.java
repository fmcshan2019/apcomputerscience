import java.util.Scanner;
public class Problem3 {
	public static String threeChars(String x, int index) {
		String answer;
		int length = x.length();
		String firstLength = (x.substring(index, index + 3));
		int secondLength = firstLength.length();

			answer = x.substring(index, index + 3);
		
		if (index + 3 > length) {
			answer = x.substring(0, 4);
		}
		
		return answer;
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

	}

}