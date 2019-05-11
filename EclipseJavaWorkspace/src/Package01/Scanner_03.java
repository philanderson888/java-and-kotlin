package Package01;

import java.util.Scanner;

public class Scanner_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		try{
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
		}
		catch(Exception e){
			
		}
		System.out.println(x);
	}

}
