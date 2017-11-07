//Frank McShan -- outputs a triangle of integers based on the size that the user enters
import java.util.Scanner; //imports scanner
public class Problem3 { //class
	public static int triangleLeft(int size) { //method that accepts size as an integer, return value will be an integer
		int width = 1; //declares width as an integer and sets it equal to one
		if (size >= 0 && size <= 9) { //check if size is greater >= 0 and it is <= 9
			for (int counter = 1; counter <= size; counter ++) { //declares counter as an integer and sets it equal to one, check if counter <= size, one loop is complete add one to counter
				width = 1; //declares width as an integer and sets it equal to 1
				width = width * counter; //width equals width times counter
				int counter2 = 1; //declares counter2 as an integer and sets it equal to 1
			while (counter2 <= width) { //while loop -- check
				System.out.print(width); //print width
				counter2 ++; //add one to counter
			}
			System.out.println(); //print a blank line
		}
	}
		return size; //return statement
}
	
	public static void main(String[] args) {
		int answer; //declares answer as an integer
		
		Scanner in = new Scanner(System.in); //creates scanner 'in'
		System.out.print("Enter a size: "); //prints enter size statement
		answer = in.nextInt(); //assigns user input to answer
		
		System.out.println(); //prints a blank line
		
		triangleLeft(answer); //displays answer by plugging in user's input into the method
		
		in.close(); //closes the scanner
	}
}