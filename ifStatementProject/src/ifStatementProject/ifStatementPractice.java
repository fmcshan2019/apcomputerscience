package ifStatementProject;

public class ifStatementPractice {

	public static int largest(int num1, int num2) { 
		if (num1 > num2){
			return num1;
		} else {
			return num2;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(largest(5,3));
	}

}
