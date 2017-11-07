//Frank McShan -- prints a series of plus signs and capital 'O' 's based upon the user's input for height and width
import java.util.Scanner; //imports scanner
public class Problem5 { //class
	public static int Plus(int width, int height) { //accepts integers width and height as parameters, returns an integer
		int counter = 1; //declares counter as an integer and sets it equal to 1
		while (counter <= height) { //while loop -- check if counter <= height
		for (int counter1 = 1; counter1 <= width; counter1 ++) { //if true run this -> declares counter1 as integer with value of 1, check if counter1 <= width, at the end of the loop add one to counter, THEN RECHECK CONDITION
			System.out.print("+"); //if true, print a + sign
			counter1 ++; //add one to counter1
			if (counter1 <= width) { //check if counter1 <= width
			System.out.print("O"); //if true print O
			}
		}
		counter ++; //add one to counter
		System.out.println(); //print blank line
		if (counter <= height) { //check if counter is <= height
		for (int counter2 = 1; counter2 <= width; counter2 ++) { //if true, declare counter 2 as integer and set it equal to 1, check if counter2 is <= width, at the end of loop add one to counter2, THEN RECHECK CONDITION
			System.out.print("O"); //if true, print a O
			counter2 ++; //add one to counter2
			if (counter2 <= width) { //check if counter2 is <= width
			System.out.print("+"); //if true, print a + sign
			} 
		}
	}
		counter ++; //add one to counter
		System.out.println(); //print blank line
	}
		return counter; //return statement
	}
	public static void main(String[] args) {
		int width; //declares width as an integer
		int height; //declares height as an integer
		
		Scanner in = new Scanner(System.in); //creates scanner 'in'
		System.out.print("Enter a width: "); //asks user for width value
		width = in.nextInt(); //assigns user's input for width value to width
		System.out.print("Enter a height: "); //asks user for height value
		height = in.nextInt(); //assigns user's input for height value to width
		
		System.out.println(); //prints blank line
		
		Plus(width, height); //plugs in user's inputs for width and height into method and prints answer
		
		in.close(); //closes scanner
	}

}
