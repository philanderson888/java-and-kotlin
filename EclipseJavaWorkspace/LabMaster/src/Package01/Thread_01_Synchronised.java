package Package01;

public class Thread_01_Synchronised {
	
	private static Thread_01_Synchronised Thread_01_Synchronised = null;
	
	private Thread_01_Synchronised(){}
	
	public synchronized static Thread_01_Synchronised getValue(){
		if(Thread_01_Synchronised == null){
			
			Thread_01_Synchronised = new Thread_01_Synchronised();
		}	
		return Thread_01_Synchronised;
	}
	
	public void log(String message){
		System.out.println(message);
	}


}
