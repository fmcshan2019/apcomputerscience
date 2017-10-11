//Frank McShan -- analyzes three integers and determines if all the numbers are unique
//true or false will be displayed based on if the number is unique or not
public class uniqueDigits { //class
	public static boolean uniqueOrNot (int num1, int num2, int num3) {
		if (num1 != num2) { //check to see if num1 does not equal num2
			if (num1 != num3) { //if true, check to see if num1 does not equal num3
				if (num2 != num3) { //if true, check to see if num2 does not equal num3
					return true; //if all statements are true, the number is unique so return true
				}
			}
		}
		
		return false; //if one or more of the statements are false, return false because the number won't be unique
	}
	public static void main(String[] args) {
		System.out.println(uniqueOrNot(3,9,5)); //test by plugging in 3 random integers -- 3,9,5 are all different 
		//number is unique -- true will be displayed
	}
}
