package Package01;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class File_Write_02 {

	public static void main(String[] args) {
		String path = "bin/Package01/testFileIntegers.txt";
		boolean append_to_file = true;
		FileWriter fileWriter;
		int counter = 0;
		try {
			counter++;
			fileWriter = new FileWriter(path, append_to_file);
			var printLine = new PrintWriter(fileWriter);
			printLine.printf("%s" + "%n",  counter);
			printLine.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
