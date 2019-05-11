package Package01;

import java.util.Scanner;

public class Scanner_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a value");
		System.out.print("");
		Scanner in = new Scanner(System.in);
		int number = 0;
		boolean numberEntered = false;
		while(numberEntered==false){
			try{
				number = in.nextInt();	
				numberEntered = true;
			}
	
			catch(Exception e){}
		}

		System.out.println(number);
	}
}
