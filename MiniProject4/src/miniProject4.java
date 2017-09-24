
public class miniProject4 { //class
	public static void topBottom() { //method for top and bottom of rocket
		System.out.println("   /\\");	
		System.out.println("  /  \\");
		System.out.println(" /    \\");
	}
	public static void Box() { //method for boxes in rocket
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	public static void helloWorld() { //displays 'hello world' in a box
		System.out.println("|Hello |");
		System.out.println("| World|");
	}
	public static void main(String[] args) { 
		//all methods are called below to display rocket in console
		topBottom(); 
		Box();
		helloWorld();
		Box();
		topBottom(); 
	}

}
