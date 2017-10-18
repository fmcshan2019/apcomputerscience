//Frank McShan -- prints the Collatz sequence for a number -- that number will eventually reach one 
import java.util.Scanner; //import scanner
public class Problem6 { //class

	public static void main(String[] args) {
		int n; //declare n as an int
		Scanner in = new Scanner(System.in); //creates scanner in
		System.out.print("Starting Number: ");
		n = in.nextInt(); //assigns what is entered by user to 'n'
		System.out.print(n + "\t"); //print user's number plus a tab
		
		while (n != 1) { //while statement -- while n is not equal to 1, 
			if (n % 2 != 0) { //check if n is odd by if it has a remainder when divided by 2
				n = (n * 3) + 1; //if number is odd, multiply it by 3, then add 1
				System.out.print(n + "\t"); //print the number and a tab
			}
			if (n % 2 == 0) { //next check if n is even by if it has NO remainder when divided by 2
				n = n / 2; //if n is in fact even, divide it by 2
				System.out.print(n + "\t"); //print n and a tab
			}
			//while statement will continue to loop through until the number equals 1
		}
	}
}

