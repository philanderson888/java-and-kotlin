package Package01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ConfigFile_02_Rewrite_05 {

	public static void main(String[] args) {
		File inputFile = new File("config.txt");
		int nextNumber = 0;
		char nextChar;
		int finalNumber;
		try{
			FileInputStream fis = new FileInputStream(inputFile);
			StringBuffer buffer = new StringBuffer();
			while((nextNumber=fis.read()) != -1){
				buffer.append((char)nextNumber);
			}
			finalNumber=Integer.parseInt(buffer.toString().trim());
			System.out.println(finalNumber);
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

}
