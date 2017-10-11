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
		int newNum10 = Math.abs(num10); //absolute value of num10 = newNum10
		int newNum11 = Math.abs(num11); //absolute value of num11 = newNum11
		int newNum12 = Math.abs(num12); //absolute value of num12 = newNum12
		
		if (newNum10 > newNum11) { //check if newNum10 is greater than newNum11
			if (newNum10 > newNum12) { //if true, check if newNum10 is greater than newNum12
				return newNum10; //if true, return newNum10
			}
		}
		if (newNum11 > newNum10) { //check if newNum11 is greater than newNum10
			if (newNum11 > newNum12) { //if true, check if newNum11 is greater than newNum12
				return newNum11; //if true, return newNum11
			}
		}
		if (newNum12 > newNum10) { //check if newNum12 is greater than newNum10
			if (newNum12 > newNum11) { //if true, check if newNum12 is greater than newNum11
				return newNum12; //if true, return newNum12
			}
		}
		return newNum12; //return answer if all are false
	}
	public static void main(String[] args) {
		System.out.println(absValue(-6)); //test -6 and absolute value becomes 6 (6 is printed)
		System.out.println(findLargest(3,12,1)); //test 3 random integers and 12 in printed
	}
}
