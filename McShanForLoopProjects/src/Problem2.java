//Frank McShan -- Grade Calculation -- input grades until the original specified number is reached (reports average to user rounded to the nearest whole number)
import java.util.Scanner; //imports scanner
public class Problem2 { //class
	public static void main(String[] args) {
		double initial; //creates initial as a double
		double firstAverage = 0; //creates firstAverage as a double and sets it equal to 0
		int average = 0; //creates average as an int and sets it equal to 0
		double nextGrade; //creates nextGrade as a double
		
		Scanner in = new Scanner(System.in); //creates scanner 'in'
		
		System.out.print("How many grades would you like to enter? "); //user enters number
		initial = in.nextInt(); //assigns user's input to initial
		
		for (int counter = 1; counter <= initial; counter ++) { //declares counter as an int equal to 1, check if counter <= initial, after loop is complete increase counter by 1
			System.out.print("Enter grade #" + counter + ": "); //print enter grade and the counter
			nextGrade = in.nextDouble(); //assigns user's input to nextGrade
			firstAverage = firstAverage + nextGrade; //first average equals itself plus nextGrade
		}
		average = (int) (firstAverage / initial); //find average by dividing firstAverage by initial -- CAST as an integer
		average  = Math.round(average); //round average to nearest whole number

		
		System.out.println("Your class average is: " + average); //prints the class average
		
		in.close(); //closes the scanner
	}

}