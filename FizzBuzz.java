//This is number one

package myJavaProject;

public class FizzBuzz {

		  public static void main(String[] args) {

		    // loop from 1 to 100
		    for(int i=1; i<=100; i++) {

		      // number divisible by 3 and 5  then print FizzBuzz
		      if(i%15 == 0) {
		        System.out.println("FizzBuzz");
		      
		      // number divisible by 3 then print Fizz  
		      } else if(i%3 == 0) {
		        System.out.println("Fizz");

		      // number divisible by 5 then print Buzz
		      } else if(i%5 == 0) {
		        System.out.println("Buzz");

		      // print the number
		      } else {
		        System.out.println(i);
		      }
		    }
		  }
		}
