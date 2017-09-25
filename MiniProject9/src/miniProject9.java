	import java.util.Scanner; //imports java scanner
public class miniProject9 { //class
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); //creates scanner to enter height of trapezoid
		Scanner read = new Scanner(System.in); //creates scanner to enter length of bottom base
		Scanner r  = new Scanner(System.in); //creates scanner to enter length of top base
		double bottomBase; //creates double variable for bottom base
		double height; //creates double variable for height
		double topBase; //creates double variable for top base
		double area; //creates double variable for area
		
		//below all text is displayed for entering data
		System.out.println("Area of a Trapezoid Calculator");
		System.out.println("Enter height of the trapezoid:");
		System.out.println("Enter length of the bottom base:");
		System.out.println("Enter length of the top base:");
		
		//assigns variables to scanners
		height = reader.nextDouble();
		bottomBase = read.nextDouble();
		topBase = r.nextDouble();
		
		area = .5 * (bottomBase + topBase) * height; //formula for finding area
		
		System.out.println("The area is: " + area + " units squared"); //prints area
				
	}

}