	import java.util.Scanner;
public class miniProject10 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int inches;
		int inchTotalMale;
		int inchTotalFemale;
		
		System.out.println("Please enter a height in inches:");
		
		inches = reader.nextInt();
		
		inchTotalMale = (inches - 60) * 7 + 106;
		inchTotalFemale = (inches - 60) * 6 + 100;
		
		System.out.println("Recommended Male Weight: " + inchTotalMale);
		System.out.println("Recommended Female Weight: " + inchTotalFemale);
	}

}