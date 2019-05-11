package Package01;

public class Anonymous_Class_01 {

	public static void main(String[] args) {
	
		Parent01 p = new Parent01() {
			@Override
			public void myMethod() {
				System.out.println("Overriding MyMethod With Anonymous Class Object");
				
			}
			
			
		};
		p.myMethod();
		

	}

}

class Parent01{
	
	public void myMethod() {
		System.out.println("In MyMethod");
	}
	
	
}
