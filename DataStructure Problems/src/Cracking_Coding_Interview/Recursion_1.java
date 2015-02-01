package Cracking_Coding_Interview;

/**
 * This program generates nth Fibonaki number using 
 * Recursion and iterative method. 
 * @author rushi_000
 *
 */

public class Recursion_1 {

	public static int fibonacciRec(int number) {
		if (number==0) {
			return 0;
		}
		else if (number==1) {
			return 1;
		}
		else if (number > 1){
			return fibonacciRec(number-1) + fibonacciRec(number-2);   // f(n) = f(n-1) + f(n-2)
		}
		else {														 // checks if negative number is passed or not
			return -1;
		}
	}
	
	public static int fibonacciIte(int number) {
		int result = -1;
		int last_term = 0, second_last_term = 0; 
		for (int i=0;i<number+1;i++) {
			if (i==0) {
				result = 0;
				second_last_term = 0;
			}
			else if(i==1) {
				result = 1;
				last_term = 1;
			}
			else {
				result = last_term + second_last_term;
				second_last_term = last_term;
				last_term = result;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo = fibonacciRec(7);
		System.out.println("Fibonacci using Recursion ::" + fibo);
		fibo = fibonacciIte(-5);
		System.out.println("Fibonacci using Iteration ::" + fibo);
	}

}
