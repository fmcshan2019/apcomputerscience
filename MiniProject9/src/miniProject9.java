	import java.util.Scanner;
public class miniProject9 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Scanner read = new Scanner(System.in);
		Scanner r  = new Scanner(System.in);
		double bottomBase;
		double height;
		double topBase;
		double area;
		
		System.out.println("Area of a Trapezoid Calculator");
		System.out.println("Enter height of the trapezoid:");
		System.out.println("Enter length of the bottom base:");
		System.out.println("Enter length of the top base:");
		
		height = reader.nextDouble();
		bottomBase = read.nextDouble();
		topBase = r.nextDouble();
		
		area = .5 * (bottomBase + topBase) * height;
		
		System.out.println("The area is: " + area + " units squared");
				
	}

}