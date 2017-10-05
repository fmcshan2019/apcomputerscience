package triangleSides;

public class triangleSides { //class
	public static double threeSides(double leg1, double leg2, double hypotenuse) { //creates three variables(side lengths) and return value will be a double
		double answer;
		answer = (leg1 * leg1) + (leg2 * leg2); //calculation for finding a squared plus b squared
		if (hypotenuse == Math.sqrt(answer)){ //if the hypotenuse is equal to square root of a square plus b squared then it is a right triangle
			System.out.println("This triangle is a right triangle.");
		} else { //consequently, if the values don't equal each other than the message that it is not a right triangle will be displayed
			System.out.println("This triangle is not a right triangle.");
		}
		return answer;
	}
	public static void main(String[] args) {
		double answer;
		answer = threeSides(3, 4, 5); //put in any random three positive integers (3,4,5 is a pythagorean identity)
		//above statement will also display whether or not the triangle is right
	}

}
