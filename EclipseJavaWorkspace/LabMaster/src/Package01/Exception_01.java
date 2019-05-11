package Package01;

public class Exception_01 {

	int dividend;
	
	public Exception_01(int dividend){
		this.dividend = dividend;
	}
	
	public void divideNumber(int divisor) throws ArithmeticException{
		try{
			int result = dividend / divisor;
		}
		
		catch(ArithmeticException ex){
			ex.printStackTrace();
		}
	}
		
	public static void main(String args[]){
		Exception_01 error = new Exception_01(10);
		error.divideNumber(0);
		System.out.println("Exception test complete");
	}
}
