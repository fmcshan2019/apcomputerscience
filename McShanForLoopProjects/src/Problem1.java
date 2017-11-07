//Frank McShan -- computes the sum of squares from 1 to a number entered by the user
import java.util.Scanner; //imports Scanner
public class Problem1 { //class
	public static int sumSquares(int num) { //accepts integer num as a parameter -- return value will be an integer
		int newNum = 0; //declares newNum
		for (int counter = 1; counter <= num; counter++) { //first set counter to 1 and declare as an int, check if counter is <= num, once loop complete add one to counter
			newNum = newNum + (counter * counter); //counter squared plus newNum = newNum
		}
		System.out.println("The sum of the squares up to " + num + " is: " + newNum); //prints out answer
		return newNum; //returns answer to main
	}
	public static void main(String[] args) {
		int answer; //declares answer as an int
		
		Scanner in = new Scanner(System.in); //creates scanner in
		System.out.print("Enter a number: "); //text to have a number entered
		answer = in.nextInt(); //the integer user enters will be stored in answer
		
		System.out.println(); //print blank line
		
		sumSquares(answer); //display answer by plugging in user's input to method
		
		in.close(); //close the scanner
	}

}
