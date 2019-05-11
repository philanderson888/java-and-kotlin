/**
 * 
 * FileReader_01
 * 
 * By Phil Anderson
 * 
 * Javadoc comments
 * 
 * November 2015
 * 
 */

// Comment

/* Comment 2 */

package Package01;

import java.io.*;

public class FileReader_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename= "test.txt";
		String line = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			while ((line=br.readLine()) != null){
				System.out.println(line);
			}
		}
		catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch (IOException ioe){
			ioe.printStackTrace();
		}
		
		finally{
			
			try{
				if(fr != null){
					fr.close();
				}
				if(br != null){
					br.close();
				}
			}
			catch (Exception ex){
				ex.printStackTrace();
			}
			
	
		}

	}

}
