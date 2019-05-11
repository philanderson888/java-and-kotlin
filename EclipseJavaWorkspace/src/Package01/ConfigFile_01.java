// This program reads values from a config file
package Package01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.Iterator;
import java.util.Properties;


public class ConfigFile_01 {

	public static void main(String[] args) {
		String path = "test.txt";
		Properties properties = new Properties();
		try{
			InputStream is = new FileInputStream(path);
			properties.load(is);
			//Get one key
			System.out.println(properties.getProperty("DEV.SERVER.NAME"));
			System.out.println();
			//Get all keys
			Set keys = properties.keySet();
			Iterator<String> it = keys.iterator();
			while(it.hasNext()){
				String key = it.next();
				String value = properties.getProperty(key);
				System.out.println(key + " ==== " + value);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
