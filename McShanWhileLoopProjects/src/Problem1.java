//Frank McShan -- uses a while loop to find the first integer that makes the sum of it and all the previous integers before it to be over 1,000,000
public class Problem1 { //class

	public static void main(String[] args) {
		int sum = 0; //declares sum as an int and sets it equal to 0
		int n = 0; //declares n as an int and sets it equal to 0
		
		while (sum < 1000000) { //check if sum is less than 1 million
			sum = sum + n; //add the 'sum' plus 'n'
			n ++; //add one to 'n'
		}
		
		System.out.println(n); //print 'n'
	}
}