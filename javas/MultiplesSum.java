package javas;
/*
 * My first Project Euler problem
 * The program finds the sum of multiples of 3 or 5 below the given limit
 * Not complicated or clever. Simple modulo check and summation.
 */
public class MultiplesSum {

	public static void main(String[] args) {
		int limit = 10;
		long sum = 0;
		if(args.length > 0){
			limit = Integer.parseInt(args[0]);
		}
		
		for(int i=1; i< limit; i++){
			if((i % 3 == 0) || (i % 5 == 0)){
				sum += i;
			}
		}
		
		System.out.println("Sum of multiples of 3 or 5 below limit "+limit+" is "+sum);
		

	}

}
