	
	import java.util.Scanner;
public class miniProject8 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double radius;
		double diameter;
		double circumference;
		double surfaceArea;
		double volume;
		
		System.out.println("Enter radius of the sphere:");
		
		radius = reader.nextDouble();
		
		diameter = radius * 2;
		
		circumference  = 3.14159 * radius * 2;
		
		surfaceArea = (radius * radius) * 4 * 3.14159;
		
		volume = 1.33333 * 3.14159 * (radius * radius * radius);
		
		System.out.println("Diameter = " + diameter);
		System.out.println("Circumference = " + circumference);
		System.out.println("Surface Area = " + surfaceArea + " units squared");
		System.out.println("Volume = " + volume + " units cubed");	
	}

}