//This is number four
package myJavaProject;
import java.util.Scanner;

public class CapitalizedWords {

	  public static void main(String[] args) {

	    try (// Get input string from user
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();

			// Call capitalize method and print result
			String result = capitalize(input);
			System.out.println(result);
		}
	  }

	  public static String capitalize(String str) {

	    // Split the string into words 
	    String words[] = str.split(" ");
	    
	    // Variable to store capitalized words
	    String capitalizedWords = ""; 

	    // Iterate through all words
	    for(String word : words) {
	      
	      // Get the first letter 
	      String first = word.substring(0, 1);
	      
	      // Get the remaining letters
	      String afterFirst = word.substring(1); 

	      // Capitalize the first letter
	      first = first.toUpperCase();  

	      // Add the capitalized first letter
	      // followed by the remaining letters to the string
	      capitalizedWords += first + afterFirst + " "; 
	    }

	    // Return the capitalized words
	    return capitalizedWords.trim();

	  }


	}


