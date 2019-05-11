package Package01;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;

public class File_Write_01 {

	public static void main(String[] args) {
		
		WriteFile data = new WriteFile("bin/Package01/testFile.txt",true);
		try {
			data.writeToFile("test text " + new Date() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		//data = new WriteFile("bin/Package01/testFileIntegers.txt",true);
        data = new WriteFile("testFileIntegers.txt",true);


        try {
			int counter = 0;
			while (counter<15) {
                String output01 = Integer.toString(counter);
                data.writeToFile(output01 + "\n\r");
                System.out.println(output01);
                counter++;
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class WriteFile {

	private String path;
	private boolean append_to_file = false;

	public WriteFile(String path) {
		this.path = path;
	}

	public WriteFile(String path, boolean append_to_file) {
		this.path = path;
		this.append_to_file = append_to_file;
	}
	
	public void writeToFile(String textLine) throws IOException{
		var fileWrite = new FileWriter(path, append_to_file);
		var sendLine = new PrintWriter(fileWrite);
		sendLine.printf("%s" + "%n", textLine);     //%s is a string, %n is new line
		sendLine.close();
	}
}
