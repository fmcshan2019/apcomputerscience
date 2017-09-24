
public class miniProject3 {
	public static void forwardSlashes() {
		System.out.println("//////////////////////"); //creates method for the forward slashes
	}
	public static void victoryStatement() {
		System.out.println("|| Victory is mine! ||"); //creates method for the victory statements
	}
	public static void oneSection() {  //method for combining both slashes and victory statements into an entire section
		forwardSlashes();
		victoryStatement();
	}
	public static void main(String[] args) {  //prints text
		oneSection();
		oneSection();
		oneSection();
		oneSection();
		oneSection();
		forwardSlashes();
	}

}
