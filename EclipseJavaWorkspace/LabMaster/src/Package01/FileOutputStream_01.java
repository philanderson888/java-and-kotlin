/**
 * File Output Stream
 * 
 */

package Package01;

import java.io.IOException;
import java.util.Date;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileOutputStream_01 {

	public static void main(String[] args) {
		String timeAsString = new Date().toString();
		File file = new File("test.txt");

		try{
			FileOutputStream fos = new FileOutputStream(file,true);
			byte[] theBytes = "\n".getBytes("UTF-8");
			byte[] timeAsBytes = timeAsString.getBytes();
			fos.write(timeAsBytes);
			fos.write(theBytes);
			fos.flush();
			fos.close();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String nextLine;
			while((nextLine=br.readLine()) != null){
				System.out.println(nextLine);
			}

			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}

}
