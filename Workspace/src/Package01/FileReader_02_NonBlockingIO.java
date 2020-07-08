package Package01;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader_02_NonBlockingIO {

	public static void main(String[] args) {
		String line = null;
		Path path = Paths.get("test.txt");
		BufferedReader br = null;
		
		try{
			br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		}
		
		
		catch(IOException ioe){
			System.out.print(ioe.getStackTrace());
			System.out.print(ioe.getMessage());
		}
		
		
		finally{
			
			try{
				if(br!=null){
					br.close();
				}
			}
			catch(IOException ioe){
				ioe.getMessage();
				ioe.getStackTrace();
			}
		}
	}
}
