//Frank McShan -- predicts population growth when inputs include: number of organisms, rate of growth (real # can be a decimal), number of hours to achieve rate and number of hours during which the population grows
public class Problem2 { //class
	
	public static double population(int numOrganisms, double rateOfGrowth, int numHoursAchieved, int numHoursGrow) { //accepts four parameters and returns a double
		double prediction1; //declares prediction1 as a double
		double finalPrediction; //declares finalPrediction as a double
		double factor; //declares factor as a double
		
		factor = numHoursGrow / numHoursAchieved; //factor equals number of growth hours divided by number of hours achieved
		prediction1 = numOrganisms * rateOfGrowth; //in the number of hours it takes to achieve the rate
		finalPrediction = prediction1 * factor; //final prediction equals prediction 1 times factor
		
		return finalPrediction; //returns the final prediction
	}
	public static void main(String[] args) {
		System.out.println("The prediction of the total population is: " + population(500,2,6,12)); //tests with numbers -- code executes as intended

	}

}
