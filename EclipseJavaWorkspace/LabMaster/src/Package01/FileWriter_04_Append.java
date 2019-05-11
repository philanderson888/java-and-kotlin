package Package01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Date;

public class FileWriter_04_Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		BufferedWriter bw = null;
		String path = "test.txt";
		Date dateTimeNow = new Date();
		try{
			fw = new FileWriter(path,true);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write("Line to append to text file - " + dateTimeNow.toString());
			bw.flush();
			System.out.println("Completed appending to text file");
			
		}
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		finally{
			try{	
				if(bw != null){
					bw.close();
				}
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
		
		FileReader_03 readFile01 = new FileReader_03(path);
		readFile01.readFile();
		
	}

}
