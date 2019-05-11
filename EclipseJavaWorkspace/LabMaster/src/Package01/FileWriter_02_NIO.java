package Package01;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWriter_02_NIO {

	public static void main(String[] args) {
		Path path = Paths.get("test.txt");
		BufferedWriter bw = null;
		try{
			bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
			bw.write("First line written of buffered file writer");
			bw.newLine();
			bw.write("second line of buffered file writer");
			bw.newLine();
			System.out.println("Output complete");
			System.out.println(path);
			System.out.println(path.toAbsolutePath());
		}
		catch(FileNotFoundException fnfe){
			
		}
		catch(IOException ioe){
			
		}
		finally{
			
			try{
				if(bw != null){
				bw.close();        //saves the file
				}
			}
			catch(IOException ioe){
				
			}
		}

	}

}
