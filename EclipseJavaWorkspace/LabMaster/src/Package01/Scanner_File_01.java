package Package01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_File_01 {

	public static void main(String[] args) {
		
		System.out.println("Working Directory = " +
		System.getProperty("user.dir"));
				
		String fileName = "bin/Package01/readMe.txt";
		File textFile = new File(fileName);
		System.out.println("Reading data as strings");
		try (Scanner input01 = new Scanner(textFile)){
			
			while(input01.hasNextLine()) {
				String line = input01.nextLine();
				System.out.println(line);
			}
			input01.close();
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
