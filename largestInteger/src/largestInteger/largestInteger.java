//Frank McShan -- Displays largest of three integers
package largestInteger;
import java.util.Scanner; //imports scanner
public class largestInteger { //class

	public static int largestInt(int num1, int num2, int num3) {  //statement creates three parameters and return value will be an integer
		//three statements below create three variables as integers
		int firstMax;
		int secondMax;
		int greatest;
		firstMax = Math.max(num1, num2); //finds the max of num1 and num2
		secondMax = Math.max(num2, num3); //finds the max of num2 and num3
		greatest = Math.max(firstMax, secondMax); //finds the max of the two answers from the calculations above
		return greatest; //returns the greatest of the three integers
	}
	public static void main(String[] args) {
		int num11; //creates three variables as integers... these are the ones that the user inputs
		int num22;
		int num33;
		System.out.println("Enter three integers to find the largest of them:");
		Scanner scanner1 = new Scanner(System.in);  //creates scanner for integers
		num11 = scanner1.nextInt(); //initiates scanner for all three variables
		num22 = scanner1.nextInt();
		num33 = scanner1.nextInt();
		int ans = largestInt(num11, num22, num33); //uses method to find the largest integer of the three integers imported from the user
		System.out.println("The largest of the three integers is " + ans); //displays answer
	}
}