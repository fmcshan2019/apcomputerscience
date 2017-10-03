package largestInteger;

//Frank McShan -- Displays largest of three integers
import java.util.Scanner;
public class largestInteger { //class
	public static int largestInt(int num1, int num2, int num3) { 
		int firstMax;
		int secondMax;
		int greatest;
		
		firstMax = Math.max(num1, num2);
		secondMax = Math.max(num2, num3);
		greatest = Math.max(firstMax, secondMax);
		
		return greatest;
	}
	public static void main(String[] args) {
		Scanner int11 = new Scanner(System.in);  //creates scanner for first integer
		Scanner int22 = new Scanner(System.in);  //creates scanner for second integer
		Scanner int33 = new Scanner(System.in);  //creates scanner for third integer
		
		largestInt();
		
		System.out.println("The largest of the three integers is" + greatest);

	}

}
