package Package01;

import java.io.*;

public class Serializable_01_test {

	public static void main(String[] args) {
		String path = "Movie.ser";
		Serializable_01 newSerializable01 = new Serializable_01("Rocky II",2015,"Hollywood");
		try{
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(newSerializable01);
			os.close();
			fos.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			FileReader_03 readFile01 = new FileReader_03(path);
			readFile01.readFile();
		}
		//read
		try{
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream is = new ObjectInputStream(fis);
			Serializable_01 testObject01 = (Serializable_01) is.readObject();
			System.out.println(testObject01.getName());
			System.out.println(testObject01.getYearProduced());
			System.out.println(testObject01.getStudio() + " - note that this is null because the field was not serialized");			
		}
		catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
