package Package01;

public class Thread_02_Runnable_02 implements Runnable{
	
	public void run(){
		System.out.println("Thread is running -- " + this.toString());
	}

	public static void main(String[] args) {
		Thread_02_Runnable_02 instance = new Thread_02_Runnable_02();
		Thread thread = new Thread(instance);
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());
		

	}

}
