//Frank McShan -- Prints a triangle set to the right -- one parameter determines the size of the triangle
import java.util.Scanner; //imports the scanner
public class Problem4 { //class
	public static int triangleRight(int size) { //method that accepts integer size as a parameter, return value will be an integer
		int width = 1; //declares width as an integer with a value of 1
		if (size >= 0 && size <= 9) { //check if size is >= 0 and it is <= 9
			for (int counter = 1; counter <= size; counter ++) {  //declares counter as an integer with a value of 1, check if counter <= size, at the end of the loop add one to counter, RECHECK condition
				width = 1; //sets width to 1
				width = width * counter; //width equals itself times counter
				int counter2 = size; //declares counter2 as an integer -- set it equal to size
				int counter3 = 1; //declares counter3 as an integer and sets it equal to 1
			while (counter2 > width) { //while loop -- check if counter 2 is greater than width
				System.out.print(" "); //if so, print a space
				counter2 --; //subtract one from counter2 till it is <= width
			}
			while (counter3 <= width) { //while loop -- check if counter3 <= width
				System.out.print(width); //print out width if true
				counter3 ++; //add one to counter3
			}
			System.out.println(); //print blank line
		}
	}
		return size; //return statement
}
	
	public static void main(String[] args) {
		int answer; //declares answer as an integer
		
		Scanner in = new Scanner(System.in); //creates scanner 'in'
		System.out.print("Enter a size: "); //prints message to user
		answer = in.nextInt(); //assigns user's input to answer
		
		System.out.println(); //prints blank line
		
		triangleRight(answer); //plugs user's input into method to display answer
		
		in.close(); //closes the scanner
	}
}