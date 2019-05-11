// Creates a directory
// Lists files and folders in a directory

package Package01;

import java.io.*;

public class File_01 {

	public static void main(String[] args) {
		//Create directory
		File dir = new File("Test Folder");
		dir.mkdir();
		
		//Absolute path
		System.out.println(dir.getAbsolutePath());
		
		//List contents
		if (dir.isDirectory()){
			String[] dirContents = dir.list();
			
			for(int i = 0; i < dirContents.length; i++){
				System.out.println(dirContents[i]);
			}
		}

	}

}
