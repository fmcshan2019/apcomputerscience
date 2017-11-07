//Frank McShan -- prints the sum of every other digit in credit card #, doubles each digit not included, adds the sum of the two preceding steps (user enters 8 digit #, valid or invalid is printed)
import java.util.Scanner; //imports scanner
public class Problem6 { //class

	public static void main(String[] args) {
		int number = 0; //declares number as an integer
		int sumNum = 0; //declares sumNum as an integer
		int doubleNum = 0; //declares doubleNum as an integer
		int modnum = 0; //declares modNum as an integer
		int newNum = 0; //declares newNum as an integer
		int validfinal = 0; //declares validfinal as an integer
		//sets all variables equal to 0
		
		Scanner in = new Scanner(System.in); //creates scanner 'in'
		System.out.print("Enter an eight digit number to check for validity: "); //displays user's prompt
		number = in.nextInt(); //assigns user's input to number variable
		int secondaryNum = number; //created secondary number as an integer and sets it equal to number
		
		for (int counter1 = 0; number > 0; counter1 ++) { //declares counter1 as an integer equal to 0, check if number is greater than 0, add one to counter, RECHECK CONDITION
			modnum = (number % 10); //if condition is true then, modnum =  number mod ten
			sumNum = sumNum + modnum; //sum = itself plus modnum
			number = number / 100; //number equals itself divided by 100
		}
		
		for (int counter2 = 0; secondaryNum > 0; counter2 ++) { //declares counter2 as an integer equal to 0, check if secondary number is greater than 0, add one to counter, RECHECK CONDITION
			doubleNum = secondaryNum % 100; //double num = secondary number mod 100
			doubleNum = doubleNum / 10; //double num equals itself divided by 10
			newNum = newNum + doubleNum; //new num finds double other digits ( itself plus double num)
			secondaryNum = secondaryNum / 100; //secondary num = itself divided by 100
		}
		
		validfinal = sumNum + newNum; //total equals sum from first for statement plus that of the second for statement (to find validity)
		
		if (validfinal % 10 == 0) { //check if sum ends with a 0
			System.out.println("Valid"); //if true, print 'valid'
		} else {
			System.out.println("Invalid"); //if false, print 'invalid'
	}
		
		in.close(); //closes the scanner
	}
}