package Package01;

import java.io.*;

public class FileWriter_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String filename = "test.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try{
			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			bw.write("output from line 1..");
			bw.newLine();
			bw.write("output from line 2");
			bw.newLine();
			System.out.println("Writing to text file complete");
			
		}
		
		catch (IOException ioe){
			ioe.printStackTrace();
		}
		
		finally{
			try{
				if(bw != null){
					bw.close();
				}
				if(fw != null){
					fw.close();
				}
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}

	}

}
