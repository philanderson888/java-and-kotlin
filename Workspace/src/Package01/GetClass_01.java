
/**
 * 
 * @author philipanderson
 *
 * Test is to print out a sub-class of a super-class and in both the child and the parent class,
 * to run the getClass() methods and output the class that the item is a member of
 * So here goes!!!
 *
 */

package Package01;


public class GetClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		System.out.println(p.getClass());
		System.out.println(c.getClass());
		System.out.println(p.getClass().getSuperclass());
		System.out.println(c.getClass().getSuperclass().getSuperclass().getSuperclass());
		System.out.println();
	
		Parent2 p2 = new Parent2();
		Child2 c2 = new Child2();
	
		System.out.println(p2.getClass());
		System.out.println(c2.getClass());
		System.out.println(c2.getClass().getSuperclass());
		System.out.println(c2.getClass().getSuperclass().getSuperclass());
		System.out.println(p2.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(p2.toString());
		System.out.println(c2.toString());
		
	}
	
	static class Parent extends GetClass_01{
		

	}

	static class Child extends Parent{
		

	}
}


class Parent2{
	
}

class Child2 extends Parent2{
	
}