package Package01;

public class Thread_03_Extending extends Thread{

	public void run(){
		System.out.println("Thread is running -- " + this.getState());
		try {
			this.sleep(1000);
		}
		catch(Exception e){}
		finally{
			System.out.println("Thread has finished sleeping - " + this.getState());
		}
	}
	
	public static void main(String[] args) {
		Thread_03_Extending thread = new Thread_03_Extending();
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
	}

}
