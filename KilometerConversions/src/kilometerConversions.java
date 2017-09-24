	
	import java.util.Scanner;
public class kilometerConversions {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double Kilometers;
		double nauticalMiles;
		
		System.out.println("Enter number of kilometers to be converted into nautical miles:");
		
		Kilometers = reader.nextDouble();
		nauticalMiles = Kilometers;
		nauticalMiles = (Kilometers / 10000) * 90 * 60; // it is given that 1 kilometer represents 1/10000 of the distance  b/t North Pole and equator
		//there are 90 degrees, containing 60 minutes of arc each b/t North Pole and equator
		//A nautical mile is 1 minute of an arc
		
		System.out.println("There are a total of " + nauticalMiles + " nautical miles in " + Kilometers + " kilometers.");				
		
				
	}

}
