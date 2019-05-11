package Package01;


class Parent{
	
	
}

public class HashCode {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p);

		System.out.println(new Object());
		System.out.println(new Object());
		System.out.println(new Object());

		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		System.out.println(p.hashCode());
		System.out.println(new Object().hashCode());
		System.out.println(new Object().hashCode());
		System.out.println(new Object().hashCode());

	}

}



