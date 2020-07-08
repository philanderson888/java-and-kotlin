package Package01;

public class Error_01 {
	
	public void callA(){
		callB();
	}
	
	public void callB(){
		callA();
	}
	
	public static void main(String args[]){
		
		Error_01 myError = new Error_01();
		// This generates an error by calling A which calls B for ever, causing Stack Overflow
		myError.callA();
	}

}
