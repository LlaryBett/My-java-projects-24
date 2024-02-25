//This is number two
package myJavaProject;

public class Fibonacci {
	    public static void main(String[] args) {
	        int n = 100; // Number of terms in the sequence
	        
	        System.out.println("Fibonacci Sequence (up to " + n + ") :");
	        
	        int firstNumber = 0;
	        int secondNumber = 1;
	        
	        System.out.print(firstNumber + ", ");
	        for (int i = 0; i < n - 1; ++i) {
	            int nextNumber = firstNumber + secondNumber;
	            
	            /* Print current number and update values for next iteration */
	            System.out.print(nextNumber + ", ");
	            firstNumber = secondNumber;
	            secondNumber = nextNumber;
	        }
	        
	        System.out.println();
	    }
	}