package Package01;

public class Anonymous_04 implements Runnable{
	public void run(){
		System.out.println("Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Anonymous_04(){}).start();
	}

}
