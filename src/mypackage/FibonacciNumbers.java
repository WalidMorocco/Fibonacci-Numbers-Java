package mypackage;
import java.util.Scanner;

public class FibonacciNumbers {

	// Fib() function to get Fibonacci value by recursion
	private static int Fib(int number) {
		
		// Returns itself if < 2
		if (number < 2) {
			return number;
		}
		
		// Get Fibonacci value if >= 2
		int result = Fib(number - 1) + Fib(number - 2);
		
		// Return result of the Fibonacci value calculation
		return result;
		
	}
	
	// Fib() function to get Fibonacci value by iteration
	public static int iterativeFib(int number){
	      
		// Returns itself if < 2
		if (number < 2) {
			return number;
		}
		
        int f1 = 0;
        int f2 = 1;
        int result = 1;

        // Get Fibonacci value if >= 2
        for (int i = 2; i <= number; i++) {
        	result = f1 + f2;
        	f1 = f2;
        	f2 = result;
        }
        
        // Return result of the Fibonacci value calculation
        return result;
        
    }
	
	public static void main(String[] args) {
		
		// Declare variables
		Scanner keyboard = new Scanner(System.in);
		int fibResult = 0;
		
		// Ask user to input the cosen number for the Fibonacci function and the method
        System.out.println("	Choose a number to get its Fibonacci value: ");
        int nbInput = keyboard.nextInt();
        System.out.println("\n");
        keyboard.nextLine();
        System.out.println("	Choose between recursion or iteration: ");
        String methodInput = keyboard.nextLine();
        System.out.println("\n");
        
        // Different method depending on the user's input (recursion or iteration)
        if (methodInput.toUpperCase().equals("RECURSION")) {
        	// Inititate timer to calculate how long the function takes to run
        	long startTime = System.nanoTime();
        	
        	// Output every number of the recursion process
			for (int i = 0; i <= nbInput; i++) {
				 fibResult = Fib(i);
				 System.out.print(fibResult + " ");
			}
			
			// End timer and output the time taken by the function to run
        	long endTime   = System.nanoTime();
     		long totalTime = endTime - startTime;
     		System.out.println("\n\n Time taken for the recursion process : " + totalTime + " nanoseconds.");
    		
    	} else if (methodInput.toUpperCase().equals("ITERATION")) {
    		// Inititate timer to calculate how long the function takes to run
    		long startTime = System.nanoTime();
    		
    		// Output every number of the iterative process
    		for (int i = 0; i <= nbInput; i++) {
    			fibResult = iterativeFib(i);
    			System.out.print(fibResult + " ");
            }
    		
    		// End timer and output the time taken by the function to run
    		long endTime   = System.nanoTime();
    		long totalTime = endTime - startTime;
    		System.out.println("\n\n Time taken for the iteration process : " + totalTime + " nanoseconds.");
    	} else {
    		// Error message
    		System.out.println("	You did not enter the right input");
    	}
        
        // Output final result
        System.out.println("\n\n		The value is " + fibResult);
         
	}
}
