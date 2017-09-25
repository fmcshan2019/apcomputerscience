	
	import java.util.Scanner; //imports java scanner
public class miniProject8 { //class
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); //initiates scanner
		double radius; //creates double variable 'radius'
		double diameter; //creates double variable 'diameter'
		double circumference; //creates double variable 'circumference'
		double surfaceArea; //creates double variable 'surfaceArea'
		double volume; //creates double variable 'volume'
		
		System.out.println("Enter radius of the sphere:");  //text 
		
		radius = reader.nextDouble(); //whatever is entered will be assigned to variable 'radius'
		
		diameter = radius * 2; //calculation for finding diameter
		
		circumference  = 3.14159 * radius * 2; //calculation for finding circumference
		
		surfaceArea = (radius * radius) * 4 * 3.14159; //calculation for finding surface area
		
		volume = 1.33333 * 3.14159 * (radius * radius * radius); //calculation for finding volume
		
		//everything below will display text along with its corresponding variable (ANSWER)
		System.out.println("Diameter = " + diameter);
		System.out.println("Circumference = " + circumference);
		System.out.println("Surface Area = " + surfaceArea + " units squared");
		System.out.println("Volume = " + volume + " units cubed");	
	}

}