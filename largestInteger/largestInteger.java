//Frank McShan -- Displays largest of three integers

import java.util.Scanner; //imports scanner

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
		int num11;
		int num22;
		int num33;
		Scanner scanner1 = new Scanner(System.in);  //creates scanner for integer
		num11 = scanner1.nextInt();
		num22 = scanner1.nextInt();
		num33 = scanner1.nextInt();
		int ans = (larh=g)
		System.out.println("The largest of the three integers is" + greatest);



	}



}