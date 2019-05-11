package Package01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter_03_With_Reader_NIO {

	public static void main(String[] args) {
		
	
		Path path = Paths.get("test.txt");
		String line = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try{
			fw = new FileWriter("text.txt",true);
			bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
			bw.write("test");
			bw.newLine();
			bw.write("test1");
			bw.newLine();
			bw.append("DEV.SERVER.NAME=mydevserver");
			bw.newLine();
			bw.write("DEV.APPLICATION.URL=http://my-dev-application.url");
			bw.newLine();
			bw.write("TEST.SERVER.NAME=mytestserver");
			bw.newLine();
			bw.write("TEST.APPLICATION.URL=http://test-application.url");
			bw.newLine();
			bw.append("abc");
			bw.newLine();
			
			pw = new PrintWriter (bw);
			pw.println("append to end of buffer");
		}
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		finally{
			
			try{
				if(bw != null){
					bw.close();
				}
				if(pw != null){
					pw.close();
				}
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		
		}
		
		
		
		

		
		
		
		
		try{

			br = Files.newBufferedReader(path, StandardCharsets.UTF_8);
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		}
		
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
