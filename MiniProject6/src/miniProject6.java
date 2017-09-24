
public class miniProject6 {
	public static void firstSection() { //creates method to display section of stars when called
		System.out.println("    *****");
		System.out.println("  *********");
		System.out.println("*************");
	}
	public static void starLines() { //creates method to display a set of stars and lines when called
		System.out.println("* | | | | | *");
	}
	public static void manyStars() { //created method to display 13 stars when called
		System.out.println("*************");
	}
	public static void fiveStars() { //creates method to display 5 stars when called
		System.out.println("    *****");
	}
	public static void lastSection() { //creates method that displays last section of stars and lines when called
		fiveStars();
		starLines();
		starLines();
		fiveStars();
		fiveStars();
	}
	public static void main(String[] args) {
		//all methods below are called to display the figure in text
		firstSection();
		System.out.println(); //blank line
		firstSection();
		starLines();
		manyStars();
		firstSection();
		System.out.println(); //blank line
		lastSection();

	}

}
