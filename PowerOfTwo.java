//This is number three
package myJavaProject;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
        try (// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in)) {
			// Prompt the user to enter an integer
			System.out.print("Enter an integer: ");
			// Read the integer from the user
			int num = input.nextInt();
			// Call the checkPowerOfTwo method to determine if the input is a power of two
			boolean isPowerOfTwo = checkPowerOfTwo(num);
			// Print the result to the console
			System.out.println(isPowerOfTwo);
		}
    }

    public static boolean checkPowerOfTwo(int num) {
        // If the input is less than or equal to zero, it cannot be a power of two
        if (num <= 0) {
            return false;
        }
        // Keep dividing the input by 2 until it becomes 1 or less
        while (num > 1) {
            // If the input is not divisible by 2, it cannot be a power of two
            if (num % 2 != 0) {
                return false;
            }
            // Divide the input by 2
            num /= 2;
        }
        // If the input has been successfully divided down to 1, it is a power of two
        return true;
    }
}