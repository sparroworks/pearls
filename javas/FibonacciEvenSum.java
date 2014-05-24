package javas;
/*
 * This program finds the sum of all even terms in the Fibonaccie sequence
 * where all terms are below 4 million - A Project Euler problem
 */
public class FibonacciEvenSum {
	public static double LIMIT = 4000000;
	
	/*
	 * Recursively find fibonacci terms and add even terms
	 */
	public static double fibonacciEvenSumGenerator(double prevOne, double prevTwo, double sum)
	{
		double nextTerm = prevOne + prevTwo;
		if(!(nextTerm > FibonacciEvenSum.LIMIT)){
			if(nextTerm % 2 == 0){
				sum += nextTerm;
				
			}
		
		return fibonacciEvenSumGenerator(prevTwo, nextTerm, sum);
		}
		else{
			return sum;
		}
	}
	
	/*
	 * Main function to initiate summation
	 */
	public static void main(String[] args) {
		
		double prevOne = 0;
		double prevTwo = 1;
		double sum = 0;
		double result = FibonacciEvenSum.fibonacciEvenSumGenerator(prevOne, prevTwo, sum);
		System.out.println("Sum of even fibonacci below 4 million - "+ result);
		

	}

}
