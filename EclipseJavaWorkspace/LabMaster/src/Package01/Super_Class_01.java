package Package01;

public class Super_Class_01 {

	public static void main(String[] args) {
		Parent02 p = new Parent02();
		Child02 c = new Child02();
		p.print();
		c.print();
		
	}

}


class Parent02{
	void print(){
		System.out.println("Parent Prints");
	}
}

class Child02 extends Parent02{
	@Override
	void print(){
		super.print();
		System.out.println("Child Prints");
	}
}
