//This is number six
package myJavaProject;
import java.util.Scanner;
public class CountVowels {
	

	  public static void main(String[] args) {

	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a sentence: ");
			String sentence = scanner.nextLine();

			int count = countVowels(sentence);

			System.out.println("Number of vowels: " + count);
		}

	  }

	  public static int countVowels(String str) {
	    
	    int count = 0;

	    // Convert sentence to lower case
	    str = str.toLowerCase();

	    for(int i = 0; i < str.length(); i++){
	      
	      // Get current character
	      char ch = str.charAt(i);

	      // Check if character is a vowel
	      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        count++;
	      }
	    }

	    return count;

	  }
	  
	}

	