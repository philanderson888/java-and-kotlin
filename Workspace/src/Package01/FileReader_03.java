package Package01;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReader_03 {

	private String path;
	
	FileReader_03(){
		
	}
	
	FileReader_03(String path){
		this.path = path;
	}
	
	public void readFile(){
		String path = this.path;
		String line = null;
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			try{
				if(br!=null){
					br.close();
				}
				if(fr != null){
					fr.close();
				}
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
	
	

}
