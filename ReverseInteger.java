//This is number 5
package myJavaProject;
import java.util.Scanner;

public class ReverseInteger {


	public static void main(String[] args) {
	    
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

			int reversed = reverse(num);
			System.out.println("Reversed number is: " + reversed);
		}

	  }

	  public static int reverse(int number) {

	    int reversed = 0;

	    // while number is not 0
	    while(number != 0) {

	      // get last digit by doing modulo 10
	      int digit = number % 10; 

	      // increase reversed by a factor of 10 
	      // and add the digit
	      reversed = reversed * 10 + digit;

	      // remove the last digit from number  
	      number /= 10;    
	    }

	    return reversed;

	  }

	}
	