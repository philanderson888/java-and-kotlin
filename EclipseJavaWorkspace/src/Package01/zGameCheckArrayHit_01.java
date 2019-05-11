//Test Code

/*
 * Enter a value
 * 		increment numberOfTries
 * 
 * Check status of this value 
 * 
 * If value exists 
 * 		print 'hit'
 * 		mark item as 'hit'
 * 		increment counter
 * 			test if counter = 3 yet
 * 		if counter = 3 then end game with 'you won'
 * 
 * If value does not exist print 'no hit'
 * 
 * 
 * 
 * 
 * 
 * 
 */



package Package01;

import java.util.Scanner;

public class zGameCheckArrayHit_01 {

	public static void main(String[] args) {
		
		int[] myArray = new int[11];
		myArray[4]=1;
		myArray[6]=1;
		myArray[7]=1;
		
		int numberOfTries = 0;
		int numberOfHits = 0;
		
		while(numberOfHits < 3){
			
			System.out.println("Enter a value");
			Scanner in = new Scanner(System.in);
			int guess = in.nextInt();
			numberOfTries++;
		
			if (myArray[guess]==1){
				System.out.println("hit");
				myArray[guess]=2;
				numberOfHits++;
			}
		}
		System.out.println("You succeeded!");
		System.out.println("Number of tries was " + numberOfTries);
	}

}
