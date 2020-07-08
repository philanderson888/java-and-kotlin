package Package01;
import java.io.File;
import java.util.Scanner;

public class Scanner_File_02 {

	public static void main(String[] args) {
	
		//String path = "bin/Package01/testFileIntegers.txt";
		String path = "testFileIntegers.txt";
		var readFile01 = new File(path);
		try (Scanner input01 = new Scanner(readFile01)){
			while (input01.hasNextLine()) {
				System.out.println(input01.nextInt());
			}
		}
		catch (Exception e) {

		}
	}

}

