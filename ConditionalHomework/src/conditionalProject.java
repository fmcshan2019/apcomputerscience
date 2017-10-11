//Frank McShan -- first part accepts one integer parameter and returns the absolute value of it
//second part accepts three integer parameters and takes the absolute value of each
//The number with the largest absolute value is returned
public class conditionalProject { //class
	
	public static int absValue(int num1) { //creates num1 as a single parameter, return value will be an integer
		if (num1 > 0) { //check if num1 is greater than 0
			return num1; //if true, return num1
		}
		if (num1 < 0) { //check if num1 is less than 0
			num1 = num1 + (-num1 * 2); //if true, take negative num1 * 2 and add it to num1 to get new num1
			//ex. num1 = -6 + (-(-6) * 2) -> num1 = -6 + 12 -> num1 = 6 which is absolute value
			return num1; //returns answer as an integer
		}
		return num1; //returns num1 as an integer if all are false
	}
	
	public static int findLargest(int num10, int num11, int num12) { //creates three integer variables as parameters, return value will be an integer
		if (num10 < 0) { //use absolute value method to find absolute value of num10
			absValue(num10);
		}
		if (num11 < 0) {  //use absolute value method to find absolute value of num11
			absValue(num11);
		}
		if (num12 < 0) {  //use absolute value method to find absolute value of num12
			absValue(num12);
		}
		if (num10 > num11) { //check if newNum10 is greater than newNum11
			if (num10 > num12) { //if true, check if newNum10 is greater than newNum12
				return num10; //if true, return newNum10
			}
		}
		if (num11 > num10) { //check if newNum11 is greater than newNum10
			if (num11 > num12) { //if true, check if newNum11 is greater than newNum12
				return num11; //if true, return newNum11
			}
		}
		if (num12 > num10) { //check if newNum12 is greater than newNum10
			if (num12 > num11) { //if true, check if newNum12 is greater than newNum11
				return num12; //if true, return newNum12
			}
		}
		return num12; //return answer if all are false
	}
	public static void main(String[] args) {
		System.out.println(absValue(-6)); //test -6 and absolute value becomes 6 (6 is printed)
		System.out.println(findLargest(-3,12,1)); //test 3 random integers and 12 is printed
	}
}