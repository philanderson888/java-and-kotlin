package Package01;

import java.util.Scanner;

public class Input_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String inputLine = input.nextLine();
		
		System.out.println("you entered " + inputLine);
		
		System.out.println("Enter a number");
		
		int inputNumber = input.nextInt();
		
		System.out.println("you entered " + inputNumber);
		
		
		System.out.println("Enter a decimal number");
		
		double inputDouble = input.nextDouble();
		
		System.out.println("you entered " + inputDouble);
		
		input.close();
		

		
		
		
		
	}

}
