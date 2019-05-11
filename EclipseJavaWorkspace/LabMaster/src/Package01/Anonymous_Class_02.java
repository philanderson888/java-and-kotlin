package Package01;

public class Anonymous_Class_02 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		IUseThis getToWork = new IUseThis(){
			@Override
			public void doSomething() {
				System.out.println("Implementing DoSomething Method Right Here");
			}	
		};
		
		getToWork.doSomething();
	}
}

interface IUseThis{
	public void doSomething();
}
