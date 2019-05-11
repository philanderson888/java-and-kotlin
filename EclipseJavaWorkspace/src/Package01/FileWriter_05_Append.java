package Package01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class FileWriter_05_Append{

	private String path;
	
	FileWriter_05_Append(){
		
	}
	FileWriter_05_Append(String path){
		this.path = path;
	}
	public void AppendToFile(String message, boolean append){
		FileWriter fw = null;
		BufferedWriter bw = null;
		String path = this.path;
		try{
			fw = new FileWriter(path,append);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(message);
			bw.flush();
		}
		catch(IOException ioe){
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
