
public class miniProject5 { //class
	public static void fiveStars() { //creates method that displays set of five stars when called
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void twoStars() { //creates method that displays set of stars 2, 1, 2 when called
		System.out.println(" * *");
		System.out.println("  * ");
		System.out.println(" * *");
	}
	public static void oneStar() { //creates method that displays 3 single stars when called
		System.out.println("  *");
		System.out.println("  *");
		System.out.println("  *");
	}
	public static void firstHalf() { //combines 3 methods above to display first half of the DNA molecule
		fiveStars();
		twoStars();
		System.out.println();
		fiveStars();
		twoStars();
		fiveStars();
		System.out.println();
	} 
	public static void main(String[] args) {  
		//all methods below are called once to display, in text, the DNA molecule
		firstHalf();
		oneStar();
		fiveStars();
		twoStars();
	}

}
