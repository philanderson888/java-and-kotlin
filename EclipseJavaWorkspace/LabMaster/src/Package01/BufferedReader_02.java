package Package01;


import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedReader_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = null;
		try{
			x = br.readLine();
		}
		catch(Exception e){	
		}
		System.out.println(x);
	}

}
