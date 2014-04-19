package fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args){
		/**
		 * Iterate number 1 to 100.
		 * If a number is a multiple of 3, write 'Fizz'
		 * If a number is a multiple of 5, write 'Buzz'
		 * If both, write 'FizzBuzz'
		 */
		String result = "";
		for(int x=1; x<=100; x++){
			if(x%3==0){
				result += "Fizz";
			}
			if(x%5==0){
				result += "Buzz";
			}
			System.out.println("Number["+x+"]: " + result);
			result = "";
		}
	}
}
