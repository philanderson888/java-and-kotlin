package Package01;

import java.util.Date;

public class FileWriter_06_Append_Read {

	public static void main(String[] args) {
		String path = "test.txt";
		Date timeStamp = new Date();
		FileWriter_05_Append appendToFile01 = new FileWriter_05_Append(path);
		appendToFile01.AppendToFile("ADD ADD ADD Append This Message To File - " + timeStamp, true);
		FileReader_03 readFile01 = new FileReader_03(path);
		readFile01.readFile();
	}
}
