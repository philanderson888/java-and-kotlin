package Package01;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter name");
		System.out.println("");
		String name = keyboardInput.nextLine();
		System.out.println("Hello " + name);
	}

}
